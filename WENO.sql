
CREATE TABLE Productos (
                Id VARCHAR NOT NULL,
                Categoria VARCHAR NOT NULL,
                NombreP VARCHAR NOT NULL,
                Precio VARCHAR NOT NULL,
                Existencia VARCHAR NOT NULL,
                CONSTRAINT ID PRIMARY KEY (Id)
);


CREATE TABLE Usuario (
                Unombre VARCHAR NOT NULL,
                Correo VARCHAR NOT NULL,
                Rango BOOLEAN NOT NULL,
                nombre VARCHAR NOT NULL,
                Cedula VARCHAR NOT NULL,
                Contrasena VARCHAR NOT NULL,
                Telefono VARCHAR NOT NULL,
                Puntos VARCHAR NOT NULL,
                CONSTRAINT Nombre PRIMARY KEY (Unombre)
);


CREATE TABLE Compras (
                IdC VARCHAR NOT NULL,
                Unombre VARCHAR NOT NULL,
                Id VARCHAR NOT NULL,
                ProductosC VARCHAR NOT NULL,
                EstadoC BOOLEAN NOT NULL,
                CONSTRAINT IdC PRIMARY KEY (IdC)
);


ALTER TABLE Compras ADD CONSTRAINT Productos_Compras_fk
FOREIGN KEY (Id)
REFERENCES Productos (Id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Compras ADD CONSTRAINT Usuario_Compras_fk
FOREIGN KEY (Unombre)
REFERENCES Usuario (Unombre)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
