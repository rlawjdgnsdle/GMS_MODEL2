package enums;

public enum Term {
	WEBPATH, MAIN, RESOURCES,CONTEXT, UPLOAD_PATH;
	@Override
	public String toString() {
		String res = "";
		switch(this) {
		case CONTEXT : 
			res = "context";
			break;
		case WEBPATH: 
			res = "/WEB-INF/view/";
			break;
		case MAIN: 
			res = "/main.jsp";
			break;
		case RESOURCES: 
			res = "/resources/";
			break;
			
		case UPLOAD_PATH :
			res =
			"C:/Users/hb1013/Desktop/JSP_MODEL2/GMS_Model3/WebContent/resources/img/upload/";
		default :break;
		}
		return res;
	}
}
