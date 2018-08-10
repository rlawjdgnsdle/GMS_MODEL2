package enums;

public enum term {
	CONTEXT,WEBPATH,MAIN, COMMON;
	
	@Override
	public String toString() {
		String res = "";
		switch (this) {
		case CONTEXT:
			res = "CONTEXT";
			break;
		case WEBPATH:
			res = "/WEB-INF/view/";
			break;
		case MAIN:
			res = "main.jsp";
			break;
		case COMMON :
			res = "common/";
		default:
			break;
		}
		return res;
	}
}
