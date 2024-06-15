package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class Vote extends AbstractEntity {

    private User user;

    private LocalDateTime dateTime;

    private Restaurant restaurant;
}
