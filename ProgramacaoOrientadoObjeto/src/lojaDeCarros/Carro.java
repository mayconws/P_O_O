package lojaDeCarros;

import java.util.Scanner;

public class Carro {	
	
	public String condicao;
	public Double valor;
	
public void inserirCondicao() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o estado do ve�culo: 'Novo' ou 'Usado'");
	condicao = scan.nextLine();
	
	System.out.println("Digite o valor do ve�culo: ");
	valor = scan.nextDouble();
	
}
	
public void imprimirCondicao() {
	
	System.out.println("Condi��o do ve�culo: "+condicao+"\nValor do ve�culo: "+valor);
}

}
