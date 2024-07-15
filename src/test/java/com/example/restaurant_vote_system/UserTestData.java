package com.example.restaurant_vote_system;

import com.example.restaurant_vote_system.model.Role;
import com.example.restaurant_vote_system.model.User;

import java.util.Collections;
import java.util.Date;

public class UserTestData {

    public static final MatcherFactory.Matcher<User> USER_MATCHER = MatcherFactory.usingIgnoringFieldsComparator("vote");

    private static final int START_SEQ = 100000;

    public static final int USER_ID = START_SEQ;

    public static final int ADMIN_ID = START_SEQ + 1;

    public static final int GUEST_ID = START_SEQ + 2;

    public static final int NOT_FOUND = 100;

    public static final User user;

    public static final User admin;

    public static final User guest;

    static {
        user = new User(100000,
                "user",
                "user@yandex.ru",
                "2a$05$omj2mGENW6VQcV9vjyLPDenwk0kpR7hug1xC43y8CCVHyiv6XpyTm",
                Role.USER);
        admin = new User(100001,
                "admin",
                "admin@gmail.com",
                "$2a$05$rNORv1TD0yT8HfGeX5Eb8.y4QGdnMFieTX2ulfRRWpGvtV1w8KHia",
                Role.ADMIN, Role.USER);
        guest = new User(100002,
                "guest",
                "guest@gmail.com",
                "guest");
    }

    public static User getNew() {
        return new User(null,
                "New",
                "new@gmail.com",
                "newPass", Role.USER);
    }

    public static User getUpdated() {
        User updated = new User(user);
        updated.setEmail("update@gmail.com");
        updated.setName("UpdatedName");
        updated.setPassword("newPass");
        updated.setRoles(Collections.singletonList(Role.ADMIN));
        return updated;
    }

}
