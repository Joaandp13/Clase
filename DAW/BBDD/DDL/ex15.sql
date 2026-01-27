ALTER TABLE jugadors
	MODIFY COLUMN jugador_id SMALLINT UNSIGNED,
    ADD CONSTRAINT ck_jugadors_jugador_id CHECK (jugador_id BETWEEN 0 AND 65000);