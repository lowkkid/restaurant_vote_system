package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Restaurant extends AbstractNamedEntity {

    private List<Vote> voteList;

    private List<Dish> menu;

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Restaurant() {

    }
}
