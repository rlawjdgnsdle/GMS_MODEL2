package enums;

public enum MemberQuery {
	LOGIN, INSERT_MEMBER, 
	COUNT_MEMBER, UPDATE, 
	SELECT_ALL_MEMBER, SELECT_ALL,
	FINE_BY_TEAMNAME, FIND_BY_ID, 
	DELETE, INSERT_ADMIN_MEMBER
	, UPDATE_TEAMID	, UPDATE_ROLL, SEARCH, FINDBYNAME;

	@Override
	public String toString() {
		String query = "";
		switch (this) {
		case LOGIN:
			query = " SELECT MEM_ID , "
				    + " TEAM_ID, " 
					+ " MEM_NAME, "
					+ " AGE, "
					+ " ROLL, "
					+ " PASSWORD, "
					+ " SSN "
					+ " FROM MEMBER "
					+ " WHERE MEM_ID LIKE '%s' "
					+ " AND PASSWORD LIKE '%s' ";
			break;
	
		case INSERT_MEMBER:
			query = "INSERT INTO MEMBER "
					+ "(MEM_ID, MEM_NAME, SSN, PASSWORD) "
					+ "VALUES "
					+ "('%s','%s','%s','%s')";
			/*
			 TEAM_ID, GENDER, AGE, ROLL
			 ,'%s','%s','%s','%s'*/
			break;
				
		case COUNT_MEMBER :
			query = "SELECT COUNT(*) AS count FROM MEMBER";
			break;
			
		case SELECT_ALL :
			query = "SELECT * FROM MEMBER";
			break;
		case SEARCH :
			query = " SELECT "
					 + "   MEM_ID, "
				     + "   PASSWORD, "
				     + "   MEM_NAME,   "
				     + "   SSN,    "
				     + "   ROLL,   "
				     + "   TEAM_ID   "
				     + " FROM MEMBER "
					 + "	WHERE TEAM_ID LIKE '%s' ";
			break;
		case FIND_BY_ID	:
			System.out.println("파인드바이아이티 쿼리방문");
			query = "  SELECT "
					 + "   MEM_ID, "
				     + "   PASSWORD, "
				     + "   MEM_NAME,   "
				     + "   SSN,    "
				     + "   ROLL,   "
				     + "   TEAM_ID   "
					 + "   FROM  MEMBER   "
					 + "   WHERE MEM_ID LIKE '%s'  ";
			break;
		case DELETE : 
			query = " DELETE FROM MEMBER "
					+ " WHERE MEM_ID LIKE '%s'   "
					+ " AND PASSWORD LIKE '%s'  ";
			break;
		case UPDATE : 
			System.out.println("비밀번호 업데이트 쿼리 방문");
			query = "UPDATE MEMBER SET PASSWORD = '%s' , TEAM_ID ='%s', ROLL = '%s' " 
					+ "WHERE MEM_ID LIKE '%s' "
					+ "AND PASSWORD LIKE '%s'";
			break;
		case FINDBYNAME :
			System.out.println("파인드바이네임 쿼리 진입");
			query = "  SELECT "
					 + "   MEM_ID, "
				     + "   PASSWORD, "
				     + "   MEM_NAME,   "
				     + "   SSN,    "
				     + "   ROLL,   "
				     + "   TEAM_ID   "
					 + "   FROM  MEMBER   "
					 + "   WHERE MEM_NAME LIKE '%s'  ";
			break;
		default:
			break;
		}
		return query;
	}
}
