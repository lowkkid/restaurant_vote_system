package com.example.restaurant_vote_system.model;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@Data
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    protected Integer id;

    public boolean isNew() {
        return this.id == null;
    }
}
