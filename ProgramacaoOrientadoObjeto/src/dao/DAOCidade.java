package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.conexao;
import entidade.Cidade;

public class DAOCidade {
	
	public boolean salvar(Cidade cidade) {
		try {
			Connection conn = conexao.get();
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO CIDADE (CIDADENOME, ESTADOID) VALUES ('"+cidade.getCidadeNome()+"','"+cidade.getEstadoId()+"')");
			return true;
		} catch (SQLException e){
			return false;
		}
	}

}
