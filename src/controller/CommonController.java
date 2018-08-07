package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.term;

@WebServlet("/common.do")
public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	enum Resources{
		CONTEXT, CSS, JS, IMG;
	}
	
protected void service(HttpServletRequest request,
							HttpServletResponse response)
			throws ServletException, IOException {
	System.out.println("커먼컨트롤러진입");
	
	int i = 0;
	for(Resources r : Resources.values()) {
		if(i==0) {
			request.getSession().setAttribute(r.toString().toLowerCase(),request.getContextPath());
		}else {
			System.out.println(request.getContextPath()+"/resources/"+r.toString().toLowerCase());
		request.getSession()
			.setAttribute(r.toString().toLowerCase(),request.getContextPath()+"/resources/"+r.toString().toLowerCase());
		}
		i++;
	}
		/*HttpSession session = request.getSession(); // new가 아니라 갖고와서 객체를 만드는 관계 객체는 생성하는 게 아니라 !! 리퀘스트가 겟세션을 받았기 때문에 
													// 필드에 있는 getter setter가 자동적으로 걸린다 연관관계는 죽지 않고 쭈욱 가는단계
		session.setAttribute(Domain.CONTEXT.toString(),
					request.getContextPath()); //컨택스트패스와 리퀘스트는 연관관계이기때문에 리퀘스트는 죽지 않는다
*/	
	request.getRequestDispatcher(
		term.WEBPATH.toString()+term.MAIN.toString())
	.forward(request, response);
	System.out.println(term.WEBPATH.toString()+term.MAIN.toString());
	}
}



