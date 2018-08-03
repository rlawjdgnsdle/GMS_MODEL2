package factory;

import java.util.Map;

import enums.Vendor;
import pool.DBconstant;

public class DatabaseFactory {
	public static Database createDatabase(
			Vendor v, String id, String pass) {
		
		Database db = null;
		String driver = "", url = "";
		
		switch (v) {
		case ORACLE:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new Oracle(driver,url,id,pass);
			break;
		case MARIADB:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MariaDB(driver,url,id,pass);
			break;
		case MYSQL:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MYSQL(driver,url,id,pass);
			break;
		case MSSQL:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MSSQL(driver,url,id,pass);
			break;

		}
		return db;
		
	}


public static Database createDatabase2(
		Map<String,?>map) {
		Database db = null;
		String driver = "", url = "";
		switch ((Vendor)map.get("vender")) {
		case ORACLE:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new Oracle(driver,url,
						(String)map.get("username"),
						(String)map.get("password"));
			break;
		case MARIADB:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MariaDB(driver,url,
					(String)map.get("username"),
					(String)map.get("password"));
			break;
		case MYSQL:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MYSQL(driver,url,
					(String)map.get("username"),
					(String)map.get("password"));
			break;
		case MSSQL:
			driver = DBconstant.ORACLE_DRIVER;
			url = DBconstant.CONNECTION_URL;
			db = new MSSQL(driver,url,
					(String)map.get("username"),
					(String)map.get("password"));
			break;

		}
		return db;
		
	}
}

