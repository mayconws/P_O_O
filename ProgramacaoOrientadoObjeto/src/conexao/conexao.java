package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class conexao {
	
	private static Connection conn;
	
	public static Connection get() {
		
		try {
			if(conn == null) {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_teste?useTimezone=true&serverTimezone=UTC","root","");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
