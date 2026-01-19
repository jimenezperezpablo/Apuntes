
-- EJERCICIO 1

SELECT nombre,salario FROM techcorp_db.empleados;
SELECT * FROM techcorp_db.empleados;
SELECT nombre FROM techcorp_db.empleados WHERE departamento = "it" and ciudad= "Madrid";
SELECT nombre FROM techcorp_db.empleados WHERE salario > 3000 and salario <= 6000;
SELECT distic ciudad FROM techcorp_db.empleados;
SELECT nombre FROM techcorp_db.empleados WHERE (departamento = "marketing" or departamento = "ventas") and salario > 5000;
select nombre from techcorp_db.empleados where departamento != "recursos humanos";
SELECT nombre FROM techcorp_db.clientes where ciudad = "barcelona";
SELECT nombre FROM techcorp_db.empleados where edad < 30 and salario > 4000;
SELECT nombre FROM techcorp_db.empleados where salario >= 3500 and departamento = "desarrollo"

-- EJERCICIO 2

SELECT goles_local,goles_visitante, goles_local + goles_visitante AS goles_total FROM ejercicio42.partidos Where goles_local + goles_visitante > 4;
SELECT nombre_jugador FROM ejercicio42.jugadores where id_equipo = 1;
SELECT id_partido,goles_local,goles_visitante FROM ejercicio42.partidos where goles_local > goles_visitante;
SELECT * FROM ejercicio42.equipos ORDER BY nombre_equipo;
SELECT * FROM ejercicio42.jugadores where posicion = "Delantero" AND goles > 20;
SELECT avg(goles_local+goles_visitante) as promedio_equipo, id_equipo_local FROM ejercicio42.partidos where id_equipo_local = 1 or id_equipo_visitante = 1;
SELECT * FROM ejercicio42.partidos where fecha>"2022-12-31" and fecha < "2023-02-01";
SELECT id_equipo, COUNT(nombre_jugador) FROM ejercicio42.jugadores WHERE id_equipo = 1;
SELECT nombre_equipo, ciudad, fundado FROM ejercicio42.equipos ORDER BY ciudad, fundado DESC;
SELECT id_equipo, AVG(edad) AS edad_promedio FROM ejercicio42.jugadores GROUP BY id_equipo ORDER BY id_equipo DESC, edad_promedio DESC;
SELECT id_equipo,avg(goles) as promedio_goles, avg(asistencias) as promedio_asistencias FROM ejercicio42.jugadores group by id_equipo order by promedio_goles desc, promedio_asistencias;
SELECT id_equipo_local, SUM(goles_local) AS total_goles FROM ejercicio42.partidos GROUP BY id_equipo_local ORDER BY total_goles DESC;

-- EJERCICIO 3 

SELECT nombre as Nombre_Equipo, ciudad as Ciudad_Equipo FROM basketball_db.equipos;
SELECT nombre, puntos_por_juego FROM basketball_db.jugadores ORDER BY puntos_por_juego desc;
SELECT nombre, length(nombre) as Longitud FROM basketball_db.equipos order by Longitud desc;
Select sum(campeonatos) from equipos group by ciudad;



-- EJ 5
SELECT concat(nombre,apellido) as Concatenado FROM gobierno.ciudadano;
SELECT SUBSTRING(nombre, 1 , 3) as 3Letras  FROM gobierno.ciudadano;
select nombre,length(nombre) as Longitud from ciudadano;
SELECT REPLACE(descripcion, 'hospitales', 'clínicas') FROM actividad;
SELECT trim(nombre) FROM gobierno.ministerio;

SELECT round(presupuesto_asignado) FROM gobierno.actividad;
SELECT ingresos_anuales - (Select avg(ingresos_anuales) from ciudadano) FROM gobierno.ciudadano;
SELECT round(presupuesto , 0) FROM gobierno.ministerio;
SELECT FLOOR(1 + (RAND() * 100)) as id_Unico_Temp FROM gobierno.actividad;

SELECT DATEDIFF(NOW(), fecha_creacion )/ 365 AS antiguedad FROM ministerio;

SELECT * ,DATE_FORMAT(fecha_inicio, '%d/%m/%Y') as fecha_ini,DATE_FORMAT(fecha_fin, '%d/%m/%Y') as fecha_end FROM actividad;
SELECT DATEDIFF(fecha_fin, fecha_inicio ) FROM actividad;
SELECT *,EXTRACT(YEAR FROM fecha_nacimiento),EXTRACT(month FROM fecha_nacimiento)  FROM ciudadano;

SELECT nombre, apellido,fecha_nacimiento, EXTRACT(YEAR FROM fecha_nacimiento) AS ano_nacimiento, EXTRACT(MONTH FROM fecha_nacimiento) AS mes_nacimiento
FROM ciudadano WHERE EXTRACT(YEAR FROM fecha_nacimiento) > 1990;

SELECT Sum(DATEDIFF(fecha_fin, fecha_inicio)) as Duracion_total FROM actividad;
