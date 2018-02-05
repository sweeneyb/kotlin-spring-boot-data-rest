INSERT INTO restaurants (name, location, lat, lng) VALUES ('test', 'Helsinki', 123, 456);

INSERT INTO menus (restaurant_id, menu_date, menu_date2, title, menu_text) VALUES (1, CURRENT_DATE(), CURRENT_DATE(), 'Soups2', 'Hello, World!');
INSERT INTO menus (restaurant_id, menu_date, menu_date2, title, menu_text) VALUES (1, CURRENT_DATE(), CURRENT_DATE(), 'Salads', 'Hello, Salad!');
