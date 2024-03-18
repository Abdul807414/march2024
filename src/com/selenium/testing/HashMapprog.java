package com.selenium.testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapprog {

	
	public static void main(String[] args) {
		
//		// Map map = new HashMap();  //  insertion is not preserved 
//		HashMap map = new HashMap();
//		
//		map.put("java", 456);
//		map.put(923345, 345);
//		map.put("hardwork", "job");
//		map.put('k', 345);
//		map.put(null, null);
//		
//		System.out.println(map);
//
//
//LinkedHashMap map1 = new LinkedHashMap();  // insertion is preserved
//		
//		map1.put("java", 456);
//		map1.put(923345, 345);
//		map1.put("hardwork", "job");
//		map1.put('k', 345);
//		map1.put(null, null);
//		
//		System.out.println(map1);
//		
//		ConcurrentHashMap map = new ConcurrentHashMap();
//
//		
//		map.put("java", 456);
//		map.put(923345, 345);
//		map.put("hardwork", "job");
//		map.put('k', 345);
//		//map.put(null, null);
//		
//		System.out.println(map);
		
		
		//Map map = new TreeMap();
		
		TreeMap map = new TreeMap();
		 // map.put(null, null);
		 // map.put(null, "hello");
		  map.put("java", null);
		  map.put("abc", 345);
		  map.put("java", 123);
		  map.put("Hardwork", "job");
		  
		  System.out.println(map);

		
		
		
		
		
		
		
		
	}
}
