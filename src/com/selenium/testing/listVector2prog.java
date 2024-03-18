package com.selenium.testing;

import java.awt.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class listVector2prog {
	public static void main(String[] args) {
		
java.util.List list = new ArrayList<>();
		list.add("java");
		list.add("selenium");
		list.add("hardwork");
		list.add("job");
		list.add("practise");

		
ListIterator itr = list.listIterator();

	while(itr.hasNext())
		{
			Object obj = itr.next();
			String str = (String) obj;
			if(str.equalsIgnoreCase("job"))
			{
			  System.out.println("      job is in your hand");
			}
			System.out.println(str);

		}
		
		
		
		
		
		
		
	}
	}

