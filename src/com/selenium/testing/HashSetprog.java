package com.selenium.testing;

import java.util.HashSet;
import java.util.Set;

public class HashSetprog {
public static void main(String[] args) {
	
	String[] str = {"java","selenium","job","selenium", "java","hardwork","java","java",};
	
Set set = new HashSet();	
	
	
for(int i=0; i<str.length;i++)
	//delete duplicate elements
{
String val =str[i];
	set.add(val);
}

	
	System.out.println(set);
	
}
}
