package com.udemy.projectjavaweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.projectjavaweb.dao.DepartamentoDao;
import com.udemy.projectjavaweb.domain.Departamento;


@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	
	@Transactional(readOnly=false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Transactional(readOnly=false)	
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly=false)
	@Override
	public void Excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly=false)
	@Override
	public Departamento buscarPorID(Long id) {
		
		return dao.findByID(id);
	}

	@Transactional(readOnly=false)
	@Override
	public List<Departamento> buscarTodos() {

		return dao.findAll();
	}

	
	
}
