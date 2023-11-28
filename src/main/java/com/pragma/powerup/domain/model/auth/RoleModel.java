package com.pragma.powerup.domain.model.auth;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RoleModel {
    private Long id;
    private String name;
}

