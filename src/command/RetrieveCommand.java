package command;

import javax.servlet.http.HttpServletRequest;

import service.MemberServiceImpl;

public class RetrieveCommand extends Command {
	public RetrieveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		System.out.println("리트리브 커맨드   : "+getAction());
		setPage(request.getParameter("page"));
		execute();
	}
@Override
public void execute() {
	System.out.println("리트리브 커맨드에 들어옴");
	request.setAttribute("member"
			,MemberServiceImpl
			.getInstance()
			.findById(request.getParameter("userid")));
	super.execute();
}
}
