package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class RemoveCommand extends Command {
	public RemoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {

		System.out.println("슈퍼익스큐트를 타고 delete에 진입");
		MemberBean bean = new MemberBean();
		System.out.println("딜리트커맨드에서 DB가기 전");
		bean.setMemId(request.getParameter("userid"));
		bean.setPassword(request.getParameter("password"));
		MemberServiceImpl.getInstance().remove(bean);
		System.out.println("DELETE 커맨드 안에서 DB 갔다옴");
		super.execute();
		}
	}
