package service;

import java.util.List;
import domain.*;

public interface MemberService {
	public void insertMember(MemberBean Member);
	public List<MemberBean> listMember();
	public List<MemberBean> findByWord(String word);
	public List<MemberBean> findByName(String word);
	public MemberBean findById(String word);
	public int countMember();
	public void updateMember(MemberBean bean);
	public void deleteMember(MemberBean bean);
	public boolean login(MemberBean bean);
	public void insertAdminMember(MemberBean Member);

}