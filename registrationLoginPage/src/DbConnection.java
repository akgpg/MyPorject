import java.sql.*;


public class DbConnection {
	Connection conn;
	public DbConnection (String userName,String password) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",userName,password);
		
	}
	
	public Connection getConnection(){
		return conn;
	}
}
