DROP TABLE IF EXISTS facultad;
DROP TABLE IF EXISTS equipos;
DROP TABLE IF EXISTS investigadores;
DROP TABLE IF EXISTS reservas;

CREATE TABLE facultad(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100)
);

CREATE TABLE equipos(
	id CHAR(4) NOT NULL PRIMARY KEY,
	nombre VARCHAR(100),
	facultad INT,
	FOREIGN KEY (facultad) REFERENCES facultades (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE investigadores(
	dni VARCHAR(9) NOT NULL PRIMARY KEY,
	nombre VARCHAR(100),
	facultad INT,
	FOREIGN KEY (facultad) REFERENCES facultades(id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE reservas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	equipo CHAR(4),
	investigador VARCHAR(9),
	comienzo DATETIME,
	fin DATETIME,
	FOREIGN KEY (equipo) REFERENCES equipos (id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (investigador) REFERENCES investigadores (dni) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO facultad (nombre) VALUES
('Facultad de Ciencias'),
('Facultad de Letras'),
('Facultad de Ingeniería'),
('Facultad de Ciencias Sociales'),
('Facultad de Medicina');

INSERT INTO equipos (id, nombre, facultad) VALUES
('E001', 'Microscopio', 1),
('E002', 'Telescopio', 1),
('E003', 'Pizarrón interactivo', 2),
('E004', 'Impresora 3D', 3),
('E005', 'Robot industrial', 3);

INSERT INTO investigadores (dni, nombre, facultad) VALUES
('12345678A', 'Juan Pérez', 1),
('23456789B', 'María Gómez', 2),
('34567890C', 'Carlos Ruiz', 3),
('45678901D', 'Laura García', 4),
('56789012E', 'Ana González', 5);

INSERT INTO reservas (equipo, investigador, comienzo, fin) VALUES
('E001', '12345678A', '2023-05-01 10:00:00', '2023-05-01 12:00:00'),
('E002', '23456789B', '2023-05-03 14:00:00', '2023-05-03 16:00:00'),
('E003', '34567890C', '2023-05-05 16:00:00', '2023-05-05 18:00:00'),
('E004', '45678901D', '2023-05-06 09:00:00', '2023-05-06 11:00:00'),
('E005', '56789012E', '2023-05-08 13:00:00', '2023-05-08 15:00:00');