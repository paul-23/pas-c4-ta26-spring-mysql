DROP TABLE IF EXISTS cajeros;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS maquinas_registradoras;
DROP TABLE IF EXISTS ventas;

CREATE TABLE cajeros(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre_apellidos VARCHAR(255) DEFAULT NULL
);

CREATE TABLE productos(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) DEFAULT NULL,
	precio INT DEFAULT NULL
);

CREATE TABLE maquinas_registradoras(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	piso INT DEFAULT NULL
);

CREATE TABLE ventas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	cajero INT NOT NULL,
    maquina INT NOT NULL,
	producto INT NOT NULL,
	FOREIGN KEY (maquina) REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (cajero) REFERENCES cajeros (id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (producto) REFERENCES productos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cajeros(nombre_apellidos) VALUES ('Juan Pérez');
INSERT INTO cajeros(nombre_apellidos) VALUES ('María González');
INSERT INTO cajeros(nombre_apellidos) VALUES ('José García');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Ana Martínez');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Pedro López');

INSERT INTO productos(nombre, precio) VALUES ('Coca-Cola', 2);
INSERT INTO productos(nombre, precio) VALUES ('Fanta Naranja', 1);
INSERT INTO productos(nombre, precio) VALUES ('Agua Mineral', 0.75);
INSERT INTO productos(nombre, precio) VALUES ('Patatas Fritas', 1.25);
INSERT INTO productos(nombre, precio) VALUES ('Chocolate', 0.9);

INSERT INTO maquinas_registradoras(piso) VALUES (1);
INSERT INTO maquinas_registradoras(piso) VALUES (2);
INSERT INTO maquinas_registradoras(piso) VALUES (3);
INSERT INTO maquinas_registradoras(piso) VALUES (4);
INSERT INTO maquinas_registradoras(piso) VALUES (5);

INSERT INTO ventas(cajero, maquina, producto) VALUES (1, 2, 1);
INSERT INTO ventas(cajero, maquina, producto) VALUES (2, 1, 3);
INSERT INTO ventas(cajero, maquina, producto) VALUES (3, 2, 2);
INSERT INTO ventas(cajero, maquina, producto) VALUES (4, 3, 4);
INSERT INTO ventas(cajero, maquina, producto) VALUES (5, 1, 5);