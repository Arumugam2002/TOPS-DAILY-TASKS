package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection driverConnection()
	
	{
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruitable", "root", "");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
