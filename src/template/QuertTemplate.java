package template;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import enums.Vendor;
import lombok.Data;
import pool.DBconstant;

@Data
public abstract class QuertTemplate {
	HashMap<String,Object>map;
	List<Object> list;
	PreparedStatement pstmt;
	

	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	
	public final void play(HashMap<String,Object>map) {
		this.pstmt = null;
		this.list = new ArrayList<>();
		this.map = map;
		this.map.put("vendor", Vendor.ORACLE);
		this.map.put("username", DBconstant.USERNAME);
		this.map.put("password", DBconstant.PASSWORD);
		initialize();
		startPlay();
		endPlay();
	}
	
	   //template method
	   public final void play(){
 
	      //initialize the game
	      initialize();

	      //start game
	      startPlay();

	      //end game
	      endPlay();
	   }
}
