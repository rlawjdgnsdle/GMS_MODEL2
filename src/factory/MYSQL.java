package factory;

import java.sql.Connection;
import java.sql.DriverManager;

import pool.DBconstant;

public class MYSQL implements Database{
	private Connection conn;
	private String driver,url,id,pass;
	public MYSQL(String driver,
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
//	
				return conn;            
		}

}