package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Integer> {


}
