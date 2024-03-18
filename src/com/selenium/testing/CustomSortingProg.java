package com.selenium.testing;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorProg implements Comparator

{

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		//return str1.compareTo(str2);  // ascending order
        //return -str1.compareTo(str2); // descending order
		//return str2.compareTo(str1);  //descending order
	    //return -str2.compareTo(str1);
	
	}
	
}
public class CustomSortingProg {
public static void main(String[] args) {
  	
	ComparatorProg comparatorProg = new ComparatorProg();
	TreeSet set = new TreeSet(comparatorProg);
	set.add("java");
	set.add("abc");
	set.add("selenium");
	set.add("hardwork");
	set.add("job");
System.out.println(set);
	
}
}
