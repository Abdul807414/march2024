package com.selenium.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExamProg1 {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(456);
	list.add(456);
	list.add("job");
	list.add("java");
	list.add(456);
	list.add("job");
	list.add(456);
	list.add("java");
	
	System.out.println(list);
	
	//2nd approacjh
	
	Set set = new HashSet(list);
	System.out.println(set);
	
	Set set1 = new HashSet();	
	set1.addAll(list);
	System.out.println(set1);
	
	Set set2 = new HashSet();
	for(int i=0;i<list.size();i++)
	{
		Object obj = list.get(i);
		set2.add(obj);
	}
	System.out.println(set2);
	
	
}
}
