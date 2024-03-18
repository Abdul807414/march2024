package com.selenium.testing;

import java.util.Enumeration;
import java.util.Vector;

public class Listvectorprog {
public static void main(String[] args) {
	
	Vector vector = new Vector();
	
	
	vector.add("java");
	vector.add("selenium");
	vector.add("hardwork");
	vector.add("job");
	vector.add("practise");

	
	Enumeration enu = vector.elements();
	
	while(enu.hasMoreElements())
	{
		Object obj = enu.nextElement();
		String str = (String) obj;
		if(str.equalsIgnoreCase("job"))
		{
		  System.out.println("      job is in your hand");
		}
		System.out.println(str);

	}
	
	
	
	
	
	
	
}
}
