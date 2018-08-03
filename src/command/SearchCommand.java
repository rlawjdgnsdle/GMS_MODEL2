package command;

import javax.servlet.http.HttpServletRequest;
import service.MemberServiceImpl;


public class SearchCommand extends Command {
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
@Override 
public void execute() {
	System.out.println("서치커맨드진입");
	String searchOption = request.getParameter("searchOption"); // 
	String searchWord = request.getParameter("searchWord");
	String page = request.getParameter("page");
	String action = request.getParameter("action");
	String domain = super.domain;
	System.out.println("=======================[서치커맨드 익스큐트에 리퀘스트가 가지고 온 것]=======================");
	System.out.println("searchOption : "+searchOption);
	System.out.println("searchWord : "+searchWord);
	System.out.println("page : "+page);
	System.out.println("action : "+action);
	System.out.println("domain : "+domain);
	System.out.println("=======================[서치커맨드 익스큐트에 리퀘스트가 가지고 온 것]=======================");
	/*select * from domain where searchOption like '%searchWord%' */
//	List<MemberBean> list = MemberServiceImpl.getInstance().findByName(searchWord);
	request.setAttribute("list",MemberServiceImpl.getInstance().findByWord(searchOption+"/"+searchWord));
	super.execute();
	/*if(searchOption.equals("teamid")) {
	request.setAttribute("member", MemberServiceImpl.getInstance().findByTeamId(request.getParameter("searchOption")));
	}else if(searchOption.equals("name")){
	request.setAttribute("member", MemberServiceImpl.getInstance().findByName(request.getParameter("searchOption")));	*/
	
	}
}

