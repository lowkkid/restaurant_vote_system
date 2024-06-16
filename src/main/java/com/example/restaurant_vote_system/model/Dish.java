package com.example.restaurant_vote_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "dishes")
public class Dish extends AbstractNamedEntity {

    private final Long price;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private final Restaurant restaurant;

}
