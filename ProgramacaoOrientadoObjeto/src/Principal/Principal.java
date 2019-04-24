package Principal;

import java.sql.ResultSet;
import java.util.Scanner;

import dao.DAOCidade;
import dao.DAOCliente;
import dao.DAOEstado;
import entidade.Cidade;	
import entidade.Cliente;
import entidade.Estado;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("Informe a opção desejada: "
					+ "\n1 - Inserir"
					+ "\n2 - Buscar"
					+ "\n3 - Alterar"
					+ "\n4 - Excluir"
					+ "\n5 - Sair");
			
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				Estado estado = new Estado();
				DAOEstado dao = new DAOEstado();
				Scanner est = new Scanner(System.in);
				System.out.println("Digite o nome do Estado: ");
				String nome = scan.next();
				estado.setNome(nome);	
				
				System.out.println("Digite a Sigla: ");
				String sigla = scan.next();
				estado.setSigla(sigla);
				
				dao.salvar(estado);
				
			}else if (opcao == 2){
				
			}
			
		} while (opcao != 5);
		
		/*		 
		Estado estado = new Estado();
		DAOEstado dao = new DAOEstado();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do Estado: ");
		String nome = scan.next();
		estado.setNome(nome);
		
		System.out.println("Digite a Sigla: ");
		String sigla = scan.next();
		estado.setSigla(sigla);
			
		dao.salvar(estado);
		
		
		Cidade cidade = new Cidade();
		DAOCidade dao1 = new DAOCidade();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Digite o nome da cidade: ");
		String cidadeNome = scan.next();
		cidade.setCidadeNome(cidadeNome);
		
		System.out.println("Informe o ID do Estado: ");
		int estadoId = scan.nextInt();
		cidade.setEstadoId(estadoId);
		
		dao1.salvar(cidade);
		
		Cliente cliente = new Cliente();
		DAOCliente dao2 = new DAOCliente();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Digite o nome do Cliente: ");
		String clienteNome = scan.next();
		cliente.setClienteNome(clienteNome);
		
		System.out.println("Digite o seu RG: ");
		int rg = scan.nextInt();
		cliente.setRg(rg);
		
		System.out.println("Digite o seu telefone");
		int telefone = scan.nextInt();
		cliente.setTelefone(telefone);
		
		dao2.salvar(cliente);
		*/
	}

}
