import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckUser  {
	static boolean flag;
	
	public static boolean checkUser(String u , int p) throws Exception{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DBConnection.getConnection();
	   
	String sql="Select * from Login where UNAME=? and PWD=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,u);
	ps.setInt(2,p);
	ResultSet rs = ps.executeQuery();
	flag = rs.next();
	return flag;
}
	
	public static boolean checkUsername(String u) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DBConnection.getConnection();
		   
		String sql="Select * from Login where UNAME=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,u);
		//ps.setInt(2,p);
		ResultSet rs = ps.executeQuery();
		flag = rs.next();
		return flag;
	}
	
	public static boolean checkUserPin( int p) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DBConnection.getConnection();
		   
		String sql="Select * from Login where PWD=?";
		PreparedStatement ps = con.prepareStatement(sql);
		//ps.setString(1,u);
		ps.setInt(1,p);
		ResultSet rs = ps.executeQuery();
		flag = rs.next();
		return flag;
	}
}
