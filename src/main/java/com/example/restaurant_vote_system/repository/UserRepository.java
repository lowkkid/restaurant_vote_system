package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {

    User save(User user);

    boolean delete(int id);

    User get(int id);

    User getByName(String name);

    List<User> getAll();
}
