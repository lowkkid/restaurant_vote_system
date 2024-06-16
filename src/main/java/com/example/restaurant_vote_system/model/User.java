package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private Set<Role> roles;

    private Vote vote;

}
