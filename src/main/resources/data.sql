INSERT INTO restaurants (name) VALUES
                                       ('Sunrise Bistro'),
                                       ('Ocean Breeze Café'),
                                       ('Mountain View Grill'),
                                       ('Urban Delight Diner'),
                                       ('Lakeside Eatery');

INSERT INTO dishes (name, price, restaurant_id) VALUES
                                                        ('Avocado Toast', 10.00, 100000),
                                                        ('Pancake Stack', 15.00, 100000),
                                                        ('Seafood Platter', 25.00, 100001),
                                                        ('Grilled Shrimp', 20.00, 100001),
                                                        ('Clam Chowder', 18.50, 100001),
                                                        ('BBQ Ribs', 22.00, 100002),
                                                        ('Steak Frites', 27.00, 100002),
                                                        ('Caesar Salad', 12.00, 100002),
                                                        ('Classic Burger', 14.00, 100003),
                                                        ('Vegan Wrap', 11.00, 100003),
                                                        ('Chicken Tacos', 13.50, 100003),
                                                        ('Pasta Primavera', 16.00, 100003),
                                                        ('Fish and Chips', 17.50, 100004),
                                                        ('Grilled Salmon', 24.00, 100004),
                                                        ('Cauliflower Steak', 19.00, 100004),
                                                        ('Beef Stroganoff', 23.00, 100004),
                                                        ('Margherita Pizza', 12.50, 100004);

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', '$2a$05$omj2mGENW6VQcV9vjyLPDenwk0kpR7hug1xC43y8CCVHyiv6XpyTm'),
       ('Admin', 'admin@gmail.com', '$2a$05$rNORv1TD0yT8HfGeX5Eb8.y4QGdnMFieTX2ulfRRWpGvtV1w8KHia'),
       ('Guest', 'guest@gmail.com', 'guest');

INSERT INTO user_role(user_id, role)
VALUES (100022, 'USER'),
       (100023, 'ADMIN'),
       (100023, 'USER');

INSERT INTO votes (id, restaurant_id, date_time)
VALUES (100022, 100000, '2024-06-01 08:30:00'),
       (100023, 100000, '2024-06-01 07:30:00');

INSERT INTO comments (text, user_id, restaurant_id, date_time) VALUES
                                                                   ('Amazing breakfast options and friendly staff!', 100022, 100000, '2024-06-01 08:30:00'),
                                                                   ('Loved the avocado toast. Highly recommend!', 100023, 100000, '2024-06-02 09:15:00'),
                                                                   ('Great place for brunch with friends.', 100024, 100000, '2024-06-03 10:00:00'),
                                                                   ('Fresh seafood and beautiful ocean view.', 100022, 100001, '2024-06-01 12:45:00'),
                                                                   ('The grilled shrimp was delicious!', 100024, 100001, '2024-06-02 13:30:00'),
                                                                   ('Best clam chowder I have ever had.', 100023, 100001, '2024-06-03 14:00:00'),
                                                                   ('Excellent BBQ ribs and friendly service.', 100023, 100002, '2024-06-01 18:00:00'),
                                                                   ('Steak frites cooked to perfection.', 100024, 100002, '2024-06-02 19:00:00'),
                                                                   ('Great place for a family dinner.', 100024, 100002, '2024-06-03 20:00:00'),
                                                                   ('Loved the classic burger and cozy atmosphere.', 100022, 100003, '2024-06-01 12:00:00'),
                                                                   ('The vegan wrap was really tasty!', 100023, 100003, '2024-06-02 13:00:00'),
                                                                   ('Perfect spot for a quick lunch.', 100023, 100003, '2024-06-03 14:00:00'),
                                                                   ('Fish and chips were crispy and delicious.', 100024, 100004, '2024-06-01 17:00:00'),
                                                                   ('Loved the grilled salmon. Will be back!', 100023, 100004, '2024-06-02 18:00:00'),
                                                                   ('Nice place for a romantic dinner.', 100022, 100004, '2024-06-03 19:00:00');
