CREATE TABLE IF NOT EXISTS customer(
    id SERIAL,
    lastname VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL,
    phone VARCHAR(200),
    address VARCHAR(200),
    PRIMARY KEY (id)
)