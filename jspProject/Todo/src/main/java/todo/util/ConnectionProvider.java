package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConnection() throws SQLException {
		
		// DB URL
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		return DriverManager.getConnection(dbUrl, "himedia", "tiger");
	}
	
	public static void main(String[] args) throws SQLException {
		ConnectionProvider.getConnection();
	}

}
