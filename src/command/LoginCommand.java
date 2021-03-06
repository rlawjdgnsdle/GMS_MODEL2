package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.MemberBean;
import service.MemberServiceImpl;

public class LoginCommand extends Command {
	public LoginCommand(HttpServletRequest request){
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(
						1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage("mypage");
		execute();
}
	@Override
	public void execute() {
		super.execute(); // view.jsp를 만든다
		MemberBean bean = new MemberBean();
		bean.setMemId(request.getParameter("userid")); // 커맨드꺼 
		bean.setPassword(request.getParameter("password"));
		System.out.println("로그인커맨드 안에서 DB가기전");
		if(MemberServiceImpl.getInstance().login(bean)) {
			request.setAttribute("match", "TRUE");
			request.getSession().setAttribute("user", MemberServiceImpl
					.getInstance()  
					.findById(request.getParameter("userid")));
		}else {
			request.setAttribute("match", "FALSE");
		}
		System.out.println("로그인커맨드 안에서 DB갔다옴");
	}
}