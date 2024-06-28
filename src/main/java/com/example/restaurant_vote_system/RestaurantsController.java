package com.example.restaurant_vote_system;


import com.example.restaurant_vote_system.model.Comment;
import com.example.restaurant_vote_system.model.Restaurant;
import com.example.restaurant_vote_system.repository.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RestaurantsController {

    private final RestaurantsRepository restaurantsRepository;


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
        return restaurantsRepository.findAll();
    }


    @ModelAttribute(name = "comments_for_first")
    public List<Comment> getCommentsForFirst(Model model) {
        return restaurantsRepository.findAll().get(0).getComments();
    }



}
