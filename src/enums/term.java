package enums;

public enum term {
	CONTEXT,WEBPATH,MAIN;
	
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
		default:
			break;
		}
		return res;
	}
}
