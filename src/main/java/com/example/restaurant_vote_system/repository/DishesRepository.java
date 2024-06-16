package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DishesRepository extends JpaRepository<Dish, Integer> {

}
