package loja;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Loja {
	
	private static EntityManagerFactory loja;
	
	public static EntityManagerFactory get() {
		if(loja == null) {
			loja = Persistence.createEntityManagerFactory("lojaGamesPU");
		} return loja;
	}
	
}
