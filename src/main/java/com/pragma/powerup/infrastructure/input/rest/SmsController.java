package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.SmsRequestDto;
import com.pragma.powerup.application.handler.ISmsHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sms")
@RequiredArgsConstructor
public class SmsController {
    private final ISmsHandler smsHandler;
    @PostMapping(value = "/")
    public ResponseEntity<String> sendSMS(@RequestBody SmsRequestDto smsRequestDto) {
        return new ResponseEntity<>(smsHandler.sendSms(smsRequestDto), HttpStatus.OK);
    }
}
