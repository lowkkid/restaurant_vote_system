package com.example.restaurant_vote_system.repository.jpa;

import com.example.restaurant_vote_system.model.Comment;
import com.example.restaurant_vote_system.model.Restaurant;
import com.example.restaurant_vote_system.model.User;
import com.example.restaurant_vote_system.repository.CommentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaCommentRepository implements CommentRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Comment save(Comment comment, int userId, int restaurantId) {
        comment.setUser(em.getReference(User.class, userId));
        comment.setRestaurant(em.getReference(Restaurant.class, restaurantId));
        if (comment.isNew()) {
            em.persist(comment);
            return comment;
        } else {
            return em.merge(comment);
        }
    }

    @Override
    public boolean delete(int id, int userId, int restaurantId) {
        return em.createNamedQuery(Comment.DELETE)
                .setParameter("id", id)
                .setParameter("userId", userId)
                .setParameter("restaurantId", restaurantId)
                .executeUpdate() > 0;
    }

    @Override
    public Comment get(int id, int userId, int restaurantId) {
        Comment comment = em.find(Comment.class, id);
        return comment != null
                && comment.getRestaurant().getId() == restaurantId
                && comment.getUser().getId() == userId
                ? comment : null;
    }

    @Override
    public List<Comment> getAll(int restaurantId) {
        return em.createNamedQuery(Comment.ALL_SORTED, Comment.class)
                .setParameter("restaurantId", restaurantId)
                .getResultList();
    }
}
