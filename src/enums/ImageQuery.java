package enums;

public enum ImageQuery {
	ADD, RETRIEVE;

@Override
public String toString() {
	String query = "";
	switch (this) {
	case ADD:
		query = " INSERT INTO "
				+ " IMAGE "
				+ " (IMG_SEQ, IMGNAME, EXTENSION, MEM_ID) "
				+ " VALUES (IMG_SEQ.NEXTVAL, ?, ?, ?) ";
		break;
	case RETRIEVE : 
			query = "SELECT * FROM IMAGE WHERE MEM_ID LIKE ? ";
			break;
	default:
		break;
	}
	
	
	return query;
}
}
