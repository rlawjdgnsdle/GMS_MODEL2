package domain;

import java.util.List;
import lombok.*;

@Data
public class MemberBean {
	private String memId, teamId, memName, ssn, roll, password, age, subject, gender;

	@Override
	public String toString() {
		return "MemberBean [memId=" + memId + 
				", teamId=" + teamId + ", memName=" + memName + ", ssn=" + ssn + ", roll="
				+ roll + ", password=" + password + ", age=" + age + ", subject=" + subject + ", gender=" + gender
				+ "]";
	}
	
}
