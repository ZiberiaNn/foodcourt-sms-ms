package com.pragma.powerup.application.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsRequestDto {
    @Schema(example = "Hello, this is a test message")
    private String message;
    @Schema(example = "+573001234567")
    private String destinationPhoneNumber;
}
