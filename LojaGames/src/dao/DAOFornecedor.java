package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entidade.Fornecedor;
import loja.Loja;

public class DAOFornecedor {
	
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Fornecedor Inserir(Fornecedor fornecedor) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.persist(fornecedor);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return fornecedor;
	}

	public Fornecedor Remover(Fornecedor fornecedor) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			fornecedor = gerenciador.find(Fornecedor.class, fornecedor.getId());
			gerenciador.remove(fornecedor);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return fornecedor;
	}

	public Fornecedor Alterar(Fornecedor fornecedor) {
		try {
			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();
			transacao = gerenciador.getTransaction();

			transacao.begin();
			gerenciador.merge(fornecedor);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return fornecedor;
	}

	public List<Fornecedor> Buscar() {
		try {

			EntityManagerFactory loja = Loja.get();
			gerenciador = loja.createEntityManager();

			return gerenciador.createQuery("from Fornecedor").getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			transacao.rollback();
		} finally {
			gerenciador.close();
		}
		return null;
	}
}
