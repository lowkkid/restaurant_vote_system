package com.example.restaurant_vote_system.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class AbstractNamedEntity extends AbstractEntity {

    protected String name;
}
