CREATE TABLE clients (
    client_id INT UNSIGNED PRIMARY KEY,
    dni       CHAR(10),
    nom       VARCHAR(15) NOT NULL,

    CONSTRAINT uk_clients_dni UNIQUE (dni)x
);
