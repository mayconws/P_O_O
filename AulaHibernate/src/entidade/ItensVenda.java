package entidade;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItensVenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int quantidade;
	private Double preco;
	@ManyToOne
	private Venda venda;

}
