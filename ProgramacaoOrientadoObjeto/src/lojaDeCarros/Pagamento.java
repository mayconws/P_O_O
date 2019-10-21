package lojaDeCarros;

import java.util.Scanner;

public class Pagamento {	

	public int quantidade;
	public Double total;
	public Double valorParcela;
	
public void inserirPagamento() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe a quantidade de parcelas: ");
	quantidade = scan.nextInt();
	
	System.out.println("Total a pagar: ");
	total = scan.nextDouble();
	
	valorParcela = total / quantidade;
}
	
public void imprimirPagamento() {
	
	System.out.println("Quantidade de parcelas: "+quantidade+"\nValor a Pagar: "+valorParcela);

}

}
