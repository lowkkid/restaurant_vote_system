package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    User save(User user);

    void delete(int id);

    User get(int id);

    List<User> getAll();
}
