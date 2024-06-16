package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "votes")
public class Vote extends AbstractEntity {

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private final User user;

    private final LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private final Restaurant restaurant;
}
