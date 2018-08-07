package dao;

import java.util.List;
import java.util.Map;

import domain.*;

public interface MemberDao {
	public void insertMember(MemberBean Member);
	public List<MemberBean> selectAllMember();
	public List<MemberBean> selectList(Map<?,?>param);
	public List<MemberBean> findByWord(String word);
	public List<MemberBean> findByName(String word);
	public MemberBean findById(String word);
	public int countMember();
	public void updateMember(MemberBean bean);
	public void deleteMember(MemberBean bean);
	public MemberBean login(MemberBean bean);
	public MemberBean adMinLogin(MemberBean bean);
	public void insertAdminMember(MemberBean Member);
	

}