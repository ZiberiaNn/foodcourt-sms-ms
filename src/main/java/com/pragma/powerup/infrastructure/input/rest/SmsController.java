package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.SmsRequestDto;
import com.pragma.powerup.application.handler.ISmsHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sms")
@RequiredArgsConstructor
public class SmsController {
    private final ISmsHandler smsHandler;
    @Operation(summary = "Sends SMS to a phone number")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully sent SMS",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content)
    })
    @PreAuthorize("hasRole(" +
            "T(com.pragma.powerup.domain.model.auth.enums.RoleEnum).EMPLOYEE.toString()" +
            ")")
    @PostMapping(value = "/")
    public ResponseEntity<String> sendSMS(@RequestBody SmsRequestDto smsRequestDto) {
        return new ResponseEntity<>(smsHandler.sendSms(smsRequestDto), HttpStatus.OK);
    }
}
