package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Venda;
import fabrica.Fabrica;

public class DAOVenda {

	private EntityManager gerenciador;
	private EntityTransaction transacao;

	public Venda Inserir(Venda venda) {

		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(venda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return venda;
	}

	public Venda Remover(Venda venda) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			venda = gerenciador.find(Venda.class, venda.getId());
			gerenciador.remove(venda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return venda;
	}

	public Venda Alterar(Venda venda) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(venda);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return venda;
	}

	public List<Venda> Buscar() {
		try {

			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();

			return gerenciador.createQuery("from venda").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;
	}
}
