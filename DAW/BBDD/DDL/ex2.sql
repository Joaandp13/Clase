CREATE TABLE factures(
	numero INT UNSIGNED,
    serie CHAR(3),
    data DATE,
	any YEAR GENERATED ALWAYS AS (YEAR(data)) STORED,
    client_id INT UNSIGNED NOT NULL,
    
    CONSTRAINT pk_factures
		PRIMARY KEY(numero,serie,any)
);

CREATE TABLE linies_factures (
	numero INT UNSIGNED,
    serie CHAR(3),
    any YEAR,
    linia INT UNSIGNED,
    producte_id INT UNSIGNED NOT NULL,
    qt INT UNSIGNED NOT NULL,
    import DECIMAL(10,2) NOT NULL,
    descompte DECIMAL(5,2),
    subtotal DECIMAL(10,2) NOT NULL,
    
    CONSTRAINT pk_linies_factura
		PRIMARY KEY (numero, serie, any, linia),
        
	CONSTRAINT fk_linies_factura_factures
		FOREIGN KEY (numero,serie, any)
        REFERENCES FACTURES(numero,serie,any)
);