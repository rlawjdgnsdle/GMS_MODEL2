package template;

import java.sql.ResultSet;

import domain.MemberBean;
import enums.Domain;
import factory.DatabaseFactory;

public class PstmtQuery extends QuertTemplate {

	@Override
	void initialize() {
		map.put("sql", String.format(
				"SELECT "
				+ ColumnFinder.find(Domain.MEMBER)
				+ " FROM %s "
				+ " WHERE %s "
				+ " LIKE ? ",
				map.get("table"),
				map.get("column")));
	}

	@Override
	void startPlay() {
		try {
		pstmt = DatabaseFactory
					.createDatabase2(map)
					.getConnection()
					.prepareStatement((String)map.get("sql"));
		pstmt.setString(1,
				"%"+map.get("value").toString()+"%");
		
		} catch(Exception e){	
			e.printStackTrace();
		}
	}

	@Override
	void endPlay() {
		try {
			ResultSet rs = pstmt.executeQuery();
			MemberBean mem = null;
			while(rs.next()) {
				mem = new MemberBean();
				mem.setMemId(rs.getString("MEM_ID"));
				mem.setTeamId(rs.getString("TEAM_ID"));
				mem.setMemName(rs.getString("MEM_NAME"));
				mem.setAge(rs.getString("AGE"));
				mem.setRoll(rs.getString("ROLL"));
				mem.setPassword(rs.getString("PASSWORD"));
				mem.setPassword(rs.getString("SSN"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
