package DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.ImageBean;
import domain.MemberBean;
import enums.Domain;
import template.PhotoQuery;
import template.QueryTemplate;
import template.RetrieveQuery;

public class ImageDAOImpl implements ImageDAO{
	private QueryTemplate q;
	private static ImageDAO instance = new ImageDAOImpl();
	public static ImageDAO getInstance() {return instance;}
	private ImageDAOImpl() {}

	@Override
	public String add(ImageBean image) {
		System.out.println("이미지 DAO 진입");
		String result = "";
		q = new PhotoQuery();
		HashMap<String, Object>map = new HashMap<>();
		map.put("table", Domain.IMAGE);
		//imgName,ext,memid
		map.put("imgName", image.getImgname());
		System.out.println("image.getImgname() : " +image.getImgname());
		map.put("ext", image.getExtension());
		System.out.println("image.getExtension() : " +image.getExtension());
		map.put("memid", image.getMemid());
		System.out.println("image.getMemid() : " +image.getMemid());
		q.play(map);
		return result;
	}
	@Override
	public String retrieve(String word) {
		ImageBean img = null; 
		q = new RetrieveQuery();
		HashMap<String, Object>map = new HashMap<>();
		map.put("table", Domain.IMAGE);
		map.put("value", word);
		q.play(map);
		img = (ImageBean) q.getO(); 
		
		return ((img==null)
				?"default.jpg"
						:img.getImgname()+"."+img.getExtension()
						);
	}

	
}
