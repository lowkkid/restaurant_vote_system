package com.example.restaurant_vote_system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Restaurant extends AbstractNamedEntity {

    List<Vote> voteList;

    List<Dish> menu;
}
