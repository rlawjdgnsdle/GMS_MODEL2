package service;

import java.util.List;
import java.util.Map;

import domain.MemberBean;

public interface MemberService {
	public void insertMember(MemberBean Member);
	public List<MemberBean> listMember();
	public List<MemberBean> getList(Map<?,?>param); // ? = 와일드카드 
	public List<MemberBean> findByWord(String word);
	public List<MemberBean> findByName(String word);
	public MemberBean findById(String word);
	public int countMember();
	public void updateMember(MemberBean bean);
	public void deleteMember(MemberBean bean);
	public boolean login(MemberBean bean);
	public void insertAdminMember(MemberBean Member);

}