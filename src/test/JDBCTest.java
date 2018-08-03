package test;

import java.sql.*;
import java.util.*;

public class JDBCTest {
	public static void main(String[] args) {
		// String sql = "SELECT * FROM TAB";
		// try {
		// Connection conn = DriverManager.getConnection(null);
		// } catch (SQLException e) {
		// e.printStackTrace();
		// } // 문제가 발생했을 경우를 막기 위해서 / 시스템이 다운되었을 경우, 예외로 감싸 놔 두고 작업을 처리
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 객체가나를부른다
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Hiraeth", "mani6873"); // 연결 아이디 비번
			String sql = "SELECT * FROM TAB";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<String> list = new ArrayList<>();
			int i = 0;
			while (rs.next()) {
				list.add(rs.getString("TNAME"));
			}
			System.out.println("테이블" + list);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}
}
