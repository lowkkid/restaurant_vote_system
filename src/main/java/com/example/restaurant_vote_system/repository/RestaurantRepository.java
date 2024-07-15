package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    boolean delete(int id);

    Restaurant get(int id);

    List<Restaurant> getAll();

}
