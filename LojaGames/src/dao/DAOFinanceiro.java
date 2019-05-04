package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Financeiro;
import loja.Loja;

public class DAOFinanceiro {
	
	private EntityManager gerenciador;
	private EntityTransaction transacao;

	
	public Financeiro Inserir(Financeiro financeiro) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(financeiro);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return financeiro;
	}

	public Financeiro Remover(Financeiro financeiro) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			financeiro = gerenciador.find(Financeiro.class, financeiro.getId());
			gerenciador.remove(financeiro);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return financeiro;
	}

	public Financeiro Alterar(Financeiro financeiro) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(financeiro);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return financeiro;
	}

	public List<Financeiro> Buscar() {
		try {

			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();

			return gerenciador.createQuery("from Financeiro").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;
	}
}
