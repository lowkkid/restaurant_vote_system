DELETE FROM comment;
DELETE FROM vote;
DELETE FROM user_role;
DELETE FROM users;
DELETE FROM dish;
DELETE FROM restaurant;

ALTER SEQUENCE user_seq RESTART WITH 100000;
ALTER SEQUENCE restaurant_seq RESTART WITH 200000;
ALTER SEQUENCE dish_seq RESTART WITH 300000;
ALTER SEQUENCE comment_seq RESTART WITH 400000;

INSERT INTO restaurant (name) VALUES
                                       ('Sunrise Bistro'),
                                       ('Ocean Breeze Café'),
                                       ('Mountain View Grill'),
                                       ('Urban Delight Diner'),
                                       ('Lakeside Eatery');


INSERT INTO dish (name, price, restaurant_id) VALUES
                                                        ('Avocado Toast', 10.00, 200000),
                                                        ('Pancake Stack', 15.00, 200000),
                                                        ('Seafood Platter', 25.00, 200001),
                                                        ('Grilled Shrimp', 20.00, 200001),
                                                        ('Clam Chowder', 18.50, 200001),
                                                        ('BBQ Ribs', 22.00, 200002),
                                                        ('Steak Frites', 27.00, 200002),
                                                        ('Caesar Salad', 12.00, 200002),
                                                        ('Classic Burger', 14.00, 200003),
                                                        ('Vegan Wrap', 11.00, 200003),
                                                        ('Chicken Tacos', 13.50, 200003),
                                                        ('Pasta Primavera', 16.00, 200003),
                                                        ('Fish and Chips', 17.50, 200004),
                                                        ('Grilled Salmon', 24.00, 200004),
                                                        ('Cauliflower Steak', 19.00, 200004),
                                                        ('Beef Stroganoff', 23.00, 200004),
                                                        ('Margherita Pizza', 12.50, 200004);

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', '$2a$05$omj2mGENW6VQcV9vjyLPDenwk0kpR7hug1xC43y8CCVHyiv6XpyTm'),
       ('Admin', 'admin@gmail.com', '$2a$05$rNORv1TD0yT8HfGeX5Eb8.y4QGdnMFieTX2ulfRRWpGvtV1w8KHia'),
       ('Guest', 'guest@gmail.com', 'guest');

INSERT INTO user_role(user_id, role)
VALUES (100000, 'USER'),
       (100001, 'ADMIN'),
       (100002, 'USER');

INSERT INTO vote (id, restaurant_id, date_time)
VALUES (100000, 200000, '2024-06-01 08:30:00'),
       (100001, 200000, '2024-06-01 07:30:00');

INSERT INTO comment (text, user_id, restaurant_id, date_time) VALUES
                                                                   ('Amazing breakfast options and friendly staff!', 100000, 200000, '2024-06-01 08:30:00'),
                                                                   ('Loved the avocado toast. Highly recommend!', 100001, 200000, '2024-06-02 09:15:00'),
                                                                   ('Great place for brunch with friends.', 100002, 200000, '2024-06-03 10:00:00'),
                                                                   ('Fresh seafood and beautiful ocean view.', 100000, 200001, '2024-06-01 12:45:00'),
                                                                   ('The grilled shrimp was delicious!', 100002, 200001, '2024-06-02 13:30:00'),
                                                                   ('Best clam chowder I have ever had.', 100001, 200001, '2024-06-03 14:00:00'),
                                                                   ('Excellent BBQ ribs and friendly service.', 100001, 200002, '2024-06-01 18:00:00'),
                                                                   ('Steak frites cooked to perfection.', 100002, 200002, '2024-06-02 19:00:00'),
                                                                   ('Great place for a family dinner.', 100000, 200002, '2024-06-03 20:00:00'),
                                                                   ('Loved the classic burger and cozy atmosphere.', 100000, 200003, '2024-06-01 12:00:00'),
                                                                   ('The vegan wrap was really tasty!', 100001, 200003, '2024-06-02 13:00:00'),
                                                                   ('Perfect spot for a quick lunch.', 100001, 200003, '2024-06-03 14:00:00'),
                                                                   ('Fish and chips were crispy and delicious.', 100002, 200004, '2024-06-01 17:00:00'),
                                                                   ('Loved the grilled salmon. Will be back!', 100001, 200004, '2024-06-02 18:00:00'),
                                                                   ('Nice place for a romantic dinner.', 100000, 200004, '2024-06-03 19:00:00');
