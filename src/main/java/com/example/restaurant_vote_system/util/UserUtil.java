package com.example.restaurant_vote_system.util;

import com.example.restaurant_vote_system.model.User;
import com.example.restaurant_vote_system.model.Vote;
import com.example.restaurant_vote_system.to.UserTo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class UserUtil {

    public static UserTo createTo(User user) {
        return new UserTo(
                user.getName(),
                user.getPassword(),
                user.getRoles(),
                user.getVote().getDateTime(),
                canVote(user.getVote().getDateTime(), LocalDate.now(), LocalTime.of(11, 0,0)));
    }

    public static List<UserTo> createTos(List<User> users) {
        List<UserTo> userTos = new ArrayList<>();
        for (User user : users) {
            userTos.add(createTo(user));
        }
        return userTos;
    }

    private static boolean canVote(LocalDateTime voteTime, LocalDate boundaryDate, LocalTime boundaryTime) {
        LocalDateTime boundaryDateTime = LocalDateTime.of(
                boundaryDate.getYear(),
                boundaryDate.getMonth(),
                boundaryDate.getDayOfMonth(),
                boundaryTime.getHour(),
                boundaryTime.getMinute(),
                boundaryTime.getSecond()
                );
        return voteTime.isBefore(boundaryDateTime);
    }
}
