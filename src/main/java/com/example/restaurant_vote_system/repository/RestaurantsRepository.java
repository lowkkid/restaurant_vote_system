package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Restaurant;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface RestaurantsRepository {

    Restaurant save(Restaurant restaurant);

    void delete(int id);

    Restaurant get(int id);

    List<Restaurant> getAll();
}
