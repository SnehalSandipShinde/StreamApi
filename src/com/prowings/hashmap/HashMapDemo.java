package com.prowings.hashmap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {

		String str = "Communication is must have skill ";
		Map<String, Long> res = Arrays.stream(str.split(""))
								.map(String::toUpperCase).sorted()
								.collect(Collectors
								.groupingBy(st -> st, LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(res);
	}
}