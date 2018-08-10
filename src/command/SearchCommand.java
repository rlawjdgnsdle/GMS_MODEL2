package command;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import proxy.PageProxy;
import proxy.Pagination;
import service.MemberServiceImpl;

public class SearchCommand extends Command {
	public SearchCommand(HttpServletRequest request) {
		System.out.println("여기는 리스트 커맨드");
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	
	}////dd
	@Override
	public void execute() {
		System.out.println("여기는 리스트 excute 메소드");
		Map<String,Object> param = new HashMap<>();
		String pageNum = request.getParameter("pageNum");
		System.out.println("FFFFFFFF"+request.getParameter("pageNum"));
		PageProxy pxy = new PageProxy();
		int pn = (pageNum==null)
				? 1:
				Integer.parseInt(request.getParameter("pageNum"));
		System.out.println("pn : "+pn);
		pxy.carryout(pn);
		Pagination page;
		page = pxy.getPagination();
		
		request.setAttribute("rowCount", page.getRowCount());
		param.put("beginRow", String.valueOf(page.getBeginRow()));
		param.put("endRow", String.valueOf(page.getEndRow()));
		request.setAttribute("page", page);
		request.setAttribute("list",MemberServiceImpl.getInstance()
				.search(param));
		super.execute();
		
		}}

/*request.setAttribute("count",  //로우카운트
		MemberServiceImpl.getInstance().countMember());
int rowCount = MemberServiceImpl.getInstance().countMember();
int pageSize = 5;
int blockSize = 5;	
int beginPage = 0;
int endPage = 0; 
int pageNum = (request.getParameter("pageNum")==null)? 
		1 : Integer.parseInt(request.getParameter("pageNum")); 
int beginRow = 0; 
int endRow= 0; 
int pageCount =  (int) Math.ceil(rowCount/(double)pageSize);

System.out.println("페이지카운트 "+ pageCount);

int blockCount = (int) Math.ceil(pageCount/(double)blockSize);

System.out.println("블락카운트 " + blockCount);
beginPage = pageNum - ((pageNum-1)%blockSize);
System.out.println("비긴페이지 " + beginPage);
endPage = ((beginPage + pageSize -1) < pageCount)?
		beginPage+blockSize-1:pageCount;
System.out.println("엔드페이지 " + endPage);
beginRow = pageNum*pageSize - (pageSize-1);
System.out.println("비긴로우 " + beginRow);
endRow = pageNum*pageSize;
System.out.println("엔드로우 " + endRow);
int prevBlock = beginPage - blockSize;
int nextBlock = beginPage + blockSize;
boolean existPrev = false;
if(prevBlock >=0) {
existPrev = true;
}
boolean existNext = false;
if(nextBlock <= pageCount) {
existNext = true;
}
request.setAttribute("existPrev", existPrev);
request.setAttribute("existNext", existNext);
request.setAttribute("beginPage", beginPage);
request.setAttribute("endPage", endPage); 
param.put("beginRow", String.valueOf(beginRow));
param.put("endRow", String.valueOf(endRow)); //담아서 던짐. */