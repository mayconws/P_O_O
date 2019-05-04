package tela;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOEstado;
import entidade.Estado;

public class TelaEstado {

	EntityManagerFactory loja = Persistence.createEntityManagerFactory("lojaGamesPU");

	EntityManager gerenciador = loja.createEntityManager();

	private Scanner scan = new Scanner(System.in);
	private String menu = "---- MENU ESTADO ----"
			+ "\n 1 - Inserir: \n 2 - Buscar: \n 3 - Alterar: \n 4 - Excluir: \n 5 - Sair: \n"
			+ "---------------------";

	public TelaEstado() {

		String r = "s";
		int opcao = 0;
		do {
			do {
				System.out.println(menu);
				opcao = scan.nextInt();
				scan.nextLine();
			} while (opcao < 1 && opcao > 4);

			if (opcao == 1) {

				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				System.out.println("-----------------");
				System.out.println("Digite o estado: ");
				String nome = scan.nextLine();
				estado.setNome(nome);

				System.out.println("----------------");
				System.out.println("Digite a sigla: ");
				String sigla = scan.nextLine();
				estado.setSigla(sigla);

				dao.Inserir(estado);

			} else if (opcao == 2) {

				DAOEstado dao = new DAOEstado();

				System.out.println(" --- LISTAR TODOS OS ESTADOS ---");
				List<Estado> est = dao.Buscar();

				for (Estado estado : est) {
					System.out.println(" -------------------------------------------------------------------------");
					System.out.println(
							"Id: " + estado.getId() + " - Estado: " + estado.getNome() + " - " + estado.getSigla());

				}

			} else if (opcao == 3) {

				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();

				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a aleração: ");
				estado.setId(scan.nextLong());
				System.out.println("Digite o novo nome: ");
				estado.setNome(scan.nextLine());
				scan.nextLine();

				System.out.println("Digite a nova sigla: ");
				estado.setSigla(scan.nextLine());

				System.out.println("--- Alterando ---");

				dao.Alterar(estado);

			} else if (opcao == 4) {

				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a exclusão: ");
				estado.setId(scan.nextLong());
				scan.nextLine();
				dao.Remover(estado);

			} else if (opcao == 5) {

				System.out.println("---- Fechando o Sistema ----");
				break;
			}

			System.out.println("Continuar? (s/n)");
			r = scan.nextLine();
		} while (r.contentEquals("s"));

	}
}