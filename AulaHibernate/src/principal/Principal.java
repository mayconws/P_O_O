package principal;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DAOEstado;
import entidade.Estado;

public class Principal {
	
	public static void main(String args[]) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPU");
		
		EntityManager gerenciador = fabrica.createEntityManager();
		
		//Estado estado = new Estado();
		//estado.setNome("PARANÁ");
		//estado.setSigla("PR");
		
		Estado estado = new Estado();
		DAOEstado dao = new DAOEstado();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o estado: ");
		String nome = scan.nextLine();
		estado.setNome(nome);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Digite a sigla: ");
		String sigla = scan.nextLine();
		estado.setSigla(sigla);				
		
		EntityTransaction transacao = gerenciador.getTransaction();
		
		transacao.begin();
		gerenciador.persist(estado);
		transacao.commit();
	}

}
