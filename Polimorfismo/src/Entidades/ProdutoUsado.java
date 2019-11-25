package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado  extends Produto {
	
	private static final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFrabricacao;

	public ProdutoUsado(String nome, Double preco, Date dataFrabricacao) {
		super(nome, preco);
		this.dataFrabricacao = dataFrabricacao;
	}

	public Date getDataFrabricacao() {
		return dataFrabricacao;
	}

	public void setDataFrabricacao(Date dataFrabricacao) {
		this.dataFrabricacao = dataFrabricacao;
	}

	public static SimpleDateFormat getData() {
		return data;
	}
	
	@Override
	public String etiquetaProduto() {
		return getNome() + ": R$ " + String.format("%.2f", getPreco()) +
							" Data de Fabricação: " + 
							data.format(dataFrabricacao);
	}
	

}
