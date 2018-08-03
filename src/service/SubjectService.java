package service;

import java.util.List;

import domain.SubjectBean;

public interface SubjectService {
	public void createSubject(SubjectBean service);
	public void updateSubject(SubjectBean service);
	public void deleteSubject(SubjectBean service);
	public List<SubjectBean> listSubject();
	public List<SubjectBean> findSubject(String sub);
	public SubjectBean findSubjectById(String id);
	public int countSubject();
}
