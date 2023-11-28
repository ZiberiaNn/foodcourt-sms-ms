package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.ISmsServicePort;
import com.pragma.powerup.domain.usecase.SmsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public ISmsServicePort smsServicePort() {
        return new SmsUseCase();
    }
}