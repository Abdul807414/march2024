package com.selenium.testing;

import java.util.LinkedHashSet;

public class LinkedHashSetprog {

	public static void main(String[] args) {

		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(456); // it will  not allow duplicate
		set.add(456);  // insertion order is preserved
		set.add("java");
		set.add("job");
		set.add(456.456);
		set.add("java");
		set.add("sellenium");

		System.out.println(set);
	}

}
