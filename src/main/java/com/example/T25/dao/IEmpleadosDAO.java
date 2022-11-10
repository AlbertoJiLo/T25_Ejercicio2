package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Empleados;


public interface IEmpleadosDAO extends JpaRepository<Empleados, String>{
	
}
