package model.dao;

import entities.Cliente;

public interface ClienteDao {

	public void insert(Cliente obj);
	public void update(Cliente obj);
	public Cliente deleteById(Integer id);
	public Cliente findById(Integer id);
	
	
}
