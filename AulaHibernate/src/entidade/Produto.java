package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private int qtdManima;
	private int qtdMinima;
	private Double preco;
	@ManyToOne
	private ItensVenda itensVenda;
	@ManyToOne
	private ItensCompra itensCompra;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdManima() {
		return qtdManima;
	}
	public void setQtdManima(int qtdManima) {
		this.qtdManima = qtdManima;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public ItensVenda getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(ItensVenda itensVenda) {
		this.itensVenda = itensVenda;
	}
	public ItensCompra getItensCompra() {
		return itensCompra;
	}
	public void setItensCompra(ItensCompra itensCompra) {
		this.itensCompra = itensCompra;
	}	
		
}
