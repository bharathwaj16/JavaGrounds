package JDBC;

import java.sql.*;
public class JDBCConnectivity {

public static void main(String[] args) throws Exception {
	
	String url = "jdbc:mysql://localhost:3306/aliens"; //jdbc:SQLName://localhost:portNumber/ServerName
	String username = "root"; //System's user name
	String password = "";
	String query = ""; //Query to be executed
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query); //For insert queries use st.executeUpdate()
	rs.next();
	String output = rs.getString("");
	rs.next();
	String secondOutput = rs.getString("");
	
	System.out.println(output);
	System.out.println(secondOutput);
	
	
	st.close();
	con.close();
	
}	
}
