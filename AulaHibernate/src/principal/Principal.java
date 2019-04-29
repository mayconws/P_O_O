package principal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOEstado;
import entidade.Estado;

public class Principal {

	public static void main(String args[]) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPU");

		EntityManager gerenciador = fabrica.createEntityManager();

		Scanner scan = new Scanner(System.in);
		int opcao = 0;

		do {

			System.out.println("Escolha uma das Opções do Menu: \n" + "1 - Digite para Inserir: "
					+ "\n2 - Digite para Buscar: " + "\n3 - Digite para Alterar: " + "\n4 - Digite para Excluir: "
					+ "\n5 - Digite para Sair: ");
			opcao = scan.nextInt();

			if (opcao == 1) {

				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				System.out.println("-----------------");
				System.out.println("Digite o estado: ");
				String nome = scan.next();
				estado.setNome(nome);

				Scanner scan1 = new Scanner(System.in);
				System.out.println("----------------");
				System.out.println("Digite a sigla: ");
				String sigla = scan.next();
				estado.setSigla(sigla);

				dao.Inserir(estado);

			} else if (opcao == 2) {
				
				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				dao.Buscar();

			} else if (opcao == 3) {
				
				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a aleração: ");	
				estado.setId(scan.nextLong());
				System.out.println("Novo nome: ");
				estado.setNome(scan.next());
				System.out.println("Nova sigla: ");
				estado.setSigla(scan.next());
				
				System.out.println("Alterando...");
				dao.Alterar(estado);				

			} else if (opcao == 4) {
				
				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a exclusão: ");
				estado.setId( scan.nextLong() );
				dao.Remover(estado);				
				
			} else if (opcao == 5) {
				
				System.out.println("---- Fechando o Sistema ----");
			}

		} while (opcao != 4);

	}
}
		
