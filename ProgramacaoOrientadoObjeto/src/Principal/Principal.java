package Principal;

import java.util.Scanner;

import dao.DAOCidade;
import dao.DAOCliente;
import dao.DAOEstado;
import entidade.Cidade;	
import entidade.Cliente;
import entidade.Estado;

public class Principal {
	
	public static void main(String[] args) {		
				 
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
		
	}

}
