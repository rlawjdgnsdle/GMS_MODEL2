package template;

import java.sql.ResultSet;
import java.sql.SQLException;

import enums.MemberQuery;
import factory.DatabaseFactory;

public class CountQuery extends QuertTemplate {

	@Override
	void initialize() {
		System.out.println("카운트 쿼리 들어옴");
		map.put("sql", MemberQuery.COUNT.toString());
		System.out.println("카운트쿼리임"+MemberQuery.COUNT.toString());
	}

	@Override
	void startPlay() {
		try {
			pstmt = DatabaseFactory.createDatabase2(map).getConnection().prepareStatement((String) map.get("sql"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	void endPlay() {
		number = 0;  // super 생략
		ResultSet rs;
		try {
			rs = pstmt.executeQuery();
			if(rs.next()) {
				number = rs.getInt("COUNT");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
