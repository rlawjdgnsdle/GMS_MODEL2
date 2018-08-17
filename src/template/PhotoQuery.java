package template;



import enums.ImageQuery;

public class PhotoQuery extends QueryTemplate{

	@Override
	void initialize() {
		map.put("sql", ImageQuery.ADD.toString());
	}

	@Override
	void startPlay() {
		try {
			pstmt.setString(1, (String) map.get("imgName"));
			pstmt.setString(2, (String) map.get("ext"));
			pstmt.setString(3, (String) map.get("memid"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	void endPlay() {
		try {
			pstmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
