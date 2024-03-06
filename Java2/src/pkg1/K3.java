package pkg1;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class K3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url1="jdbc:mysql://localhost:3306/4mw20cs";
		String user1="root";
		String pwd1="root";
		
		String drvr1="com.mysql.cj.jdbc.Driver";
		
		Class.forName(drvr1);  //confused
		Connection conn1=DriverManager.getConnection(url1,user1,pwd1);
		Statement stmt1=conn1.createStatement();
		ResultSet rs1=stmt1.executeQuery("select * from employee");
		while (rs1.next()){
			System.out.println(rs1.getString(2));    //confused
		}
		

	}

}
