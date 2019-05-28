package objeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Principal {
	
	public static void main (String [] args) {
		
		String url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
		
		String user = "root";
		
		try {
		
		Connection conn = DriverManager.getConnection(url, user, "");
		Statement st = conn.createStatement();
		st.executeUpdate("INSERT INTO ESTADO "
				+ "(NOME, SIGLA) VALUES('a','a')");
		
		}catch(Exception e) {
		e.printStackTrace();
		
		}

	}
	
}

