package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class Comment extends AbstractEntity {

    private String text;

    private User user;

    private Restaurant restaurant;

    private LocalDateTime dateTime;
}
