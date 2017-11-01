INSERT INTO ejemplo (id, ejemplo_name, apellido) VALUES (1, 'Emiliano', 'Mendez');
INSERT INTO ejemplo (id, ejemplo_name, apellido) VALUES (2, 'Fernanda', 'Mendez');
INSERT INTO ejemplo (id, ejemplo_name, apellido) VALUES (3, 'Leonardo', 'Mendez');

INSERT INTO roles (id, role_name, creationdate) VALUES (1, 'USER', CURRENT_TIMESTAMP());
INSERT INTO roles (id, role_name, creationdate) VALUES (2, 'ADMIN', CURRENT_TIMESTAMP());

INSERT INTO users (id, user_name, password, name, apellido_paterno, apellido_materno, enabled, creation_date)
          VALUES (1, 'bote@mail.com', '$2a$10$eYssWhD..sLFTj/zS79ltOkt3cngOzPZ2roaxzDF4C9pap0Mx3grC', 'Emiliano',
          'Mendez', 'Mendez', TRUE, CURRENT_TIMESTAMP());
INSERT INTO users (id, user_name, password, name, apellido_paterno, apellido_materno, enabled, creation_date)
          VALUES (2, 'fer@mail.com', '$2a$10$eYssWhD..sLFTj/zS79ltOkt3cngOzPZ2roaxzDF4C9pap0Mx3grC', 'Fernanda',
          'Mendez', 'Dominguez', TRUE, CURRENT_TIMESTAMP());
INSERT INTO users (id, user_name, password, name, apellido_paterno, apellido_materno, enabled, creation_date)
          VALUES (3, 'velo@mail.com', '$2a$10$eYssWhD..sLFTj/zS79ltOkt3cngOzPZ2roaxzDF4C9pap0Mx3grC', 'Leonardo',
          'Mendez', 'Mendez', TRUE, CURRENT_TIMESTAMP());

INSERT INTO user_roles (id, user_id, role_id) VALUES (1, 1, 1);
INSERT INTO user_roles (id, user_id, role_id) VALUES (2, 1, 2);
INSERT INTO user_roles (id, user_id, role_id) VALUES (3, 2, 1);
INSERT INTO user_roles (id, user_id, role_id) VALUES (4, 3, 1);