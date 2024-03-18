package com.selenium.testing;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HasSetProgram {
public static void main(String[] args) {
	//Collection collection = new HashSet();
	//Set set = new HashSet();
	HashSet set = new HashSet();
	
	
	set.add(456); // it will not allow duplicate
	set.add(456);    // insertion order is nolt  preserved
	set.add("java");
	set.add("job");
	set.add(456.456);
	set.add("java");
	set.add("sellenium");

	System.out.println(set);
	
}
}
