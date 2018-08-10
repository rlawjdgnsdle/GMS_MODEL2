package service;

import java.util.List;
import java.util.Map;

import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	
	public static MemberService getInstance() {return instance;}
	
	private MemberServiceImpl() {session = new MemberBean();}
	MemberBean session;

	@Override
	public void add(MemberBean Member) {
		MemberDaoImpl.getInstance().insert(Member);
	}

	@Override
	public List<MemberBean> search(Map<?, ?> param) {
		System.out.println("서비스임플 서치");
		return MemberDaoImpl.getInstance().selectSome(param);
	}

	@Override
	public MemberBean retrieve(String word) {
		return MemberDaoImpl.getInstance().selectOne(word);
	}

	@Override
	public int count() {
		 
		return 0;
	}

	@Override
	public void modify(Map<?, ?> param) {
	MemberDaoImpl.getInstance().update(param);
	}


	@Override
	public boolean login(MemberBean bean) {
		 
		return false;
	}

	@Override
	public void remove(MemberBean Member) {
		MemberDaoImpl.getInstance().delete(Member);
	}
	
}