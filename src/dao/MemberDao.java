package dao;

import java.util.List;
import java.util.Map;

import domain.*;

public interface MemberDao {
	public void insert(MemberBean Member);
	public List<MemberBean> selectSome(Map<?,?>param);
	public MemberBean selectOne(String word);
	public int count();
	public void update(Map<?,?>param);
	public void delete(MemberBean bean);
	public MemberBean login(MemberBean bean);
}