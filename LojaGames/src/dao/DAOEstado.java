package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Estado;
import loja.Loja;

public class DAOEstado {

	private EntityManager gerenciador;
	private EntityTransaction transacao;

	public Estado Inserir(Estado estado) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(estado);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}

	public Estado Remover(Estado estado) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			estado = gerenciador.find(Estado.class, estado.getId());
			gerenciador.remove(estado);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}

	public Estado Alterar(Estado estado) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(estado);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}

	public List<Estado> Buscar() {
		try {

			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();

			return gerenciador.createQuery("from Estado").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;

	}
}
