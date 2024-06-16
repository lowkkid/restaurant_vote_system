package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Comment;
import com.example.restaurant_vote_system.model.Dish;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository {

    Comment save(Comment comment, int id, int userId, int restaurantId);

    void delete(int id, int userId, int restaurantId);

    void get(int id, int userId, int restaurantId);

    void getAll(int restaurantId);

}
