package com.selenium.testing;

import java.util.LinkedList;

public class LinkedListProgs {

	public static void main(String[] args) {
		
		
		
		//Collection collection = new LinkedList<>();

		//List list = new LinkedList<>();
		
		LinkedList list = new LinkedList<>();

list.add(456);
list.add(0, "job");

	list.addFirst("hardhwork");	
	list.add(456);
	list.add(456);
	list.add(456);
	list.add(456);
list.addLast("wow");
list.add(456);
System.out.println(list);
		
		Object obj5 = list.get(5);
		System.out.println(obj5);
		
		Object obj1 = list.getFirst();
		System.out.println(obj1);
		
		
		Object last = list.getLast();
		
		System.out.println(last);
	}
}
