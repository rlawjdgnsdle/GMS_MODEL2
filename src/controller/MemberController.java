package controller;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import command.Carrier;
import command.Receiver;
import domain.ImageBean;
import enums.Action;
import enums.Term;
import service.ImageServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request);
		switch(Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case ADD :
			Carrier.redirect(request, response,
					"/member.do?action=move&page=login");
			break;
		case SEARCH :
			System.out.println("멤버 search 컨트롤러");
			Carrier.forward(request, response);
			break;
		case RETRIEVE :
			Carrier.forward(request, response);
			break;
		case COUNT :
			Carrier.redirect(request, response, "");
			break;
		case MODIFY : 
			Carrier.forward(request, response);
			break;
		case REMOVE :
			Carrier.redirect(request, response,"");
			break;
		case FILEUPLOAD : 
			Carrier.redirect(request, response, "/member.do?action=retrieve&page=main");
			break;
		case MOVE : 
			Carrier.forward(request, response);
			break;
		case LOGIN :
			if(request.getAttribute("match").equals("TRUE")) {
				Carrier.forward(request, response);
			}else {
				Carrier.redirect(request, response, 
						"/member.do?action=move&page=login");
			}
			break;
		default:break;
		}
	}

}
