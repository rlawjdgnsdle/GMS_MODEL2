package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class UpdateCommand extends Command {
	public UpdateCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		System.out.println("업데이트 커맨드 진입");
	     MemberBean mu = (MemberBean)request.getSession().getAttribute("user");
		/*switch(Domain.valueOf(Sentry.cmd.domain.toUpperCase())) {
		case MEMBER :*/
	     
			  System.out.println("업데이트 커맨드에서 DB가기 전");
		      mu.setMemId(mu.getMemId());
		      System.out.println();
		      mu.setPassword(request.getParameter("password")+
		    		  "/"+(request.getParameter("newPass")));
		      
		      mu.setRoll(request.getParameter("roll"));
		      mu.setTeamId(request.getParameter("teamId"));
			  MemberServiceImpl.getInstance().updateMember(mu);
			  System.out.println("mu.toString : "+ mu.toString());
		/*default:
			break;
			}*/
		System.out.println("업데이트 커맨드에서 DB갔다옴");
		String teamId = request.getParameter("teamId");
		System.out.println("팀아이디 : "+teamId);
		String roll = request.getParameter("roll");
		System.out.println("역할 : "+roll);

			super.execute();
	}
}
