package test;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
public static void main(String[] args) {
	String result = "";
	Date today = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy");
	result = df.format(today);
	System.out.println(result);
	}
}
