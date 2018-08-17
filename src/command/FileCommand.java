package command;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import domain.ImageBean;
import domain.MemberBean;
import enums.Term;
import service.ImageServiceImpl;

public class FileCommand extends Command {

	public FileCommand(HttpServletRequest request) {
		System.out.println("파일 커맨드 진입");
		setRequest(request);
		setDomain(request.getServletPath().substring(1, 
				request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		System.out.println("1. 멤버컨트롤러 파일업로드 케이스 진입");
		if(!ServletFileUpload.isMultipartContent(request)) {
			System.out.println("업로드파일이 업습니다.");
			return;
		}
		System.out.println("2. 업로드 파일 존재함");
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(1024 * 1024 * 40);  //40MB
		upload.setSizeMax(1024 * 1024 * 50); //50MB
		List<FileItem> items = null;
		try {
			System.out.println("3. try 내부로 진입");
			File file = null;
			items = upload.parseRequest(new ServletRequestContext(request));
			System.out.println("4. items 생성");
			Iterator<FileItem>iter = items.iterator();
			while(iter.hasNext()) {
				System.out.println("5. while 진입");
				FileItem item = (FileItem) iter.next();
				if(!item.isFormField()) {
					System.out.println("6. if 진입");
					String fileName = item.getName();
					System.out.println("fileName : "+fileName);
					file = new File(Term.UPLOAD_PATH+fileName);
					System.out.println("File  : "+file);
					item.write(file);
					ImageBean image = new ImageBean();
					String imgName = fileName.substring(0, fileName.lastIndexOf("."));
					System.out.println("imgName : "+imgName);
					/*url.substring(url.lastIndexOf('/') + 1);*/
					String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
					System.out.println("ext : "+ext);
					image.setImgname(imgName);
					image.setExtension(ext);
					image.setMemid(((MemberBean) request.getSession().getAttribute("user")).getMemberId());
					System.out.println("image : "+image.toString());
					ImageServiceImpl.getInstance().insert(image);
					System.out.println("7. 파일 업로드 성공");
				}else {
					System.out.println("8. 파일 업로드 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("10. 캐리어 떠나기 전");
		super.execute();
	}
	
}
