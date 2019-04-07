package model.dao;

import entities.Vendedor;

public interface VendedorDAO {

	public void insert(Vendedor obj);
	public void update(Vendedor obj);
	public Vendedor deleteById(Integer id);
	public Vendedor findById(Integer id);
	
}
