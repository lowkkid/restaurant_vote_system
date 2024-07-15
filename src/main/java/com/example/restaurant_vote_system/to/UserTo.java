package com.example.restaurant_vote_system.to;

import com.example.restaurant_vote_system.model.Role;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class UserTo {
    private final String name;
    private final String password;
    private final Set<Role> roles;
    private final LocalDateTime voteTime;
    private final boolean availableToVote;

    public UserTo(String name, String password, Set<Role> roles, LocalDateTime voteTime, boolean availableToVote) {
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.availableToVote = availableToVote;
        this.voteTime = voteTime;
    }
}
