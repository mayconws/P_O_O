package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.ItensVenda;
import loja.Loja;

public class DAOItensVenda {

	private EntityManager gerenciador;
	private EntityTransaction transacao;

	public ItensVenda Inserir(ItensVenda itensVenda) {

		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(itensVenda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return itensVenda;
	}

	public ItensVenda Remover(ItensVenda itensVenda) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			itensVenda = gerenciador.find(ItensVenda.class, itensVenda.getId());
			gerenciador.remove(itensVenda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return itensVenda;
	}

	public ItensVenda Alterar(ItensVenda itensVenda) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(itensVenda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return itensVenda;
	}

	public List<ItensVenda> Buscar() {
		try {

			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();

			return gerenciador.createQuery("from ItensVenda").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;
	}
}
