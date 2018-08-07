package command;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import service.MemberServiceImpl;

public class ListCommand extends Command {
	public ListCommand(HttpServletRequest request) {
		System.out.println("여기는 리스트 커맨드");
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	
	}//
	@Override
	public void execute() {
		System.out.println("여기는 리스트 excute 메소드");
		int count = 100;
		int pageSize = 5;   // 페이지의 크기
		int blockSize = 5;  // 블락의 갯수
		int pageCount = 0;  // 페이지 갯수
		int blockCount =0;	//
		int rowCount = MemberServiceImpl.getInstance().countMember();
		/*int endRow = pageSize;*/
		String pageNum = request.getParameter("pageNum");
		if(pageNum==null){
			System.out.println("페이지가 없음");
		}else{
			System.out.println("페이지가 있음");
		}
		
//		request.setAttribute("count",MemberServiceImpl.getInstance().countMember());
		request.setAttribute("count","20");
		request.setAttribute("beginPage", "1");
		request.setAttribute("endPage", "5");
		if(count/5<6) {
			if(rowCount%pageSize==0) {
				pageCount = rowCount/pageSize;
			}else{
				pageCount = rowCount/pageSize+1;
			};
			
		int beginRow = 0;
		int endRow = 0;
			beginRow = Integer.parseInt(pageNum)*blockSize - (pageSize -1);
			endRow = Integer.parseInt(pageNum)*pageSize;
			int beginPage = 0;
			int prevBlock = beginPage  - blockSize;
			int nextBlock = beginPage + blockSize;
			if(pageCount%blockSize==0) {
				blockCount = pageCount/blockSize;
			}else {
				blockCount = pageCount/blockSize+1;
			}
			beginPage = 1;
			int endPage = pageCount / blockSize;
			beginRow = 1;
			endRow = pageCount*pageSize;
		HashMap<String, Object> param = new HashMap<>();
		if(pageCount%blockSize==0) {
			endPage = pageCount / blockSize;
		}else {
			endRow=0;
			endPage = pageCount / blockSize + 1;
		}	
		if(Integer.parseInt(pageNum)!=endPage) {
			endRow = Integer.parseInt(pageNum)*pageSize;
			beginRow = endRow - (pageSize -1);
		}else{
			endRow = rowCount;
		}
		beginPage = Integer.parseInt(pageNum)*blockSize - (pageSize -1);
		
			/*endPage = ((beginPage + pageSize - 1) < pageCount));*/
		if(rowCount/pageSize<pageSize+1) {
			if(rowCount/pageSize==0) {
					endPage = rowCount/pageSize;
			}else {
					endPage = rowCount/pageSize+1;
			}
		}else{
			endPage = blockSize;
			/*int prevBlock = (beginPage + pageSize -1)*/
			
			
		};
		boolean existPrev = false;
		if(prevBlock >= 0) {
			existPrev = true;
		}
		boolean existNext = false;
		if(nextBlock >= 0) {
			existPrev = true;
		}
		
		Map<String, Object> map = new HashMap<>();
		/*HashMap<String, Object> map = new HashMap<>();*/
		param.put("beginRow", beginRow);
		param.put("endRow", endRow);
		System.out.println(beginRow);
		System.out.println(endRow);
		List<MemberBean> mems = MemberServiceImpl.getInstance().getList(param);
		request.setAttribute("count", rowCount);
		request.setAttribute("beginPage", beginPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("list", MemberServiceImpl.getInstance().getList(param));
		super.execute();
		}}}

