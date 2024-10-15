CREATE TABLE IF NOT EXISTS student (
    id SERIAL,
    lastname VARCHAR (100) NOT NULL,
    address VARCHAR (100) NOT NULL,
    nui CHAR(10) NOT NULL,
    UNIQUE (id),
    PRIMARY KEY (id)
    );