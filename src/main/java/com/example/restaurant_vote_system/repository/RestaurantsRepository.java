package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Restaurant;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface RestaurantsRepository extends JpaRepository<Restaurant, Integer> {

}
