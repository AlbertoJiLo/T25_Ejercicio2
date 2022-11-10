package com.example.T25.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="empleados")

public class Empleados {

	//Atributos de la entidad Empleado
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamentos departamento_id;
	
	//Constructores
	
	public Empleados() {
		
	}
	
	public Empleados(String dni, String nombre, String apellidos, Departamentos departamento_id) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.departamento_id=departamento_id;
		
	}



	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamentos getDepartamentos() {
		return departamento_id;
	}

	public void setDepartamentos(Departamentos departamento_id) {
		this.departamento_id = departamento_id;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Empleado [dni = " + dni +", nombre = " + nombre +", apellidos " + apellidos + ", departamento id " + departamento_id + " ] ";
	}
}
