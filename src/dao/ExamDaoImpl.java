package dao;

import java.util.List;

import domain.ExamBean;

public class ExamDaoImpl implements ExamDao {
	private static ExamDao instance = new ExamDaoImpl();
	public static ExamDao getInstance() {return instance;}
	private ExamDaoImpl() {} 

	@Override
	public List<ExamBean> listExam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamBean> findExam(String ex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamBean findExamById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countExam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void createExam(ExamBean exam) {
		
	}
	@Override
	public void updateExam(ExamBean exam) {
		// TODO Auto-generated method stub
	}
	@Override
	public void deleteExam(ExamBean exam) {
		// TODO Auto-generated method stub
	}

}
