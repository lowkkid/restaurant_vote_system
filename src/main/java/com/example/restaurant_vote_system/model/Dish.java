package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "dish")
public class Dish extends AbstractNamedBaseEntity {

    @Column(name = "price")
    private final Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private final Restaurant restaurant;

}
