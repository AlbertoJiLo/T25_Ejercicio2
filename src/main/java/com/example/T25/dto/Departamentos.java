package com.example.T25.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="departamentos")

public class Departamentos {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int presupuesto;
	
	@OneToMany
	@JoinColumn(name="departamento_id")
	private List<Departamentos> departamento_id;
	
	
	//Constructores
	
	public Departamentos() {
		
	}
	
	public Departamentos(Long id, String nombre, int presupuesto) {
		this.id=id;
		this.nombre=nombre;
		this.presupuesto=presupuesto;
	}

	//Setters y getters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Departamentos")
	public List<Departamentos> getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(List<Departamentos> departamento_id) {
		this.departamento_id = departamento_id;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Empleado [id = " + id +", nombre = " + nombre +", presupuesto " +presupuesto+ " ] ";
	}
}
