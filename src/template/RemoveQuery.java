package template;

import java.sql.SQLException;


import enums.Domain;
import enums.MemberQuery;

public class RemoveQuery extends QueryTemplate{

	@Override
	void initialize() {
		switch((Domain)(map.get("table"))) {
		case MEMBER : 
			map.put("sql", MemberQuery.DELETE.toString());
			break;
		default:
			break;
		}
	}

	@Override
	void startPlay() {
		
	}

	@Override
	void endPlay() {
		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
