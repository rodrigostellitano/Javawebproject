package com.udemy.projectjavaweb.services;

import java.util.List;

import com.udemy.projectjavaweb.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void Excluir(Long id);
	
	Departamento buscarPorID(Long id);
	
	List<Departamento> buscarTodos();
}
 