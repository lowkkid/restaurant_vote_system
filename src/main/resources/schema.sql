DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS dishes;
DROP TABLE IF EXISTS votes;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS dish;
DROP TABLE IF EXISTS vote;
DROP TABLE IF EXISTS restaurant;
DROP SEQUENCE IF EXISTS global_seq;


CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE restaurant
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR            NOT NULL
);

CREATE TABLE users
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR            NOT NULL,
    email VARCHAR           NOT NULL,
    password VARCHAR        NOT NULL
);

CREATE TABLE user_role
(
    user_id INTEGER         NOT NULL,
    role    VARCHAR         NOT NULL,
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE comment
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
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
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR            NOT NULL,
    price NUMERIC(7,2)          NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
)

