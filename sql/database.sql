
-- DATABASES
DROP DATABASE naruto_AngieCardenas;
CREATE DATABASE naruto_AngieCardenas;

USE naruto_AngieCardenas;


-- TABLES
CREATE TABLE Mision(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion LONGTEXT NOT NULL,
    rango INT DEFAULT NULL,
    recompensa DOUBLE DEFAULT NULL
);
CREATE TABLE Ninja(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    rango ENUM('bajo', 'medio', 'superior') NOT NULL,
    id_aldea BIGINT NOT NULL
);
CREATE TABLE Habilidad(
    id_ninja BIGINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    descripcion LONGTEXT NOT NULL
);
CREATE TABLE MisionNinja(
    id_ninja BIGINT NOT NULL,
    id_mision BIGINT NOT NULL,
    fechaInicio DATE NOT NULL,
    fechaFinal DATE NOT NULL,
    estado ENUM('disponible', 'completada') NOT NULL
);
CREATE TABLE Aldeas(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_nombreCiudad BIGINT NOT NULL,
    nombreAldea VARCHAR(50) NOT NULL
);
CREATE TABLE Ciudades(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreCiudad VARCHAR(50) NOT NULL
);

-- FOREIGN KEYS
ALTER TABLE MisionNinja ADD FOREIGN KEY (id_mision) REFERENCES Mision (id);
ALTER TABLE Habilidad ADD FOREIGN KEY (id_ninja) REFERENCES Ninja (id);
ALTER TABLE MisionNinja ADD FOREIGN KEY(id_ninja) REFERENCES Ninja(id);
ALTER TABLE Ninja ADD FOREIGN KEY (id_aldea) REFERENCES Aldeas (id);
ALTER TABLE Aldeas ADD FOREIGN KEY (id_nombreCiudad) REFERENCES Ciudades (id);

           