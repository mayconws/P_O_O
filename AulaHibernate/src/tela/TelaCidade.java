package tela;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOCidade;
import dao.DAOEstado;
import entidade.Cidade;
import entidade.Estado;

public class TelaCidade {
	
	EntityManagerFactory loja = Persistence.createEntityManagerFactory("lojaGamesPU");

	EntityManager gerenciador = loja.createEntityManager();

	private Scanner scan = new Scanner(System.in);	
	private String menu = "---- MENU CIDADE ----"+
	"\n 1 - Inserir: \n 2 - Buscar: \n 3 - Alterar: \n 4 - Excluir: \n"+
	"---------------------";

	public TelaCidade() {

		String r = "s";
		int opcao = 0;
		do {
			do {
				System.out.println(menu);
				opcao = scan.nextInt();
				scan.nextLine();
				
			} while (opcao < 1 && opcao > 4);

			if (opcao == 1) {

				Cidade cidade = new Cidade();
				Estado estado = new Estado();
				DAOCidade dao = new DAOCidade();
				DAOEstado daoestado = new DAOEstado();
				System.out.println("-----------------");
				System.out.println("Digite a cidade: ");
				String nome = scan.nextLine();			
				cidade.setNome(nome);
				
				System.out.println("-----------------------");
				System.out.println("Digite o ID do estado: ");
				long id = scan.nextLong();				
				estado.setId(id);
				cidade.setEstado(estado);				

				dao.Inserir(cidade);

			} else if (opcao == 2) {

				DAOCidade dao = new DAOCidade();
				Estado estado = new Estado();
				
				System.out.println(" --- LISTAR TODAS AS CIDADES ---");
				List<Cidade> cid = dao.Buscar();

				for (Cidade cidade : cid) {
					System.out.println(" -----------------------------------------------------------------------");
					System.out.println("Id: "+cidade.getId()+" - Cidade: "+cidade.getNome()+" - Estado: "+cidade.getEstado());
				
				}

			} else if (opcao == 3) {

				Cidade cidade = new Cidade();
				Estado estado = new Estado();
				DAOCidade dao = new DAOCidade();
				DAOEstado daoestado = new DAOEstado();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a aleração: ");
				cidade.setId(scan.nextLong());
				System.out.println("Digite o novo nome da cidade: ");
				cidade.setNome(scan.nextLine());
				scan.nextLine();
				System.out.println("Digite o novo ID do estado: ");
				long id = scan.nextLong();				
				estado.setId(id);
				cidade.setEstado(estado);		

				System.out.println("--- Alterando ---");

				dao.Alterar(cidade);

			} else if (opcao == 4) {

				Cidade cidade = new Cidade();
				DAOCidade dao = new DAOCidade();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a exclusão: ");
				cidade.setId(scan.nextLong());
				scan.nextLine();
				dao.Remover(cidade);

			} else if (opcao == 5) {

				System.out.println("---- Fechando o Sistema ----");
				break;
			}

			System.out.println("Continuar? (s/n)");
			r = scan.nextLine();
	} while (r.contentEquals("s"));

	}

}
