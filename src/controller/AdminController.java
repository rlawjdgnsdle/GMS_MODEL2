package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Sentry;
import enums.Action;
import service.MemberServiceImpl;
@WebServlet("/admin.do")
public class AdminController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("어드민컨트롤러진입 어드민컨트롤러진입 어드민컨트롤러진입 어드민컨트롤러진입 어드민컨트롤러진입 어드민컨트롤러진입 ");
		String page = request.getParameter("page");
//		String action = request.getParameter("action");
		Sentry.init(request);
		System.out.println("어드민컨트롤러진입  ");
		switch (Action.valueOf(Sentry.cmd.getAction().toUpperCase())) {
		case MOVE :
			System.out.println("어드민무브진입");
			Carrier.foward(request, response);
			break;
		case ADMINLOGIN :
			System.out.println("어드민로그인진입");
			Carrier.foward(request, response);
			break;
		case ADMINJOIN :  
			System.out.println("어드민회원가입");
			Carrier.redirect(request, response, "/admin.do?action=move&page=admin_login");
			break;
		case LIST :
			System.out.println("어드민리스트 진입");
			Carrier.foward(request, response);
			break;
		case RETRIEVE :  
			System.out.println("리트리브 진입");
			Carrier.foward(request, response);
		      break;
		case SEARCH :
			System.out.println("서치서치 팀이름으로 검색 진입");
			System.out.println(request.getAttribute("list"));
			Carrier.foward(request, response);
			break;
		case COUNT : 
			System.out.println("어드민 컨트롤러 카운트 케이스");
		    Carrier.foward(request, response);
		    break;
		default:
			break;
		}
		request.getRequestDispatcher("/WEB-INF/view/member/"+page+".jsp");
		}
	
	}
