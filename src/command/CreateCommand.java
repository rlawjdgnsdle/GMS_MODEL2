package command;

import javax.servlet.http.HttpServletRequest;
import com.sun.org.apache.regexp.internal.recompile;
import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request){
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		switch(Domain.valueOf(domain.toUpperCase())) {
		case MEMBER :
			System.out.println("회원가입에 들어옴!!");
			MemberBean mem = new MemberBean();
		    mem.setMemId(request.getParameter("userid"));
		    mem.setMemName(request.getParameter("name"));
		    mem.setPassword(request.getParameter("password"));
		    mem.setSsn(request.getParameter("SSN"));
		    mem.setGender(request.getParameter("gender"));
		    mem.setAge(request.getParameter("age"));
		    mem.setRoll(request.getParameter("roll"));
		    mem.setTeamId(request.getParameter("teamid"));
		    mem.setSubject(ParamMap.getValues(request, "subject"));
		    MemberServiceImpl.getInstance().add(mem);
		    System.out.println("회원가입 성공!!");
		    break;
		default:
			break;
		}
	}
}
