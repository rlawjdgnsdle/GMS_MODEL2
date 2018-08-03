package dao;

import java.util.List;

import domain.ExamBean;
import domain.SubjectBean;

public class SubjectDaoImpl implements SubjectDao {
	private static SubjectDao instance = new SubjectDaoImpl();
	public static SubjectDao getInstance() {return instance;}
	private SubjectDaoImpl() {} 
		
	@Override
	public void createSubject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSubject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectBean> listSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectBean> findSubject(String sub) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectBean findSubjectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSubject() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<ExamBean> selectSubjectBySearchWord(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
