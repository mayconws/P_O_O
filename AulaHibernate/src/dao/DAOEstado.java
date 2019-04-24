package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado {
	
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Estado Inserir(Estado estado) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.persist(estado);
			transacao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}
	
	public Estado Remover(Estado estado) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.remove(estado);
			transacao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}
	
	public Estado Alterar(Estado estado) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.merge(estado);
			transacao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}
	
	public List<Estado> Buscar() {
	
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			
			return gerenciador.createQuery("from estado").getResultList();
	}

}
