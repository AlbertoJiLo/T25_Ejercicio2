package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Departamentos;


public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long>{
	;
	
}
