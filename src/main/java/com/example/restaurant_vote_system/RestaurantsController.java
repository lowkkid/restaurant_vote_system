package com.example.restaurant_vote_system;


import com.example.restaurant_vote_system.model.Restaurant;
import com.example.restaurant_vote_system.repository.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Arrays;

@Controller
public class RestaurantsController {

    RestaurantsRepository restaurantsRepository;

    @Autowired
    public RestaurantsController(RestaurantsRepository restaurantsRepository) {
        this.restaurantsRepository = restaurantsRepository;
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "restaurants";
    }

    @ModelAttribute(name = "restaurants_list")
    public List<Restaurant> addRestaurantList(Model model) {
        return (List<Restaurant>) restaurantsRepository.getAll();
    }
}
