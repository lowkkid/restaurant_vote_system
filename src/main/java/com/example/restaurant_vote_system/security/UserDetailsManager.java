package com.example.restaurant_vote_system.security;

import com.example.restaurant_vote_system.model.User;
import com.example.restaurant_vote_system.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailsManager
        implements UserDetailsService {


    private final UserRepository userRepository;

    @Autowired
    public UserDetailsManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

       User user = userRepository.getByName(username);

        if (user != null) {
            return new AuthUser(user);
        }

        throw new UsernameNotFoundException(
                "User '" + username + "' not found");
    }

}