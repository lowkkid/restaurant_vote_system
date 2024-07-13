package com.example.restaurant_vote_system.to;

import com.example.restaurant_vote_system.model.Role;

import java.time.LocalDateTime;
import java.util.Set;

public class UserTo {
    private final String name;
    private final String password;
    private final Set<Role> roles;
    private final boolean availableToVote;
    private final LocalDateTime voteTime;

    public UserTo(String name, String password, Set<Role> roles, boolean availableToVote, LocalDateTime voteTime) {
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.availableToVote = availableToVote;
        this.voteTime = voteTime;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public boolean isAvailableToVote() {
        return availableToVote;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }
}
