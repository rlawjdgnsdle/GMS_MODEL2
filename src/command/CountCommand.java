package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberServiceImpl;

public class CountCommand extends Command{
	public CountCommand(HttpServletRequest request){
	setRequest(request);
	setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
	setAction(request.getParameter("action"));
	setPage(request.getParameter("page"));
	execute();
}
	@Override
	public void execute() {
		System.out.println("너어디야");
		request.setAttribute("count",
					MemberServiceImpl.getInstance().countMember());
		super.execute();
	}
}
