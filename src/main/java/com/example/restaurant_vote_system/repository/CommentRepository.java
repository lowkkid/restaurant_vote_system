package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CommentRepository {

    /**
     *
     * @return null if updated comment does not belong to userId or restaurantId.
     */
    Comment save(Comment comment, int userId, int restaurantId);

    /**
     *
     * @return false if comment does not belong to userId or restaurantId.
     */
    boolean delete(int id, int userId,int restaurantId);

    /**
     *
     * @return null if comment does not belong to userId or restaurantId.
     */
    Comment get(int id, int userId,int restaurantId);

    /**
     * @return list of comments for given restaurant ordered DESC
     */
    List<Comment> getAll(int restaurantId);
}
