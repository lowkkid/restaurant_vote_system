package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Dish;
import org.springframework.stereotype.Repository;

@Repository
public interface DishesRepository {
    Dish save(Dish dish, int restaurantId);

    void delete(int dishId, int restaurantId);

    void get(int dishId, int restaurantId);

    void getAll(int restaurantId);

}
