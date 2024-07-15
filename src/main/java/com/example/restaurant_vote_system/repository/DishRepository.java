package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public interface DishRepository {

    /**
     * @return null, if updated dish does not belong to restaurantId.
     */
    Dish save(Dish dish, int restaurantId);

    /**
     * @return false if dish does not belong to restaurantId.
     */
    boolean delete(int id, int restaurantId);

    /**
     * @return null if dish does not belong to restaurantId.
     */
    Dish get(int id, int restaurantId);

    /**
     * @return list of dishes, ordered by name.
     */
    List<Dish> getAll(int restaurantId);

}
