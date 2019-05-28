package lojaDeCarros;

public class Principal {
	
	public static void main (String [] args) {
		
		Cliente novo = new Cliente();
		novo.inserir();
		novo.imprimirCliente();
		
		Carro c = new Carro();
		c.inserirCondicao();
		c.imprimirCondicao();
		
		Pagamento p = new Pagamento();
		p.inserirPagamento();
		p.imprimirPagamento();
		
	}

}
