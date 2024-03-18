package com.selenium.testing;

import java.util.ArrayList;
import java.util.List;

public class FoEachProg {
public static void main(String[] args) {
	String[] str = {"java","selenium", "hardwork", "job"};
	for(String str1 : str)
	{
		if(str1.equalsIgnoreCase("hardwork"))
		{
			System.out.println("              job in our hand");
			
		}
		System.out.println(str1);
	}

	List list = new ArrayList();	
		
	
}
}
