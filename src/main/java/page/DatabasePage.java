package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabasePage {

	public static String getData(String columnName) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://localhost:3306/feb2022";
		String sqlusername = "root";
		String sqlpassword = "Tanu@1909";
		String query = "select * from users";
		// creating connection to local database
		Connection con = DriverManager.getConnection(sqlUrl, sqlusername, sqlpassword);
		// empowering the con reference variable to execute queries
		Statement smt = con.createStatement();
		//executing the queries
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
		return	rs.getString(columnName);
		}
		return null;

	}

}
