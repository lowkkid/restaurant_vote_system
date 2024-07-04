package com.example.restaurant_vote_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="restaurant")
public class Restaurant extends AbstractNamedBaseEntity {

    @OneToMany(mappedBy = "restaurant")
    private List<Vote> voteList;

    @OneToMany(mappedBy = "restaurant")
    private List<Dish> menu;

    @OneToMany(mappedBy = "restaurant")
    private List<Comment> comments;

}
