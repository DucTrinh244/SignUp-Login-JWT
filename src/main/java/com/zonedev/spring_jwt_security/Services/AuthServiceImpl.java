package com.zonedev.spring_jwt_security.Services;

import com.zonedev.spring_jwt_security.Models.User;
import com.zonedev.spring_jwt_security.Repositories.UserRepository;
import com.zonedev.spring_jwt_security.dtos.SignupRequest;
import com.zonedev.spring_jwt_security.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO creatUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setPhone(signupRequest.getPhone());

       User createUser= userRepository.save(user);
       UserDTO userDTO= new UserDTO();
        userDTO.setEmail(createUser.getEmail());
        userDTO.setName(createUser.getName());
        userDTO.setPhone(createUser.getPhone());
        return userDTO;
    }
}
