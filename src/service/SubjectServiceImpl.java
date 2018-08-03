package service;

import java.util.List;
import domain.SubjectBean;

public class SubjectServiceImpl implements SubjectService{
	private static SubjectService instance = new SubjectServiceImpl();
	public static SubjectService getInstance() {return instance;}
	private SubjectServiceImpl() {}

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
	public void createSubject(SubjectBean service) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateSubject(SubjectBean service) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject(SubjectBean service) {
		// TODO Auto-generated method stub
		
	}

}
