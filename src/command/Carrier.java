package command;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrier {  //보내는 일 외에는 하지 않는다.
	public static void foward(HttpServletRequest request,
			HttpServletResponse response)
			{
		System.out.println("뷰 : "+Sentry.cmd.getView());
		try {
			request.getRequestDispatcher(Sentry.cmd.getView()) //System.out.println(); 를 패턴화한 것?
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void redirect(HttpServletRequest request,
			HttpServletResponse response,String url) {
		try {
			response.sendRedirect(request.getContextPath()+url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

//Sentry가 결정지으면 캐리어는 받아서 view로 보내기만 한다…?  