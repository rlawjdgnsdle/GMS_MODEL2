package dao;

import java.util.List;

import domain.ExamBean;
import domain.SubjectBean;

public interface SubjectDao {
	public void createSubject();
	public void updateSubject();
	public void deleteSubject();
	public List<SubjectBean> listSubject();
	public List<SubjectBean> findSubject(String sub);
	public SubjectBean findSubjectById(String id);
	public int countSubject();
	public List<ExamBean> selectSubjectBySearchWord(String string);
}
