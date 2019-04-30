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
					+ "\n2 - Cidade: " + "\n3 - Cliente: " + "\n4 - Produto: "
					+ "\n5 - Venda: ");
			opcao = scan.nextInt();

			if (opcao == 1) {

				TelaEstado estado = new TelaEstado();

			} else if (opcao == 2) {
				
				TelaCidade cidade = new TelaCidade();

			} else if (opcao == 3) {
				
				TelaCliente cliente = new TelaCliente();

			} else if (opcao == 4) {
				
						
				
			} else if (opcao == 5) {
				
				
			}

		} while (opcao != 5);

	}
}
		
