package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.conexao;
import entidade.Estado;

public class DAOEstado {
	
	public boolean salvar(Estado estado) {
		try {
			Connection conn = conexao.get();
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO ESTADO (NOME, SIGLA) VALUES ('"+estado.getNome()+"','"+estado.getSigla()+"')");
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}

}
