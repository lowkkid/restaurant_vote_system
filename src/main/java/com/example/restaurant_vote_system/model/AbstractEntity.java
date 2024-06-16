package com.example.restaurant_vote_system.model;


import lombok.Data;


@Data
public abstract class AbstractEntity {

    protected Integer id;

    public boolean isNew() {
        return this.id == null;
    }
}
