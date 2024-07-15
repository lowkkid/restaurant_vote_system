package com.example.restaurant_vote_system.repository.jpa;

import com.example.restaurant_vote_system.model.Dish;
import com.example.restaurant_vote_system.model.Restaurant;
import com.example.restaurant_vote_system.repository.DishRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class JpaDishRepository implements DishRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public Dish save(Dish dish, int restaurantId) {
        dish.setRestaurant(em.getReference(Restaurant.class, restaurantId));
        if (dish.isNew()) {
            em.persist(dish);
            return dish;
        }
        return get(dish.id(), restaurantId) == null ? null : em.merge(dish);
    }

    @Override
    public boolean delete(int id, int restaurantId) {
        return em.createNamedQuery(Dish.DELETE)
                .setParameter("id", id)
                .setParameter("restaurantId", restaurantId)
                .executeUpdate() > 0;
    }

    @Override
    public Dish get(int id, int restaurantId) {
        Dish dish = em.find(Dish.class, id);
        return dish != null && dish.getRestaurant().getId() == restaurantId ? dish : null;
    }

    @Override
    public List<Dish> getAll(int restaurantId) {
        return em.createNamedQuery(Dish.ALL_SORTED, Dish.class)
                .setParameter("restaurantId", restaurantId)
                .getResultList();
    }
}
