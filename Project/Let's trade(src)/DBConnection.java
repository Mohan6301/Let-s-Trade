import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

		public static Connection getConnection() throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM86","Monar$12");
			
			return conn;
		}
}
