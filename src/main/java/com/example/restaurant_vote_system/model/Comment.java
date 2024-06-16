package com.example.restaurant_vote_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "comments")
public class Comment extends AbstractEntity {

    private final String text;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private final User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private final Restaurant restaurant;

    private final LocalDateTime dateTime;
}
