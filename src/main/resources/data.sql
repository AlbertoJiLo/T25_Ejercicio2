
DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;



create table departamentos(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	presupuesto INT
    );
    
create table empleados(
	dni varchar(9) PRIMARY KEY,
	nombre varchar(100),
    apellidos varchar (100),
    departamento_id int,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id) ON DELETE CASCADE ON UPDATE CASCADE 
	);

insert into departamentos (nombre,presupuesto) values ('RRHH', '5000');
insert into departamentos (nombre,presupuesto) values ('Ventas', '10000');
insert into departamentos (nombre,presupuesto) values ('Logistica', '20000');
insert into departamentos (nombre,presupuesto) values ('I+D', '20000');

insert into empleados (dni, nombre, apellidos, departamento_id) values('10000000A','Alberto', 'Jimenez Lopez','1');
insert into empleados (dni, nombre, apellidos, departamento_id) values('20000000B','Pepe', 'Lopez Vazquez','2');
insert into empleados (dni, nombre, apellidos, departamento_id) values('30000000C','Paco', 'Muñoz Fernandez','3');
insert into empleados (dni, nombre, apellidos, departamento_id) values('40000000D','Manolo', 'Hernandez Gomez','4');



