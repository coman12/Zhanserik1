CREATE TABLE product (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(100),
                         price NUMERIC(10,2),
                         stock INT
);

INSERT INTO product (name, price, stock)
VALUES ('Phone', 800, 10);

SELECT * FROM product;

UPDATE product
SET price = 750
WHERE id = 1;

DELETE FROM product
WHERE id = 1;
