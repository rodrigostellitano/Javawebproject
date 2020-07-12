package com.udemy.projectjavaweb.dao;

import java.util.List;

import com.udemy.projectjavaweb.domain.Funcionario;

public interface FuncionarioDao {

	
	void save(Funcionario departamento);
	
	void update(Funcionario departamento);
	
	void delete(Long id);
	
	Funcionario findByID(Long id);
	
	List<Funcionario> findAll();
	
	
}
