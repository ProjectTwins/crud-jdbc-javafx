package entities;

public class Vendedor {

	private String nome;
	private Integer idVendedor;
	private Double salario;
	private String email;
	
	public Vendedor() {
		
	}

	public Vendedor(String nome, Integer idVendedor, Double salario, String email) {
		this.nome = nome;
		this.idVendedor = idVendedor;
		this.salario = salario;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", idVendedor=" + idVendedor + ", salario=" + salario + ", email=" + email
				+ "]";
	}
	

	
}
