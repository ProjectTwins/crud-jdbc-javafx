package entities;

public class Cliente {
	private String nome;
	private Integer idCliente;
	
	public Cliente() {
		
	}

	public Cliente(String nome, Integer idCliente) {
		this.nome = nome;
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idCliente=" + idCliente + "]";
	}
	
	
	
}
