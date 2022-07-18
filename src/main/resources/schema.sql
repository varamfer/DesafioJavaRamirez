DROP TABLE FACTURA IF EXISTS ;
DROP TABLE CLIENTE IF EXISTS ;

CREATE TABLE CLIENTE (
nombre VARCHAR(255),
apellido VARCHAR(255),
documento INT,
idcliente INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (idcliente)
);

DROP TABLE PRODUCTO IF EXISTS ;
CREATE TABLE PRODUCTO (
	idproducto int NOT NULL AUTO_INCREMENT,
    codigo int NOT NULL,
    detalle varchar(255),
    cantidad int,
    precio FLOAT,
    PRIMARY KEY (idproducto)
);

CREATE TABLE FACTURA (
    idfactura int NOT NULL AUTO_INCREMENT,
    fecha datetime,
    cantidad int,
    total FLOAT,
    idcliente int,
    PRIMARY KEY (idfactura),
    CONSTRAINT FK_cliente FOREIGN KEY (idcliente)
    REFERENCES cliente(idcliente)
);

