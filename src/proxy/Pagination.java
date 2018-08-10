package proxy;



import lombok.Data;
import service.MemberServiceImpl;

@Data
public class Pagination implements Proxy {
	int pageSize = 5;   // 페이지의 크기
	int blockSize = 5;  // 블락의 갯수
	int pageCount = 0;  
	int blockCount = 0;	
	int beginRow = 0;
	int endRow = 0;
	int beginPage = 0;
	int endPage = 0;
	int prevBlock = 0;
	int nextBlock = 0;
	int pageNum = 0;
	int rowCount = 0;
	boolean existPrev = false;
	boolean existNext = false;
	
	@Override
	public void carryout(Object o) {
		this.pageNum = (int)o;
		System.out.println("1. 페이지넘버는 "+pageNum);
		System.out.println("2. beginRow : "+beginRow);
		this.pageSize = 5;
		this.blockSize = 5;
		this.rowCount = MemberServiceImpl.getInstance().count();
		System.out.println("3. rowCount: "+ rowCount);
		this.pageCount = (rowCount%pageSize==0)?
					rowCount/pageSize : rowCount/pageSize+1;
		System.out.println("4. pageCount : "+pageCount);
		this.blockCount = (pageCount%blockSize==0)?
					pageCount/blockSize : pageCount/blockSize + 1;
		System.out.println("blockCount : "+blockCount);
		this.beginRow = pageNum*pageSize - (pageSize -1);
		System.out.println("5. beginRow : "+beginRow);
		this.endRow = pageNum*pageSize;
		System.out.println("6. endRow : "+endRow);
		

		this.beginPage = pageNum - ((pageNum-1)%blockSize);
		System.out.println("beginPage : "+beginPage);
		this.endPage = ((beginPage + pageSize -1)<pageCount)?
						beginPage + blockSize - 1 : pageCount;
		System.out.println("endPage : "+endPage);
		this.prevBlock = beginPage - blockSize;
		System.out.println("prevBlock : "+prevBlock);
		this.nextBlock = beginPage + blockSize;
		System.out.println("nextBlock : "+nextBlock);
		this.existPrev = (prevBlock >= 0);
		System.out.println("existPrev>>>>> : "+existPrev);
		this.existNext = (nextBlock <= pageCount);
		System.out.println("existNext>>>>> : "+existNext);
	}
		
}

/*
@Override
public Map<?, ?> carryout(Map<?, ?> param) {
	Map<String, Object> map = new HashMap<>();
	map.put("beginRow", beginRow);
	map.put("endRow", endRow);
	return map;
}*/