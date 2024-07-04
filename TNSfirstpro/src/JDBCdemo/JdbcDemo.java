package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//for loading the driver
			System.out.println("Driver Loaded Successfully!!!");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07","root","123");//create connection
			System.out.println("Connection establish successfully!!");
			Statement st=cn.createStatement();
			//st.executeQuery("SELECT * FROM STUDENT");
			ResultSet rs=st.executeQuery("SELECT * FROM STUDENT");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
			}
			System.out.println("-------------------------------------------------");
			cn.close();
			System.out.println("Connection close successfully!!");
			System.out.println("--------------------------------------------------------");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
