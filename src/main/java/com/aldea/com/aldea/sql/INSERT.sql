
-- INSERTS

-- TABLA CIUDADES
INSERT INTO Ciudades (nombreCiudad) 
    VALUES ('Bucaramanga'), 
           ('Floridablanca'), 
           ('Piedecuesta'), 
           ('Lebrija'), 
           ('Medellin');

-- TABLA ALDEAS
INSERT INTO Aldeas (id_nombreCiudad, nombreAldea) 
    VALUES (1, 'Giron'), 
           (2, 'Florida'), 
           (5, 'Medallo'), 
           (1, 'Cabecera'), 
           (3, 'Lacuesta');

-- TABLA NINJA
INSERT INTO Ninja (nombre, rango, id_aldea) 
    VALUES ('Juan', 'medio', 1), 
           ('Maria', 'bajo', 3), 
           ('Patricio', 'medio', 4), 
           ('Lucia', 'superior', 2), 
           ('Oscar', 'superior', 5) ;

-- TABLA MISION
INSERT INTO Mision (descripcion, rango, recompensa) 
    VALUES ('Ayudar a los campesiones de la aldea', 6, 12000000), 
           ('Eliminar los carteles de la mafia', 10, 500000000), 
           ('Abrir paso a las ambulancias', 4, 10000000), 
           ('Controlar semáforos a la hora pico', 3, 8000000),
           ('Atrapar a ladrones en centros comerciales', 7, 100000000);

-- TABLA HABILIDAD

INSERT INTO Habilidad (id_ninja, nombre, descripcion) 
    VALUES (1, 'Velocidad', 'Puedes ser muy veloz después de pensar en la habilidad durante 5 segundos'),
           (3, 'Teletransportación', 'Puedes cargar muchas cosas y teletransportarlas en 10 segundos'),
           (5, 'Inmortalidad', 'Puedes ser inmortal si no lastimas a nadie'),
           (2, 'Fuerza', 'Casi como un gigante, puedes ser el triple de fuerte a lo que eres si concentras la fuerza en la mano derecha'),
           (4, 'RayosX', 'Sin sobrepasarte puedes ver el interior de las personas, preferiblemente sus bolsos u accesorios');

-- TABLA MISION NINJA

INSERT INTO MisionNinja (id_ninja, id_mision, fechaInicio, fechaFinal, estado) 
    VALUES (2, 3, '2024-01-10', '2024-01-27', 'completada'),
           (4, 5, '2024-08-05', '2024-09-29', 'disponible'),
           (5, 2, '2025-02-17', '2025-08-20', 'disponible'),
           (3, 1, '2024-01-21', '2024-01-28', 'completada'),
           (1, 4, '2024-12-26', '2025-02-28', 'disponible');