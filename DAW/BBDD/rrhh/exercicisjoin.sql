SELECT 
 d.nom AS nom_departament,
 e.cognoms,
 e.nom
FROM empleats e
INNER JOIN departaments d
  ON e.departament_id = d.departament_id
ORDER BY 
	d.nom ASC,
	e.cognoms ASC,
    e.nom ASC;




SELECT 
    d.departament_id AS codi_departament,
    d.nom AS nom_departament,
    l.adreca,
    l.codi_postal,
    l.ciutat
FROM departaments AS d
INNER JOIN localitzacions AS l
    ON d.localitzacio_id = l.localitzacio_id
ORDER BY d.departament_id;





SELECT 
    d.departament_id AS codi_departament,
    d.nom AS nom_departament,
    l.adreca,
    l.codi_postal,
    l.ciutat
FROM departaments AS d
INNER JOIN localitzacions AS l
    ON d.localitzacio_id = l.localitzacio_id
WHERE d.nom = 'Marketing';
