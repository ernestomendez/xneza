CREATE TABLE users
(
    id IDENTITY PRIMARY KEY NOT NULL,
    user_name VARCHAR(70) NOT NULL,
    password VARCHAR(150) NOT NULL,
    name VARCHAR(250) NOT NULL,
    apellido_paterno VARCHAR(200),
    apellido_materno VARCHAR(200),
    enabled BIT(1) NOT NULL,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    disabled_date DATETIME
);
CREATE UNIQUE INDEX unique_user_name ON users (user_name);