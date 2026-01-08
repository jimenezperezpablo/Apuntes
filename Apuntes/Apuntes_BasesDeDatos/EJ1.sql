SELECT nombre,salario FROM techcorp_db.empleados;
SELECT * FROM techcorp_db.empleados;
SELECT nombre SELECT techcorp_db.empleados WHERE departamento = "it";
SELECT nombre SELECT techcorp_db.empleados WHERE salario > 3000 & salario <= 6000;
SELECT nombre, ciudad FROM techcorp_db.empleados;
SELECT nombre SELECT techcorp_db.empleados WHERE departamento = "marketing" || departamento = "ventas" && salario > 5000;
select nombre from techcorp_db.empleados where departamento != "recursos humanos";
SELECT nombre FROM techcorp_db.clientes where ciudad = "barcelona";
çSELECT nombre FROM techcorp_db.empleados where edad < 30 and salario > 4000;
