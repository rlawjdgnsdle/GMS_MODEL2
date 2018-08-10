package controller;
import enums.Action;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import command.*;
import domain.MemberBean;
import service.MemberServiceImpl;
@WebServlet("/member.do")

public class MemberContorller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("멤버컨트롤러진입");
		
		Receiver.init(request);
		
		System.out.println("액션 : "+Receiver.cmd.getAction());
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
				
				case ADD :  
					System.out.println("조인진입");
					Carrier.redirect(request, response, "/member.do?action=move&page=user_login_form");
				    break;
				case RETRIEVE : 
					System.out.println("리스트진입");
					Carrier.redirect(request, response, "/member.do?action=move&page=user_login_form");
					break;
				case SEARCH :
					Carrier.redirect(request, response,"/member.do?action=move&page=SearchTeamFromResult");
				      break;
				
				case COUNT :  
					System.out.println("멤버컨트롤러 ㅋㅏ운트");
					Carrier.redirect(request, response, "");
					break;
				case MODIFY :  
					System.out.println("멤버컨트롤러에서 UPDATE case 진입");
					Carrier.redirect(request, response, "/member.do?action=move&page=user_login_Form");
				      break;
				case LOGIN :  
					System.out.println("============ !@#==========");
					if(request.getAttribute("match").equals("TRUE")) {
						Carrier.foward(request, response);
					}else {
						Carrier.redirect(request, response, 
								"/member.do?action=move&page=user_login_Form");
					}
					break;
				case REMOVE : 
					System.out.println("삭제 컨트롤러 진입");
					request.getSession().invalidate();
					Carrier.redirect(request, response, "/member.do?action=move&page=user_login_Form");
					break;
				case MOVE :
					System.out.println("무브진입");
					Carrier.foward(request, response);
					break;
					
				default:
					Carrier.redirect(request, response, "");
					break;
				}
	}
	
}
