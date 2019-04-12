package prova;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conect {
	
	private static Connection conn;
	
	public static Connection get() {
		try {
			if (conn == null) {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC","root","");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return conn;
	}

}
