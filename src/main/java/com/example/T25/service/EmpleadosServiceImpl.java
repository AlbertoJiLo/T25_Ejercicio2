package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.IEmpleadosDAO;
import com.example.T25.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{
	
	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instanciaramos.
	@Autowired
	IEmpleadosDAO iEmpleadoDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}
	
	@Override
	public Empleados crearEmpleado(Empleados empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleados leerEmpleado(String dni) {
		return iEmpleadoDAO.findById(dni).get();
	}


	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void borrarEmpleado(String dni) {
		iEmpleadoDAO.deleteById(dni);
	}

}
