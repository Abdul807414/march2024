package com.selenium.testing;

import java.util.ArrayList;

public class ArrayListProg {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	
	list.add(456);
	list.add("java");
	list.add("java");
	list.add("job");
	list.add(456);
	list.add(456.456);
	System.out.println(list);
	
	
	//suppose if i want 5th one
	Object obj = list.get(5);
	System.out.println(obj);
}
}
