//Code for VM - 

package com.db.demo.db;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String user = "System";
		String password = "oracle";
		String sql = "SELECT * FROM employees";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn.toString());

		stmt = conn.createStatement();
		System.out.println(stmt.toString());

		rs = stmt.executeQuery(sql);
		System.out.println(rs.toString());

		while (rs.next()) {
			System.out.println(rs.getString("first_name"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}


//IF the table does not exist - 
// In Oracle SQL Developer -  run these lines one by one - 

//CREATE TABLE employees (eid number(10), first_name varchar(40), salary number(8, 2));
//
//INSERT INTO employees (eid, first_name, salary) VALUES (101, 'Sonu', 90000.50);
//INSERT INTO employees (eid, first_name, salary) VALUES (102, 'Monu', 95000.50);
//INSERT INTO employees (eid, first_name, salary) VALUES (103, 'Tonu', 98000.50);
//
//SELECT * FROM employees;




//package com.db.demo.db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JdbcDemo {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "root";
//		String password = "root";
//
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//
//		conn = DriverManager.getConnection(url, user, password);
//		System.out.println("Connected to the database successfully!");
//
//		stmt = conn.createStatement();
//
//		String sql = "SELECT * FROM sakila.actor";
//		rs = stmt.executeQuery(sql);
//
//		while (rs.next()) {
//			String firstName = rs.getString("first_name");
//			System.out.println("First Name: " + firstName);
//		}
//		rs.close();
//		stmt.close();
//		conn.close();
//	}
//}
//

//package com.db.demo.db;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JdbcDemo {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		String url = "jdbc:mysql://localhost:3306/sakila";
//		String user = "root";
//		String password = "root";
//
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		conn = DriverManager.getConnection(url, user, password);
//		System.out.println("Connected to the database successfully!");
//
//		stmt = conn.createStatement();
//
//		String sql = "SELECT * FROM sakila.actor ORDER BY first_name";
//		rs = stmt.executeQuery(sql);
//
//		while (rs.next()) {
//			String firstName = rs.getString("first_name");
//			System.out.println("First Name: " + firstName);
//		}
//		rs.close();
//		stmt.close();
//		conn.close();
//	}
//}
