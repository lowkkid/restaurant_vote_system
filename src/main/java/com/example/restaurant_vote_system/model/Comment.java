package com.example.restaurant_vote_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = Comment.DELETE, query = "DELETE FROM Comment c WHERE c.id=:id AND c.restaurant.id=:restaurantId AND c.user.id=:userId"),
        @NamedQuery(name = Comment.ALL_SORTED, query = "SELECT c FROM Comment c WHERE c.restaurant.id=:restaurantId ORDER BY c.dateTime DESC"),
})
@Entity
@Table(name = "comment")
public class Comment extends AbstractBaseEntity {

    public static final String DELETE = "Comment.delete";

    public static final String ALL_SORTED = "Comment.getAllSorted";

    @NotBlank
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    private LocalDateTime dateTime;
}
