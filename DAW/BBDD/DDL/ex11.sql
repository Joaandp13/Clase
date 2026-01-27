ALTER TABLE jugadors
        ADD COLUMN cognoms VARCHAR(61)
                GENERATED ALWAYS AS (CONCAT(cognom1, ' ', cognom2)) STORED
		AFTER cognom2;