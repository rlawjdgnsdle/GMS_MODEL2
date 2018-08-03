package command;
import javax.servlet.http.HttpServletRequest;

import enums.Action;
public class Commander implements Order {
	public static Command order(HttpServletRequest request) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :
			System.out.println("무무무브브브 진진진입입입");
			cmd = new MoveCommand(request);
					break;
		case JOIN :			
			System.out.println("조인진입이락");
			cmd = new CreateCommand(request);
			break;
		case LIST:
			cmd = new ListCommand(request);
			break;
		case UPDATE:
			cmd = new UpdateCommand(request);
			break;
		case SEARCH:
			System.out.println("커맨더 서치 진입");
			cmd = new SearchCommand(request);
			break;
		case LOGIN : 
			cmd = new LoginCommand(request);
			break;
		case DELETE :
			System.out.println("딜딜딜딜리리트트");
			
			cmd = new DeleteCommand(request);
			break;
		case ADMINJOIN :
			cmd = new CreateAdminCommand(request);
			break;
	
		case RETRIEVE : 
			cmd = new RetrieveCommand(request);
			break;
		
		default:
			break;
		}
		return cmd; 
		}
	@Override
	public void execute() {
		
	}

}
