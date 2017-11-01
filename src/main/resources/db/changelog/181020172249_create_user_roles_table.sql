CREATE TABLE user_roles
(
    id IDENTITY PRIMARY KEY NOT NULL,
    user_id INT(11) NOT NULL,
    role_id INT(11) NOT NULL,
    CONSTRAINT fk_user_role FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles (id)
);
CREATE INDEX fk_role_id ON user_roles (role_id);
CREATE INDEX fk_user_role ON user_roles (user_id);