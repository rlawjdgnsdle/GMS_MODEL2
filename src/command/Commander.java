package command;

import javax.servlet.http.HttpServletRequest;
import enums.Action;

public class Commander {
	public static Command order(
			HttpServletRequest request) {
		Command cmd = null;
		System.out.println("커맨더로 가져온 액션 : "+Action.valueOf(request.getParameter("action")
				.toUpperCase()));
		switch(Action.valueOf(request.getParameter("action")
				.toUpperCase())) {
		case ADD : 
			System.out.println("ADD 커맨드 진입");
		    cmd = new AddCommand(request);
			break;
		case SEARCH: 
			System.out.println("SEARCH 커맨드 진입");
			cmd = new SearchCommand(request);
			break;
		case RETRIEVE:
			System.out.println("RETRIEVE 커맨드 진입");
			cmd = new RetrieveCommand(request);
			break;
		case COUNT : 
			System.out.println("COUNT 커맨드 진입");
			cmd = new CountCommand(request);
			break;
		case MODIFY:
			System.out.println("MODIFY 커맨드 진입");
			cmd = new ModifyCommand(request);
			break;
		case REMOVE:
			System.out.println("REMOVE 커맨드 진입");
			cmd = new RemoveCommand(request);
			break;
		case MOVE:
			System.out.println("MOVE 커맨드 진입");
			cmd = new MoveCommand(request);
			break;
		case LOGIN: 
			System.out.println("LOGIN 커맨드 진입");
			cmd = new LoginCommand(request);
			break;
		case FILEUPLOAD: 
			System.out.println("FILEUPLOAD 커맨드 진입");
			cmd = new FileCommand(request);
			break;
		default:
			break;
		}
		return cmd;
	}

}
