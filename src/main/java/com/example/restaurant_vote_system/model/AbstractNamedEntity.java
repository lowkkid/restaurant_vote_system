package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AbstractNamedEntity extends AbstractEntity {

    protected String name;
}
