package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Departamentos;

public interface IDepartamentosService {

	//Metodos del CRUD
	
	public List<Departamentos> listarDepartamentos(); //Listar All 
	
	public Departamentos crearDepartamento(Departamentos departamentos);	//CREATE
	
	public Departamentos leerDepartamento(Long id); // READ
		
	public Departamentos actualizarDepartamento(Departamentos departamento); // UPDATE
	
	public void borrarDepartamento(Long id);// DELETE
	
	
}
