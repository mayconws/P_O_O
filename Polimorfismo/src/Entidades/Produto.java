package Entidades;

public class Produto {
	

	protected String nome;
	protected Double preco;
	
	private Produto() {
		
	}	

	public Produto(String nome, Double preco) {		
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String etiquetaProduto() {
		return nome
				+ ": R$ " 
				+ String.format("%.2f", preco);
	}

}
