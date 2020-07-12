package com.udemy.projectjavaweb.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.projectjavaweb.dao.FuncionarioDao;
import com.udemy.projectjavaweb.domain.Funcionario;


@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

	private FuncionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void Excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario buscarPorID(Long id) {

		return dao.findByID(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {

		return dao.findAll();
	}

}
