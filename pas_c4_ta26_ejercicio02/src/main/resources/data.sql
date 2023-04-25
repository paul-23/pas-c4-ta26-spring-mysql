DROP TABLE IF EXISTS asignado_a;
DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyectos;

CREATE TABLE cientificos(
	dni VARCHAR(9) PRIMARY KEY,
	nombre_apellidos VARCHAR(255)
);

CREATE TABLE proyectos(
	id CHAR(4) PRIMARY KEY,
	nombre VARCHAR(255),
	horas INT
);

CREATE TABLE asignado_a(
	id INT AUTO_INCREMENT PRIMARY KEY,
	cientifico VARCHAR(9),
	proyecto CHAR(4),
	FOREIGN KEY (cientifico) REFERENCES cientificos (dni) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (proyecto) REFERENCES proyectos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('123456789', 'Juan Pérez');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('987654321', 'María González');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('456123789', 'Pedro Sánchez');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('789123456', 'Ana Martínez');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('654987321', 'Luisa Rodríguez');

INSERT INTO proyectos(id, nombre, horas) VALUES ('P001', 'Proyecto A', 100);
INSERT INTO proyectos(id, nombre, horas) VALUES ('P002', 'Proyecto B', 200);
INSERT INTO proyectos(id, nombre, horas) VALUES ('P003', 'Proyecto C', 150);
INSERT INTO proyectos(id, nombre, horas) VALUES ('P004', 'Proyecto D', 300);
INSERT INTO proyectos(id, nombre, horas) VALUES ('P005', 'Proyecto E', 250);

INSERT INTO asignado_a(cientifico, proyecto) VALUES ('123456789', 'P001');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('987654321', 'P002');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('456123789', 'P003');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('789123456', 'P004');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('654987321', 'P005');
