package com.udemy.projectjavaweb.services;

import java.util.List;

import com.udemy.projectjavaweb.domain.Cargo;

public interface CargoService {

	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void Excluir(Long id);
	
	Cargo buscarPorID(Long id);
	
	List<Cargo> buscarTodos();
	
	
}
