package com.selenium.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashsetprog1 {

	public static void main(String[] args) {
		
		String[] str = {"java","selenium","job","selenium", "java","hardwork","java","java",};
		
	Set set = new HashSet();	
List dup = new ArrayList();		
		
	for(int i=0; i<str.length;i++)
		//delete duplicate elements
	{
	String val =str[i];
		boolean data = set.add(val);
		if(data)
		{
			;;;;;
		}
		else {
			dup.add(val);
		}
	}

		
		System.out.println("After removing duplicates : "+set);
		System.out.println("Removed dulicates: "+ dup);
		
	}
}
