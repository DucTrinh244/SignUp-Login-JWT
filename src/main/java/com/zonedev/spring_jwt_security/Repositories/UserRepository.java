package com.zonedev.spring_jwt_security.Repositories;

import com.zonedev.spring_jwt_security.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    User findFirstByEmail(String email);
}
