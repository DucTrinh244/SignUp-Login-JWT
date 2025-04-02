package com.zonedev.spring_jwt_security.Controller;

import com.zonedev.spring_jwt_security.Services.AuthService;
import com.zonedev.spring_jwt_security.dtos.SignupRequest;
import com.zonedev.spring_jwt_security.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupUserController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest){
        UserDTO creatuser =authService.creatUser(signupRequest);
        if(creatuser == null)
            return new ResponseEntity<>("User is not created, try again ", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(creatuser,HttpStatus.CREATED);
    }

}
