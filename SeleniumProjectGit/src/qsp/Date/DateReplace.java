package qsp.Date;

import java.util.Date;

public class DateReplace 
{

	public static void main(String[] args) 
	{
	  Date d = new Date();
	  String s = d.toString();
	  String s1 = s.replaceAll(":", "-");
	  System.out.println(s1);

	}

}
