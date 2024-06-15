package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Dish extends AbstractNamedEntity {

    private Long price;

    Restaurant restaurant;

}
