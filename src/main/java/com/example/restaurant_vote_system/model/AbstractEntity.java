package com.example.restaurant_vote_system.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@MappedSuperclass
public abstract class AbstractEntity {

    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    protected Integer id;

    public boolean isNew() {
        return this.id == null;
    }
}
