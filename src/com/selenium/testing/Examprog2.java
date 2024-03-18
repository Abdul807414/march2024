package com.selenium.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Examprog2 {
public static void main(String[] args) {
	
	int[] in = {456,92345, 1, 34, 465};
	
	TreeSet set = new TreeSet();
	
	for(int i=0; i<in.length;i++)
	{
		int val = in[i];
		set.add(val);
		
	}
	System.out.println(set);
	
	List list = new ArrayList(set);
	Object minval = list.get(0);
	System.out.println("min val is : " +minval);
	
	Object maxval = list.get(list.size()-1);
	System.out.println("max val is : " +maxval);
	
}
}
