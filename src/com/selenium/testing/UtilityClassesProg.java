package com.selenium.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilityClassesProg {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(456);
	list.add(91456);
	list.add(65456);	
	list.add(23456);
	list.add(1);
	list.add(56);
	list.add(456);
System.out.println(list);
	
Collections.sort(list);

System.out.println(list);
System.out.println(Collections.binarySearch(list, 91456)); //if the number is there then we will get posistive number or else negative number
	
	
	
	
	
	
}
}
