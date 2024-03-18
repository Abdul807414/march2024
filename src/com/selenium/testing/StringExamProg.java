package com.selenium.testing;

public class StringExamProg {
public static void main(String[] args) {
	
	String str ="job";
	String str1 = str.concat("Hardwork");
	
	System.out.println(str);
	System.out.println(str1);
	
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
System.out.println("*****************");
	
StringBuffer sb1 = new StringBuffer("practise");
StringBuffer sb2 = sb1.append("job");

System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb1.hashCode());
System.out.println(sb2.hashCode());

	if(sb1==sb2)
	{
	System.out.println("equal");

	}
	else 
	{
		System.out.println("not equal");
	}
	
}
}
