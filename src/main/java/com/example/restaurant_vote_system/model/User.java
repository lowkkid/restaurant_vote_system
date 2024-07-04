package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends AbstractNamedBaseEntity {

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "Wrong email")
    @NotBlank
    @Size(max = 128)
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank
    @Size(min = 5, max = 30, message = "Password length must be from 5 to 30 characters")
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "role"}, name = "uk_user_role")})
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    private Vote vote;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

        Set<Role> roles = new HashSet<>();
        roles.add(Role.USER);

        this.roles = roles;
    }
}
