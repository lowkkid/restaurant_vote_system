package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends AbstractNamedEntity {

    @Email
    private String email;

    @Size(min = 6, max = 20)
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "role"}, name = "uk_user_role")})
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @OneToOne(mappedBy = "user")
    private Vote vote;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

        Set<Role> roles = new HashSet<>();
        roles.add(Role.USER);

        this.roles = roles;
    }
}
