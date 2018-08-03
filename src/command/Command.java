package command;

import javax.servlet.http.HttpServletRequest;
import lombok.Data;

@Data
public class Command implements Order {   //bean하고 service가 합쳐졌다…?
	protected String action,domain,page,view;
	protected HttpServletRequest request;

	@Override
	public void execute() {
	this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
	}
}
//11