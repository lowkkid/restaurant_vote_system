package com.example.restaurant_vote_system.service;

import com.example.restaurant_vote_system.model.User;
import com.example.restaurant_vote_system.repository.UserRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.example.restaurant_vote_system.util.ValidationUtil.checkNotFound;
import static com.example.restaurant_vote_system.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    //@CacheEvict(value = "users", allEntries = true)
    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return repository.save(user);
    }

    //@CacheEvict(value = "users", allEntries = true)
    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public User get(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public User getByName(String name) {
        Assert.notNull(name, "Name must not be null");
        return checkNotFound(repository.getByName(name), "name=" + name);
    }

    //@Cacheable("users")
    public List<User> getAll() {
        return repository.getAll();
    }

    //@CacheEvict(value = "users", allEntries = true)
    public void update(User user) {
        Assert.notNull(user, "user must not be null");
        checkNotFoundWithId(repository.save(user), user.id());
    }
}
