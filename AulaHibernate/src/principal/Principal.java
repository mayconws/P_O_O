package principal;

import java.util.Scanner;

import tela.TelaCidade;
import tela.TelaCliente;
import tela.TelaEstado;

public class Principal {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int opcao = 0;

		do {

			System.out.println("Escolha uma das Opções do Menu: \n" + "\n1 - Estado: "
					+ "\n2 - Cidade: " + "\n3 - Cliente: " + "\n4 - Produto: " + "\n5 - Fornecedor: "					
					+ "\n6 - Venda: " + "\n7 - Compra: " + "\n8 - financeiro: "+ "\n9 - Sair: ");
			opcao = scan.nextInt();

			if (opcao == 1) {

				TelaEstado estado = new TelaEstado();

			} else if (opcao == 2) {
				
				TelaCidade cidade = new TelaCidade();

			} else if (opcao == 3) {
				
				TelaCliente cliente = new TelaCliente();

			} else if (opcao == 4) {
				
				System.out.println("--- Falta Implementar ---");						
				
			} else if (opcao == 5) {
				
				System.out.println("--- Falta Implementar ---");	
				
			} else if (opcao == 6) {
				
				System.out.println("--- Falta Implementar ---");
				
			} else if (opcao == 7) {
				
				System.out.println("--- Falta Implementar ---");
				
			} else if (opcao == 8) {
				
				System.out.println("--- Falta Implementar ---");
				
			} else if (opcao == 9) {
				
				System.out.println("--- Fechando... Obrigado! ---");
				break;
				
			}

		} while (opcao != 9);

	}
}
		
