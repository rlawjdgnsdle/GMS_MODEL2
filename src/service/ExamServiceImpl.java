package service;

import java.util.List;

import dao.ExamDaoImpl;
import dao.RecordDaoImpl;
import dao.SubjectDao;
import dao.SubjectDaoImpl;
import domain.*;


public class ExamServiceImpl implements ExamService{
	private static ExamService instance = new ExamServiceImpl();
	public static ExamService getInstance() {return instance;}
	public ExamServiceImpl() {}
	
	@Override
	public List<ExamBean> listExam() {
		
		return null;
	}

	@Override
	public List<ExamBean> findExam(String ex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamBean findExamById(String id) {
		return null;
	}

	@Override
	public int countExam() {
		return 0;
	}

	@Override
	public void createExam(ExamBean exam) {
//		System.out.println("===== ExamService =====");
//        System.out.println(exam);
//        // 과목SEQ=null,
//        // 성적표SEQ=null
//        System.out.println("----- RECORD TABLE INSERT ------");
//        RecordBean rec = new RecordBean();
//        rec.setAvg("80");
//        rec.setGrade("");
//        RecordDaoImpl.getInstance().createRecord(rec);
//        System.out.println("------ Exam TABLE INSERT ------");
//        exam.setScore(exam.getScore().split("/")[0]);
//        exam.setSubSeq(
//                SubjectDaoImpl.getInstance().
//                selectSubjectBySearchWord("JAVA").get(0)
//                .getSubSeq())
//                ;
//        exam.setRecordSeq(RecordDaoImpl.getInstance()
//                .selectFirstRowNum());    
//        ExamDaoImpl.getInstance().createExam(exam);
		
	}
	@Override
	public void updateExam(ExamBean exam) {
		
	}

	@Override
	public void deleteExam(ExamBean exam) {
		
	}

}
