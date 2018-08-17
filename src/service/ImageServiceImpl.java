package service;

import java.util.List;
import java.util.Map;

import DAO.ImageDAOImpl;
import domain.ImageBean;
import domain.MemberBean;

public class ImageServiceImpl implements ImageService{
	private static ImageService instance = new ImageServiceImpl();
	public static ImageService getInstance() {return instance;}
	private ImageServiceImpl() {}
	@Override
	public String insert(ImageBean image) {
		System.out.println("이미지 서비스 임플"+"\n"+"이미지 서비스임플로 가져온 이미지 값 : "+image);
		return ImageDAOImpl.getInstance().add(image);
		
	}
	@Override
	public String selectOne(String word) {
		return ImageDAOImpl.getInstance().retrieve(word);
	}
}
