package com.zonedev.spring_jwt_security.Services;

import com.zonedev.spring_jwt_security.Models.User;
import com.zonedev.spring_jwt_security.dtos.SignupRequest;
import com.zonedev.spring_jwt_security.dtos.UserDTO;

public interface AuthService {
    UserDTO creatUser(SignupRequest signupRequest);
}
