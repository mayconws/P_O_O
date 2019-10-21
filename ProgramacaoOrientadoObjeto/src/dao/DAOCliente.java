package dao;

import java.sql.Connection;
import java.sql.Statement;

import conexao.conexao;
import entidade.Cliente;

public class DAOCliente {
	
	public boolean salvar(Cliente cliente) {
		try {
			Connection conn = conexao.get();
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO CLIENTE (CLIENTENOME, RG, TELEFONE, CIDADEID) VALUES ('"+cliente.getClienteNome()
			+"','"+cliente.getRg()+"','"+cliente.getTelefone()+"','"+cliente.getCidadeId()+"')");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
