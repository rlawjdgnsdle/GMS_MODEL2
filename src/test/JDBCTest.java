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
		// } // ������ �߻����� ��츦 ���� ���ؼ� / �ý����� �ٿ�Ǿ��� ���, ���ܷ� ���� �� �ΰ� �۾��� ó��
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ��ü�������θ���
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Hiraeth", "mani6873"); // ���� ���̵� ���
			String sql = "SELECT * FROM TAB";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<String> list = new ArrayList<>();
			int i = 0;
			while (rs.next()) {
				list.add(rs.getString("TNAME"));
			}
			System.out.println("���̺�" + list);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
	}
}
