package com.zonedev.spring_jwt_security.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;;
    private String name;
    private String email;
    private String password;
    private String phone;
}
