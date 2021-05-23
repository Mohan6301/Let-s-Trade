
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Update {

	public void signUp(String u, int p) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DBConnection.getConnection();
		   
		String sql="insert into Login(UNAME,PWD) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,u);
		ps.setInt(2,p);
		ps.executeUpdate();
		/*boolean flag = rs.next();
		return flag;*/
		
	}
	public void UpdatePin(String u, int p) throws Exception{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DBConnection.getConnection();
		   
		String sql="update Login set PWD=? where UNAME=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,p);
		ps.setString(2,u);
		ps.executeUpdate();
	}
	
}
