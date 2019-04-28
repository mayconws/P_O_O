package principal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DAOEstado;
import entidade.Estado;
import fabrica.Fabrica;

public class Principal {
	
	public static void main(String args[]) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPU");
		
		EntityManager gerenciador = fabrica.createEntityManager();		
		
	Scanner scan = new Scanner(System.in);	
	int opcao = 0;
	
	do {
		
		System.out.println("Escolha uma das Opções do Menu: \n"
				+ "\n1 - Digite para Inserir: "
				+ "\n2 - Digite para Buscar: "
				+ "\n3 - Digite para Alterar: "
				+ "\n4 - Digite para Excluir: "
				+ "\n5 - Digite para Sair: ");
		opcao = scan.nextInt();
		
if (opcao == 1) {
			
			Estado estado = new Estado();
			DAOEstado dao = new DAOEstado();			
			System.out.println("Digite o estado: ");
			String nome = scan.next();
			estado.setNome(nome);
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Digite a sigla: ");
			String sigla = scan.next();
			estado.setSigla(sigla);				
			
			EntityTransaction transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.persist(estado);
			transacao.commit();
			
		} else if (opcao == 2) {			
			
			Estado estado = new Estado();
			List<Estado> lista = (List<Estado>) new DAOEstado();
		}	
		
	} while (opcao != 4);		
			
	
	}

}
