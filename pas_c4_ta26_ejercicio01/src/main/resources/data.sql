CREATE TABLE piezas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL
);

CREATE TABLE proveedores(
	id CHAR(4) NOT NULL PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL
);

CREATE TABLE suministra(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	pieza INT NOT NULL,
	proveedor CHAR(4) NOT NULL,
	precio INT NOT NULL,
	CONSTRAINT pieza_fk FOREIGN KEY (pieza) REFERENCES piezas (id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT proveedor_fk FOREIGN KEY (proveedor) REFERENCES proveedores (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas(nombre) VALUES ('Pieza 1');
INSERT INTO piezas(nombre) VALUES ('Pieza 2');
INSERT INTO piezas(nombre) VALUES ('Pieza 3');
INSERT INTO piezas(nombre) VALUES ('Pieza 4');
INSERT INTO piezas(nombre) VALUES ('Pieza 5');

INSERT INTO proveedores(id, nombre) VALUES ('0001', 'Proveedor 1');
INSERT INTO proveedores(id, nombre) VALUES ('0002', 'Proveedor 2');
INSERT INTO proveedores(id, nombre) VALUES ('0003', 'Proveedor 3');
INSERT INTO proveedores(id, nombre) VALUES ('0004', 'Proveedor 4');
INSERT INTO proveedores(id, nombre) VALUES ('0005', 'Proveedor 5');

INSERT INTO suministra(pieza, proveedor, precio) VALUES (1, '0001', 10);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (2, '0002', 15);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (3, '0003', 5);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (4, '0004', 20);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (5, '0005', 25);
