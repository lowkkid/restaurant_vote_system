package com.example.restaurant_vote_system.service;


import com.example.restaurant_vote_system.model.Comment;
import com.example.restaurant_vote_system.repository.CommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.example.restaurant_vote_system.util.ValidationUtil.checkNotFoundWithId;

@Service
public class CommentService {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public Comment get(int id, int userId, int restaurantId) {
        return checkNotFoundWithId(repository.get(id,userId ,restaurantId), id);
    }

    public void delete(int id, int userId, int restaurantId) {
        checkNotFoundWithId(repository.delete(id, userId, restaurantId), id);
    }

    public List<Comment> getAll(int userId, int restaurantId) {
        return repository.getAll(restaurantId);
    }

    public void update(Comment comment, int userId, int restaurantId) {
        Assert.notNull(comment, "Comment must not be null");
        checkNotFoundWithId(repository.save(comment, userId, restaurantId), comment.id());
    }

    public Comment create(Comment comment, int userId, int restaurantId) {
        Assert.notNull(comment, "Comment must not be null");
        return repository.save(comment, userId, restaurantId);
    }
}
