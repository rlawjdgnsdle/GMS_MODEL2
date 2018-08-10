package service;

import java.util.List;
import java.util.Map;

import domain.MemberBean;

public interface MemberService {
	public void add(MemberBean Member);
	public List<MemberBean> search(Map<?,?>param); // ? = 와일드카드 
	public MemberBean retrieve(String word);
	public int count();
	public void modify(Map<?,?>param);
	public void remove(MemberBean Member);
	public boolean login(MemberBean bean);
}