package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pool.DBconstant;

public class TestDAO {
	private static TestDAO instance = new TestDAO();
	public static TestDAO getInstance() {return instance;}
	Statement stmt;
	Connection conn;
	private TestDAO() {
		try {
			Class.forName(DBconstant.ORACLE_DRIVER);
			conn = DriverManager.getConnection(DBconstant.CONNECTION_URL, DBconstant.USERNAME,DBconstant.PASSWORD);
			stmt = conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<String> age(){
		List<String> lst = new ArrayList<>();
		try {
			String sql = "SELECT SSN FROM MEMBER ORDER BY SSN";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				lst.add(rs.getString("SSN"));
			}
			System.out.println("ssn√ﬂ√‚" + lst);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;  
	}
}
