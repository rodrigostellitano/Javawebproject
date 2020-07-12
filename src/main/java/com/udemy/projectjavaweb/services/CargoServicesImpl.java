package com.udemy.projectjavaweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.projectjavaweb.dao.CargoDao;
import com.udemy.projectjavaweb.domain.Cargo;


@Service @Transactional(readOnly = false)
public class CargoServicesImpl implements CargoService {

	
	@Autowired
	private CargoDao dao;
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override @Transactional(readOnly = false)
	public void Excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = false)
	public Cargo buscarPorID(Long id) {
		
		return dao.findByID(id);
	}

	@Override @Transactional(readOnly = false)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
	
	
}
