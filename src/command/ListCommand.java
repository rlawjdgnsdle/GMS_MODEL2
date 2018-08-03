package command;


import javax.servlet.http.HttpServletRequest;

import service.*;

public class ListCommand extends Command {
	public ListCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		System.out.println("너어디sirh");
		request.setAttribute("list", MemberServiceImpl.getInstance().listMember());
		request.setAttribute("count",MemberServiceImpl.getInstance().countMember());
		super.execute();
	}
}

