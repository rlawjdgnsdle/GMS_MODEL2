package template;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.MemberBean;
import factory.DatabaseFactory;

public class UpdateQuery extends QuertTemplate {

	@Override
	void initialize() {
		map.put("sql", String.format(
				" SELECT * FROM %s "
			  + " WHERE %s "
			  + " LIKE ? "	
				));
	}

	@Override
	void startPlay() {
			MemberBean bean = (MemberBean) map.get("dom");
			try {
				super.pstmt = DatabaseFactory.createDatabase2(map).getConnection().prepareStatement((String) map.get("sql"));
				pstmt.setString(1, bean.getMemName());
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	void endPlay() {
			try {
				ResultSet rs = pstmt.executeQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
