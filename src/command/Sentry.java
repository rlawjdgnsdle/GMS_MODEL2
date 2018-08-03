package command;

import javax.servlet.http.HttpServletRequest;

public class Sentry {
	public static Command cmd=new Command(); //명령을 수행함 static으로 준 이유는?? 일을 한개만 처리하게끔 하기 위해서 
											 //정보를 계속 끌고가는게 아니라 자기 할 일만 하고 다른 사람에게 인계한다.
	public static void init
			(HttpServletRequest request) {
		String servletPath=request.getServletPath();
		System.out.println("센트리 : "+servletPath.substring(1, servletPath.indexOf("."))); // 0번부터 안가고 1번부터시작하는 이유
		cmd = Commander.order(request);   
	}
}

