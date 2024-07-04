package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
