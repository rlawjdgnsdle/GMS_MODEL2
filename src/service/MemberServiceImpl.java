package service;

import java.util.List;
import java.util.Map;

import DAO.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	
	@Override
	public String add(MemberBean member) {
		return MemberDAOImpl.getInstance().insert(member);
	}
	@Override
	public List<MemberBean> search(Map<?, ?> param) {
		return MemberDAOImpl.getInstance().selectSome(param);
	}
	@Override
	public MemberBean retrieve(String word) {
		return MemberDAOImpl.getInstance().selectOne(word);
	}
	@Override
	public int count() {
		return MemberDAOImpl.getInstance().count();
	}
	@Override
	public int count(String word) {
		System.out.println("멤버 Service 임플");
		return MemberDAOImpl.getInstance().count(word);
	}
	@Override
	public void modify(Map<?, ?> param) {
		MemberDAOImpl.getInstance().update(param);
		
	}
	@Override
	public void remove(MemberBean member) {
		
	}
	@Override
	public MemberBean login(MemberBean member) {
		return MemberDAOImpl.getInstance().login(member);
	}
	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
