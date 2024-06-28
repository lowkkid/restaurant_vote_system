package com.example.restaurant_vote_system.repository;

import com.example.restaurant_vote_system.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {

}
