package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.IDepartamentosDAO;
import com.example.T25.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService{
	
	//Utilizamos los metodos de la interface IDepartamentoDAO, es como si instanciaramos.
	@Autowired
	IDepartamentosDAO iDepartamentoDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		return iDepartamentoDAO.findAll();
	}
	
	@Override
	public Departamentos crearDepartamento(Departamentos departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamentos leerDepartamento(Long id) {
		return iDepartamentoDAO.findById(id).get();
	}


	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void borrarDepartamento(Long id) {
		iDepartamentoDAO.deleteById(id);
	}

}
