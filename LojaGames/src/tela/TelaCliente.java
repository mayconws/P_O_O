package tela;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOCidade;
import dao.DAOCliente;
import entidade.Cidade;
import entidade.Cliente;
import entidade.Estado;

public class TelaCliente {
	
	EntityManagerFactory loja = Persistence.createEntityManagerFactory("lojaGamesPU");

	EntityManager gerenciador = loja.createEntityManager();

	private Scanner scan = new Scanner(System.in);	
	private String menu = "---- MENU CLIENTE ----"+
	"\n 1 - Inserir: \n 2 - Buscar: \n 3 - Alterar: \n 4 - Excluir: "+
	"---------------------";

	public TelaCliente() {

		String r = "s";
		int opcao = 0;
		do {
			do {
				System.out.println(menu);
				opcao = scan.nextInt();
				scan.nextLine();
			} while (opcao < 1 && opcao > 4);

			if (opcao == 1) {

				Cliente cliente = new Cliente();
				Cidade cidade = new Cidade();
				DAOCliente dao = new DAOCliente();
				DAOCidade daocidade = new DAOCidade();
				System.out.println("-------------------");
				System.out.println("Digite o seu nome: ");
				String nome = scan.nextLine();				
				cliente.setNome(nome);
					
				System.out.println("Digite o endereço: ");
				String endereco = scan.nextLine();
				cliente.setEndereco(endereco);
				
				System.out.println("Digite o RG: ");
				String rg = scan.nextLine();
				cliente.setRg(rg);
				
				System.out.println("Digite o CPF: ");
				String cpf = scan.nextLine();
				cliente.setCpf(cpf);
				
				System.out.println("Informe o ID da cidade: ");
				long id = scan.nextLong();				
				cidade.setId(id);
				cliente.setCidade(cidade);								

				dao.Inserir(cliente);

			} else if (opcao == 2) {

				DAOCliente dao = new DAOCliente();
				Cidade cidade = new Cidade();
				
				System.out.println(" --- LISTAR TODOS OS CLIENTES ---");
				List<Cliente> cli = dao.Buscar();

				for (Cliente cliente : cli) {
					System.out.println(" -------------------------------------------------------------------------------------");
					System.out.println("Id: "+cliente.getId()+" - Cliente: "+cliente.getNome()+" - Endereço: "+
					cliente.getEndereco()+" - RG: "+cliente.getRg()+" - CPF: "+cliente.getCpf()+" Cidade: "+cliente.getCidade());
					
				}

			} else if (opcao == 3) {

				Cliente cliente = new Cliente();
				Cidade cidade = new Cidade();
				DAOCliente dao = new DAOCliente();
				DAOCidade daocidade = new DAOCidade();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a aleração: ");
				cliente.setId(scan.nextLong());				
				System.out.println("Digite o novo nome: ");
				cliente.setNome(scan.nextLine());
				scan.nextLine();
				
				System.out.println("Digite o novo RG: ");				
				cliente.setRg(scan.nextLine());	
				
				System.out.println("Digite o novo endereço: ");				
				cliente.setEndereco(scan.nextLine());
				
				System.out.println("Digite o novo RG: ");				
				cliente.setRg(scan.nextLine());
				
				System.out.println("Digite o novo CPF: ");				
				cliente.setCpf(scan.nextLine());
				
				System.out.println("Informe o novo ID da cidade: ");
				long id = scan.nextLong();				
				cidade.setId(id);
				cliente.setCidade(cidade);	

				System.out.println("--- Alterando ---");

				dao.Alterar(cliente);

			} else if (opcao == 4) {

				Cliente cliente = new Cliente();
				DAOCliente dao = new DAOCliente();
				System.out.println("---------------------------------------");
				System.out.println("Informe o ID para realizar a exclusão: ");
				cliente.setId(scan.nextLong());
				scan.nextLine();
				
				dao.Remover(cliente);

			} else if (opcao == 5) {
				
				System.out.println("---- Fechando o Sistema ----");
				break;
			}

			System.out.println("Continuar? (s/n)");
			r = scan.nextLine();
	} while (r.contentEquals("s"));

	}

}
