package com.example.restaurant_vote_system;


import com.example.restaurant_vote_system.model.Comment;
import com.example.restaurant_vote_system.model.Restaurant;
import com.example.restaurant_vote_system.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RestaurantsController {

    private final RestaurantRepository restaurantRepository;


    @Autowired
    public RestaurantsController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "restaurants";
    }

    @ModelAttribute(name = "restaurants_list")
    public List<Restaurant> addRestaurantList(Model model) {
        return restaurantRepository.getAll();
    }


    @ModelAttribute(name = "comments_for_first")
    public List<Comment> getCommentsForFirst(Model model) {
        return null;
    }



}
