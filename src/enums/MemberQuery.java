package enums;

public enum MemberQuery {
	ADD,
	LIST, SEARCH, RETRIEVE, COUNT, 
	UPDATE,
	DELETE,
	LOGIN;

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
	
		case ADD :
			query = "INSERT INTO MEMBER "
					+ "(MEM_ID, MEM_NAME, SSN, PASSWORD) "
					+ "VALUES "
					+ "(? , ? , ? , ?)";
			/*
			 TEAM_ID, GENDER, AGE, ROLL
			 ,'%s','%s','%s','%s'*/
			break;
				
		case COUNT :
			query = "SELECT COUNT(*) AS count FROM MEMBER";
			break;
			
		case LIST :
		/*query = "SELECT * FROM MEMBER";*/
			System.out.println("설렉트올 쿼리방문");
			query = "SELECT B.* "
					+ " FROM ( "
					+ " SELECT "
					+ " ROWNUM NO, "
					+ " A.* "
					+ " FROM ( "
					+ " SELECT MEM_ID "
					+ " FROM MEMBER "
					+ " ) A "
					+ " ORDER BY NO DESC "
					+ ") B "
					+ " WHERE B.NO BETWEEN ? AND ? "
					;	
			break;
		case SEARCH :
			query = "SELECT t.* FROM "
					+ "(SELECT ROWNUM seq, m.* FROM MEMBER m WHERE %s LIKE ? order by seq DESC)t"
					+ " where t.seq between ? and ? ";	
		/*query = " SELECT "
					 + "   MEM_ID, "
				     + "   PASSWORD, "
				     + "   MEM_NAME,   "
				     + "   SSN,    "
				     + "   ROLL,   "
				     + "   TEAM_ID   "
				     + " FROM MEMBER "
					 + "	WHERE TEAM_ID LIKE '%s' ";*/
			
			break;
		case RETRIEVE	:
			System.out.println("파인드바이아이티 쿼리방문");
			query = "  SELECT "
					+ " * "
					/* + "   MEM_ID, "
				     + "   PASSWORD, "
				     + "   MEM_NAME,   "
				     + "   SSN,    "
				     + "   ROLL,   "
				     + "   TEAM_ID   "*/
					 + "   FROM  MEMBER   "
					 + "   WHERE MEM_ID LIKE ?  ";
			break;
		case DELETE : 
			query = " DELETE FROM MEMBER "
					+ " WHERE MEM_ID LIKE ?   "
					+ " AND PASSWORD LIKE ?   ";
			break;
		case UPDATE : 
			System.out.println("비밀번호 업데이트 쿼리 방문");
			query = "UPDATE MEMBER SET %s = ? " 
					+ "WHERE MEM_ID LIKE ? "
					+ "AND PASSWORD LIKE ?' ";
			break;
/*		case SEARCH :
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
			break;*/
		default:
			break;
		}
		return query;
	}
}
