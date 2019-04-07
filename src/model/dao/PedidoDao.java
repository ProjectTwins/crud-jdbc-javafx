package model.dao;

import entities.Pedido;

public interface PedidoDao {
	
	public void insert(Pedido obj); 
	public void update(Pedido obj);
	public Pedido deleteById(Integer id);
	public Pedido findById(Integer id);
}
