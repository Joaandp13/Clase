ALTER TABLE linies_factura
    DROP FOREIGN KEY fk_linies_factura_factura;

ALTER TABLE linies_factura
    ADD CONSTRAINT fk_linies_factura_factura
        FOREIGN KEY (numero, serie, any)
        REFERENCES factures(numero, serie, any)
        ON DELETE CASCADE
        ON UPDATE CASCADE;