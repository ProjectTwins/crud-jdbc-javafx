package model.dao;

import entities.Produto;

public interface ProdutoDao {

	public void insert(Produto obj);
	public void update(Produto obj);
	public Produto deleteById(Integer id);
	public Produto findById(Integer id);
}
