CREATE DATABASE bolera;
USE bolera;
INSERT INTO CLIENTES (id number PRIMARY KEY,nombre varchar(50),direccion varchar(50),telefono varchar(20))
INSERT INTO PISTAS (id number PRIMARY KEY, capacidad number,estado boolean)
INSERT INTO RESERVAS (fecha date, hora time, duraccion time, IDCliente number,FOREIGN KEY (IDCliente) references CLIENTES(id), IDReserva number,FOREIGN KEY (IDReserva) references RESERVAS(id))