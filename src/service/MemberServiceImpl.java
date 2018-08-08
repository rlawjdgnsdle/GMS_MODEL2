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
	public void insertMember(MemberBean Member) {
		System.out.println("멤버 : "+ Member);
		MemberDaoImpl.getInstance().insertMember(Member);
		// //
	}
	@Override
	public List<MemberBean> listMember() {
		return MemberDaoImpl.getInstance().selectAllMember();
		}

	@Override
	public int countMember() {
		System.out.println("서비스 임플 카운트");
		return MemberDaoImpl.getInstance().countMember();
	}
	@Override
	public boolean login(MemberBean bean) {
		System.out.println("서비스  "+ bean.toString());
		return (MemberDaoImpl.getInstance().login(bean)!=null);
	}
	@Override
	public void updateMember(MemberBean bean) {
		MemberDaoImpl.getInstance().updateMember(bean);
	}
	@Override
	public void deleteMember(MemberBean bean) {
		MemberDaoImpl.getInstance().deleteMember(bean);
	}
	@Override
	public void insertAdminMember(MemberBean Member) {
		MemberDaoImpl.getInstance().insertAdminMember(Member);
	}
	@Override
	public List<MemberBean>findByWord(String word) {
		
		return MemberDaoImpl.getInstance().findByWord(word);
	}
	@Override
	public List<MemberBean> findByName(String word) {
		System.out.println("서비스 임플 FindByName");
		return MemberDaoImpl.getInstance().findByName(word);
	}
	@Override
	public MemberBean findById(String word) {
		System.out.println("서비스임플 리트리뷰트 : " + word +"   //////   "+MemberDaoImpl.getInstance().findById(word));
		return MemberDaoImpl.getInstance().findById(word);
	}
	@Override
	public List<MemberBean> getList(Map<?, ?> param) {
		System.out.println("서비스임플 겟리스트 : "+ param);
		System.out.println("서비스임플 겟리스트 : "+ MemberDaoImpl.getInstance().selectList(param));
		return MemberDaoImpl.getInstance().selectList(param);
	}
	
}