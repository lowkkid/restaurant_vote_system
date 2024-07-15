DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS vote;
DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS dish;
DROP TABLE IF EXISTS restaurant;

DROP SEQUENCE IF EXISTS user_seq;
DROP SEQUENCE IF EXISTS restaurant_seq;
DROP SEQUENCE IF EXISTS dish_seq;
DROP SEQUENCE IF exists comment_seq;

CREATE SEQUENCE user_seq START WITH 100000;
CREATE SEQUENCE restaurant_seq START WITH 200000;
CREATE SEQUENCE dish_seq START WITH 300000;
CREATE SEQUENCE comment_seq START WITH 400000;

CREATE TABLE restaurant
(
    id INTEGER PRIMARY KEY DEFAULT nextval('restaurant_seq'),
    name VARCHAR            NOT NULL
);

CREATE TABLE users
(
    id INTEGER PRIMARY KEY DEFAULT nextval('user_seq'),
    name VARCHAR            NOT NULL,
    email VARCHAR           NOT NULL,
    password VARCHAR        NOT NULL
);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE user_role
(
    user_id INTEGER         NOT NULL,
    role    VARCHAR         NOT NULL,
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE comment
(
    id INTEGER PRIMARY KEY DEFAULT nextval('comment_seq'),
    text VARCHAR            NOT NULL,
    user_id INTEGER         NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    date_time   TIMESTAMP   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
);

CREATE TABLE vote
(
    id INTEGER PRIMARY KEY,
    restaurant_id INTEGER   NOT NULL,
    date_time timestamp     NOT NULL,
    FOREIGN KEY (id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
);

CREATE TABLE dish
(
    id INTEGER PRIMARY KEY DEFAULT nextval('dish_seq'),
    name VARCHAR            NOT NULL,
    price NUMERIC(7,2)          NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
)

