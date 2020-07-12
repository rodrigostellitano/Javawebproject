package com.udemy.projectjavaweb.dao;

import java.util.List;

import com.udemy.projectjavaweb.domain.Cargo;

public interface CargoDao {

	void save(Cargo departamento);
	
	void update(Cargo departamento);
	
	void delete(Long id);
	
	Cargo findByID(Long id);
	
	List<Cargo> findAll();
	
}
