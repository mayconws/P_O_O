package Entidades;

public class ProdutoImportado extends Produto {
	
	private Double taxa;

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double valorTotal() {
		return getPreco() + taxa;
	}
	
	@Override
	public String etiquetaProduto() {
		return getNome() + ": R$ " + String.format("%.2f", valorTotal()) +
							" Valor da taxa: R$ " + String.format("%.2f", taxa) + "";
	}
	

}
