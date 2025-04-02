package com.zonedev.spring_jwt_security.dtos;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;;
    private String password;

}
