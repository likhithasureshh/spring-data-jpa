INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1001', 'Laptop', 75000.00, 10, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1002', 'Smartphone', 35000.00, 10, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1003', 'Headphones', 2500.00, 10, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1004', 'Monitor', 15000.00, 15, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1005', 'Keyboard', 1200.00, 40, NOW(), NOW());
INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1006', 'Gaming Mouse', 1800.00, 35, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1007', 'External Hard Drive', 5500.00, 20, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1008', 'USB Cable', 300.00, 100, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1009', 'Bluetooth Speaker', 2700.00, 45, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1010', 'Webcam HD', 3200.00, 18, NOW(), NOW());
-- High price, low quantity


INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1012', 'Mouse Pad', 200.00, 150, NOW(), NOW());

-- Similar names (for LIKE / CONTAINS testing)
INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1013', 'Laptop Stand', 2200.00, 30, NOW(), NOW());

INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1014', 'Laptop Bag', 1800.00, 25, NOW(), NOW());

-- Case variation (for IgnoreCase testing)
INSERT INTO Product
(sku, product_title, price, quantity, created_at, updated_at)
VALUES
('SKU1015', 'laptop sleeve', 900.00, 60, NOW(), NOW());