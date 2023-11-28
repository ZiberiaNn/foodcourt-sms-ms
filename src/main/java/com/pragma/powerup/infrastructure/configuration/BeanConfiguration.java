package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.ISmsServicePort;
import com.pragma.powerup.domain.spi.*;
import com.pragma.powerup.domain.usecase.SmsUseCase;
import com.pragma.powerup.infrastructure.out.feign.adapter.UserFeignAdapter;
import com.pragma.powerup.infrastructure.out.feign.client.IUserFeignClient;
import com.pragma.powerup.infrastructure.out.feign.mapper.IUserResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserResponseMapper userEntityMapper;
    private final IUserFeignClient userFeignClient;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserFeignAdapter(userFeignClient, userEntityMapper);
    }
    @Bean
    public ISmsServicePort smsServicePort() {
        return new SmsUseCase();
    }
}