package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Empleados;

public interface IEmpleadosService {

	//Metodos del CRUD
	
	public List<Empleados> listarEmpleados(); //Listar All 
	
	public Empleados crearEmpleado(Empleados empleados);	//CREATE
	
	public Empleados leerEmpleado(String dni); // READ
		
	public Empleados actualizarEmpleado(Empleados empleado); // UPDATE
	
	public void borrarEmpleado(String dni);// DELETE
	
	
}