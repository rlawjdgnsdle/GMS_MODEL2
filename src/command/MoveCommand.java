package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class MoveCommand extends Command {
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		System.out.println("무브커맨드진입");
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
}



