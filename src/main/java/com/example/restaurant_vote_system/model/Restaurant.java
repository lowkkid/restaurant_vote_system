package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NamedQueries({
        @NamedQuery(name = Restaurant.DELETE, query = "DELETE FROM Restaurant r WHERE r.id=:id"),
        @NamedQuery(name = Restaurant.ALL_SORTED, query = "SELECT r FROM Restaurant r ORDER BY r.name"),
})
@Entity
@Table(name="restaurant")
public class Restaurant extends AbstractNamedEntity {

    public static final String DELETE = "Restaurant.delete";

    public static final String ALL_SORTED = "Restaurant.getAllSorted";

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private List<Vote> voteList;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private List<Dish> menu;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private List<Comment> comments;

}
