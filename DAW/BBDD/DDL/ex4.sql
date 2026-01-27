USE `exercicis-ddl`;

CREATE TABLE persones (
    persona_id INT UNSIGNED PRIMARY KEY,
    nom        VARCHAR(50),
    cognoms    VARCHAR(80)
);


CREATE TABLE alumnes (
    persona_id    INT UNSIGNED PRIMARY KEY,
    nota_mitjana  DECIMAL(4,2),

    CONSTRAINT fk_alumne_persona
        FOREIGN KEY (persona_id)
        REFERENCES persones(persona_id)
);
CREATE TABLE professors (
    persona_id        INT UNSIGNED PRIMARY KEY,
    data_incorporacio DATE,

    CONSTRAINT fk_professor_persona
        FOREIGN KEY (persona_id)
        REFERENCES persones(persona_id)
);
CREATE TABLE pas (
    persona_id INT UNSIGNED PRIMARY KEY,
    telefon    VARCHAR(20),

    CONSTRAINT fk_pas_persona
        FOREIGN KEY (persona_id)
        REFERENCES persones(persona_id)
);
