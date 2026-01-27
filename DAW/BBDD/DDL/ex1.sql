DROP TABLE IF EXISTS jugadors;

CREATE TABLE IF NOT EXISTS jugadors(
	jugador_id 		INT unsigned,
    nom 			VARCHAR(25) NOT NULL,
    cognom1 		VARCHAR(30) NOT NULL,
    cognom2 		VARCHAR(30) NOT NULL,
    posicio 		ENUM('BASE','ALER','ALER_PIVOT','PIVOT') NOT NULL COMMENT "Posició dins el terreny de joc",
    dorsal 			CHAR(3) COMMENT "num de samarreta",
    punts 			INT UNSIGNED,
    valoracio 		INT UNSIGNED,
    

	CONSTRAINT pk_jugadors PRIMARY KEY(jugador_id),
	CONSTRAINT ck_jugadors_punts 
		CHECK (punts BETWEEN 0 AND 300),
	CONSTRAINT ck_jugadors_valoracio 
		CHECK (valoracio BETWEEN 0 AND 10),
	CONSTRAINT ck_jugadors_dorsal
		CHECK (dorsal BETWEEN 0 AND 100)
    

);