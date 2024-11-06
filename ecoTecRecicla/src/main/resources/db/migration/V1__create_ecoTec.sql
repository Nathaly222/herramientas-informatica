CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL ,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    address VARCHAR(100) NOT NULL,
    recycling_points INT DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS reports(
    id SERIAL,
    device_type VARCHAR(100) NOT NULL,
    status VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    report_status VARCHAR(100) NOT NULL,
    user_id INT,
    PRIMARY KEY(id),
    CONSTRAINT fk_user
        FOREIGN KEY(user_id) REFERENCES users(id)
)