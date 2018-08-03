package domain;

import lombok.Data;

@Data
public class ExamBean {
	public String examSeq,subSeq,score,month,memId,recordSeq;
	public static final String TEST = "TEST";
	
	@Override
	public String toString() {
		return "시험정보 [시험Seq=" + examSeq
				+ ", 과목Seq=" + subSeq
				+ ", 점수=" + score
				+ ", 월=" + month
				+ ", 학생ID=" + memId
				+ ", 성족표Seq=" + recordSeq + "]";
	}

}
