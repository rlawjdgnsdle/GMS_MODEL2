package service;

import java.util.List;
import java.util.Map;

import domain.ImageBean;
import domain.MemberBean;

public interface ImageService {
	public String insert(ImageBean image);
	public String selectOne(String word);
}
