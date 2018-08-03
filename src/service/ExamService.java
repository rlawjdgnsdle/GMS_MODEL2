package service;

import java.util.List;

import domain.ExamBean;

public interface ExamService {
	public void createExam(ExamBean exam);
	public void updateExam(ExamBean exam);
	public void deleteExam(ExamBean exam);
	public List<ExamBean> listExam();
	public List<ExamBean> findExam(String ex);
	public ExamBean findExamById(String id);
	public int countExam();
}
