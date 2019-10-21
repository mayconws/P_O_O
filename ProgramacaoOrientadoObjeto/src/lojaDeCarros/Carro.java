package lojaDeCarros;

import java.util.Scanner;

public class Carro {	
	
	public String condicao;
	public Double valor;
	
public void inserirCondicao() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o estado do veículo: 'Novo' ou 'Usado'");
	condicao = scan.nextLine();
	
	System.out.println("Digite o valor do veículo: ");
	valor = scan.nextDouble();
	
}
	
public void imprimirCondicao() {
	
	System.out.println("Condição do veículo: "+condicao+"\nValor do veículo: "+valor);
}

}
