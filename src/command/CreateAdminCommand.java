package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import service.MemberServiceImpl;

public class CreateAdminCommand extends Command {
	public CreateAdminCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
			System.out.println("회원가입에 들어옴!!");
			MemberBean mem = new MemberBean();
		    mem.setMemId(request.getParameter("userid"));
		    mem.setMemName(request.getParameter("name"));
		    mem.setPassword(request.getParameter("password"));
		    mem.setSsn(request.getParameter("SSN"));
		    MemberServiceImpl.getInstance().insertMember(mem);
		    System.out.println("회원가입 성공!!");
	}
}
