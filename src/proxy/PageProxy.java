package proxy;

import lombok.Data;

@Data
public class PageProxy implements Proxy {
	private Pagination pagination;
	@Override
	public void carryout(Object o) {
		this.pagination = new Pagination();
		pagination.carryout(o);
	}

}
/*
HttpServletRequest request;
@Override
public Map<?, ?> carryout(Map<?, ?>param) {
	Map<String, Object> map = new HashMap<>();
	request = (HttpServletRequest) param.get("request");
	request.setAttribute("existPrev", existPrev);
	request.setAttribute("existNext", existNext);
	request.setAttribute("count", rowCount);
	request.setAttribute("beginPage", beginPage);
	request.setAttribute("endPage", endPage);
	request.setAttribute("page1", page);
	map.put("request",request);
	return map;
} */