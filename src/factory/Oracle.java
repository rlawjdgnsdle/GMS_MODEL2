package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import pool.DBconstant;

public class Oracle implements Database {
	private Connection conn;
	private String driver,url,id,pass;
	public Oracle(String driver,
				  String url,
				  String id,
				  String pass) {
		this.driver = driver;
		this.url = url;
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public Connection getConnection() {
		Connection conn = null;
//		Statement stmt;
		try {
			Class.forName(DBconstant.ORACLE_DRIVER);
			conn = DriverManager.getConnection(DBconstant.CONNECTION_URL, DBconstant.USERNAME, DBconstant.PASSWORD);
//			stmt = conn.createStatement();
		} catch (Exception e) {e.printStackTrace();}
				return conn;            
		}

}
