package com.example.restaurant_vote_system.security;

import com.example.restaurant_vote_system.model.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@Slf4j
public class RegistrationForm {

    private String username;

    private String email;

    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        log.info("Accepted values:" + username + ", " + email + ", " + password);
//        return new User(
//                username,
//                email ,
//                passwordEncoder.encode(password));
        return null;
    }
}