DROP TABLE CLIENTE IF EXISTS ;

CREATE TABLE CLIENTE (
nombre VARCHAR(255),
apellido VARCHAR(255),
documento INT,
idcliente INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (idcliente)
);

CREATE TABLE PRODUCTO (
	idproducto int NOT NULL AUTO_INCREMENT,
    codigo int NOT NULL,
    detalle varchar(255),
    cantidad int,
    precio FLOAT(7, 2),
    PRIMARY KEY (idproducto)
);

