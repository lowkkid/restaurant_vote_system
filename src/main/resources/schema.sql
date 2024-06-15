DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS dishes;
DROP TABLE IF EXISTS votes;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;



CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE restaurants
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

CREATE TABLE comments
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    text VARCHAR            NOT NULL,
    user_id INTEGER         NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    date_time   TIMESTAMP   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE
);

CREATE TABLE votes
(
    id INTEGER PRIMARY KEY,
    restaurant_id INTEGER   NOT NULL,
    date_time timestamp     NOT NULL,
    FOREIGN KEY (id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE
);

CREATE TABLE dishes
(
    id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR            NOT NULL,
    price NUMERIC(7,2)          NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE
)

