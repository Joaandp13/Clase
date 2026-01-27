CREATE TABLE pobles (
    poble_id      INT NOT NULL,
    municipi_id   INT NOT NULL,
    nom           VARCHAR(40) DEFAULT NULL,
    provincia_nom VARCHAR(14) NOT NULL DEFAULT '',

    CONSTRAINT pk_pobles PRIMARY KEY (poble_id, municipi_id)
);
