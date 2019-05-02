package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Cidade;
import loja.Loja;

public class DAOCidade {

	private EntityManager gerenciador;
	private EntityTransaction transacao;

	public Cidade Inserir(Cidade cidade) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(cidade);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return cidade;
	}

	public Cidade Remover(Cidade cidade) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			cidade = gerenciador.find(Cidade.class, cidade.getId());
			gerenciador.remove(cidade);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return cidade;
	}

	public Cidade Alterar(Cidade cidade) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(cidade);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return cidade;
	}

	public List<Cidade> Buscar() {
		try {

			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();

			return gerenciador.createQuery("from Cidade").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;
	}
}
