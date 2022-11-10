package com.example.T25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.T25.dto.Departamentos;
import com.example.T25.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorDepartamentos {
	
	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos crearDepartamento(@RequestBody Departamentos departamento) {
		
		return departamentosServiceImpl.crearDepartamento(departamento);
		
	}
	
	
	@GetMapping("/departamentos/{id}")
	public Departamentos leerDepartamento(@PathVariable(name="id") Long id) {
		
		Departamentos departamento= new Departamentos();
		
		departamento=departamentosServiceImpl.leerDepartamento(id);
		
		System.out.println("Departamento segun ID: "+departamento);
		
		return departamento;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_actualizado= new Departamentos();
		
		departamento_seleccionado= departamentosServiceImpl.leerDepartamento(id);

		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());


		
		departamento_actualizado = departamentosServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void borrarDepartamento(@PathVariable(name="id")Long id) {
		departamentosServiceImpl.borrarDepartamento(id);
	}
	
	
}
