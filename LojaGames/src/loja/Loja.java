package loja;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Loja {
	//Método responsável para criar a conexão com o banco.
	private static EntityManagerFactory loja;
	
	public static EntityManagerFactory get() {
		if(loja == null) {
			loja = Persistence.createEntityManagerFactory("lojaGamesPU");
		} return loja;
	}
	
}
