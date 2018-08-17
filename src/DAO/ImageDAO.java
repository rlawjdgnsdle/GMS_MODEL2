package DAO;

import java.util.List;
import java.util.Map;

import domain.ImageBean;
import domain.MemberBean;

public interface ImageDAO  {
	public String add(ImageBean image);
	public String retrieve(String word);
}
//