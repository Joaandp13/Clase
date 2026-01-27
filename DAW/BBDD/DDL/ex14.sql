CREATE TABLE feines (
	feina_id INT,
    nom VARCHAR(100) DEFAULT '',
    salari_min DECIMAL(10,2) DEFAULT 0,
    salari_max DECIMAL(10,2) DEFAULT 8000,
	CONSTRAINT pk_feines PRIMARY KEY (feina_id)