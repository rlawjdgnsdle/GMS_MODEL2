package command;

import javax.servlet.http.HttpServletRequest;

import domain.ImageBean;
import domain.MemberBean;
import service.ImageServiceImpl;
import service.MemberServiceImpl;

public class RetrieveCommand extends Command{
	
	public RetrieveCommand(HttpServletRequest request) {
		System.out.println("리트리브 커맨드 진입");
		setRequest(request);
		setDomain(request.getServletPath().substring(1, 
				request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		System.out.println(request.getParameter("action"));
		setPage(request.getParameter("page"));
		System.out.println(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		super.execute();
		if(request.getParameter("table") != null) {
			request.getSession().setAttribute("user", 
					MemberServiceImpl
					.getInstance()
					.retrieve(
							request.getParameter("table")+"/"+
							request.getParameter("option")+"/"+
							request.getParameter("word")
							)
					);
		}
		
		System.out.println("리트리브 커맨드 execute");
		System.out.println("======="+request.getSession().getAttribute("user"));
		request.getSession().setAttribute("profile", 
				"/upload/"+ImageServiceImpl.getInstance().selectOne(
						((MemberBean)request.getSession().getAttribute("user")).getMemberId()));
		
		
	}
}
