package sdet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jsonToJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn1 = null;
		conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Pass@123");

		Statement stmt = conn1.createStatement();
		ResultSet resultSet = stmt
				.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
		resultSet.next();
		System.out.println(resultSet.getString(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println(resultSet.getString(4));
	}

}
