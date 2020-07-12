package com.udemy.projectjavaweb.services;

import java.util.List;

import com.udemy.projectjavaweb.domain.Funcionario;

public interface FuncionarioService {

void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void Excluir(Long id);
	
	Funcionario buscarPorID(Long id);
	
	List<Funcionario> buscarTodos();
}
