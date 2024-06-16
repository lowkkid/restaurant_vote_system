-- Заполнение таблицы restaurants
INSERT INTO restaurants (name) VALUES
                                       ('Sunrise Bistro'),
                                       ('Ocean Breeze Café'),
                                       ('Mountain View Grill'),
                                       ('Urban Delight Diner'),
                                       ('Lakeside Eatery');

-- Заполнение таблицы dishes
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
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin'),
       ('Guest', 'guest@gmail.com', 'guest');