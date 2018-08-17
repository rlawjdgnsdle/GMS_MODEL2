package command;

import javax.servlet.http.HttpServletRequest;

import enums.Term;
import lombok.Data;
@Data
public class Command implements Order{
	protected String action,domain,page,view;
	protected HttpServletRequest request;

	@Override
	public void execute() {
		System.out.println("커맨드 execute");
		this.view = "/WEB-INF/view/"+domain+Term.MAIN;
		System.out.println("가져온 view의 값은 : "+view);
	}
	
}
