package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import service.MemberServiceImpl;

public class RemoveCommand extends Command {
	public RemoveCommand(HttpServletRequest request) {
		System.out.println("리무브 커맨드 진입");
		setRequest(request);
		setAction(request.getParameter("action"));
		System.out.println(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1, 
				request.getServletPath().indexOf(".")));
		System.out.println(request.getServletPath().substring(1, 
				request.getServletPath().indexOf(".")));

		execute();
	}
	@Override
	public void execute() {
		System.out.println("리무브 커맨드 익스큐트");
		if(request.getParameter("password").equals(((MemberBean)request.getSession().getAttribute("user")).getPass()))
		{	
		MemberServiceImpl
		.getInstance()
		.remove((MemberBean) request.getSession()
							.getAttribute("user"));
			request.getSession().invalidate();
			}else {
				System.out.println("===================");
			}
		}
	}
