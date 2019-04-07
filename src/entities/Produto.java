package entities;

public class Produto {
	
	private String nome;
	private Integer idProduto;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {	
	}

	public Produto(String nome, Integer idProduto, Double preco, Integer quantidade) {
		this.nome = nome;
		this.idProduto = idProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", idProduto=" + idProduto + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}
	
	
	
}
