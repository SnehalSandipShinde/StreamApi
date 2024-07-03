package com.prowings.hashmap;

import java.util.HashMap;

public class IterateHashMap {
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a", 12);
		hm.put("c", 10);
		hm.put("b", 13);
		hm.put("d", 11);
		
		System.out.println(hm);
		
		hm.forEach((k,v)-> System.out.println(k + " : "+v));
		
		
		HashMap<Integer, Integer> intHash = new HashMap<>();
		intHash.put(10, 10);
		intHash.put(6, 11);
		intHash.put(5, 10);
		intHash.put(2, 10);
		
		System.out.println(intHash);
		
	}

}
