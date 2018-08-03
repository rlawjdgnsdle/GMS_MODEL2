package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.TestDAO;

public class Test {
	public static void main(String[] args) {
		List<String> lst = TestDAO.getInstance().age();
		List<String> ssssn = new ArrayList<>();
//		List<String> ssssn2 = new ArrayList<>();
		int realResult = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))+1-1900;
		int i = 0;
		int j = 0;
		for(i=0; i<lst.size(); i++) {
			ssssn.add(String.valueOf(((realResult - Integer.parseInt(lst.get(i)))*10000)
									+(int)(Math.random()*12)*100
									+(int)(Math.random()*31)
									+"-"
									+(int)(Math.random()*3)
									));
			
		}
		for(String s:ssssn) {
			System.out.println(s);
		}
//		for(j=0; j<ssssn.size(); i++) {
//			ssssn2.add()
//		}
//		
	}
}

//age를 몇년생인지 추출
//1998년생 남자
//980000-1
//98 + 00 + 00 + - + 1
//980504-1



