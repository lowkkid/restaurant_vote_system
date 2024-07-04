package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {

}
