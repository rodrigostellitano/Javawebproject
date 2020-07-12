package com.udemy.projectjavaweb.dao;

import java.util.List;

import com.udemy.projectjavaweb.domain.Departamento;

public interface DepartamentoDao {

	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findByID(Long id);
	
	List<Departamento> findAll();
	
}
