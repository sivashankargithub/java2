package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class K2 {
	public static void main(String[] args) throws ClassNotFoundException{
		String url1="jdbc:mysql://localhost:3306/4mw20cs";
		String user1="root";
		String pwd1="root";
		String drvr="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(drvr);
			Connection conn1=DriverManager.getConnection(url1,user1,pwd1);
			Statement stm1=conn1.createStatement();
			ResultSet rs1=stm1.executeQuery("select * from employee");
			while (rs1.next()){
				System.out.println(rs1.getString(2)+"-"+rs1.getInt(1)); 
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
