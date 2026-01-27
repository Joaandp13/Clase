ALTER TABLE linies_factura
        ADD CONSTRAINT fk_linies_productes FOREIGN KEY (producte_id)
                REFERENCES productes(producte_id)
ON DELETE CASCADE;