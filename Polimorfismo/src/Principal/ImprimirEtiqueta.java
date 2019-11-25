package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class ImprimirEtiqueta {

	public static void main(String[] args) throws ParseException {
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			System.out.println("Produto " + i + ":");
			System.out.print("O produto é Comum, Usado ou Importado? (c/u/i) ");
			char tipo = scan.next().charAt(0);
			
			System.out.print("Nome: ");
			scan.nextLine();
			
			String nome = scan.nextLine();
			System.out.print("Preço: ");
			double preco = scan.nextDouble();
			
			if (tipo == 'c') {
				lista.add(new Produto(nome, preco));
			}
			else if (tipo == 'u') {
				System.out.print("Data da Fabricação: (DD/MM/YYYY): ");
				Date date = data.parse(scan.next());
				lista.add(new ProdutoUsado(nome, preco, date));
			}
			else {
				System.out.print("Valor da Taxa de Importação: ");
				double taxa = scan.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			}
		}
		
		System.out.println();
		System.out.println("Preço das Etiquetas:");
		for (Produto prod : lista) {
			System.out.println(prod.etiquetaProduto());
		}
		
		scan.close();

	}

}
