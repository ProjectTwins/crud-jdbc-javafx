package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Integer idPedido;
	private Date date;
	
	List<Produto> pro = new ArrayList<>();
	Vendedor vendedor = new Vendedor();
	Cliente cliente = new Cliente();
	
	public Pedido() {
	}

	public Pedido(Integer idPedido, Date date, List<Produto> pro, Vendedor vendedor, Cliente cliente) {
		this.idPedido = idPedido;
		this.date = date;
		this.pro = pro;
		this.vendedor = vendedor;
		this.cliente = cliente;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Produto> getPro() {
		return pro;
	}

	public void setPro(List<Produto> pro) {
		this.pro = pro;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", date=" + date + ", pro=" + pro + ", vendedor=" + vendedor + "]";
	}
	
	
	
	
}
