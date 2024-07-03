package com.prowings.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
	
//	public static void main(String[] args) {
//		 String str = "I am Java Developer";
//
//		    Map<Character, Integer> charCountMap = new HashMap<>();
//		    for (char c : str.toCharArray()) 
//		    {
//		    	if(charCountMap.containsKey(c))
////		      charCountMap.put(c, charCountMap.getOrDefault(c, 1) + 1);
//		    		charCountMap.put(c, charCountMap.get(c)+1);
//		    	else
//		    		charCountMap.put(c, 1);
//		    }
//
//		    Character repeatedChar = charCountMap.entrySet().stream()
//		      .filter(entry -> entry.getValue() > 1)
//		      .map(Map.Entry::getKey)//.collect(Collectors.toList());
//		      .findFirst()
//		      .orElse(null);
//
//		    System.out.println("Repeated letter: " + repeatedChar);
//	}
	

	    public static void main(String[] args) 
	    {
	        String input = "hello world. I am Java Developer.";
//	        String repeatedLetters = findRepeatedLetters(input);
	        String repeatedLetters = input.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
	                  .entrySet().stream()
	                  .filter(entry -> entry.getValue() > 1)
	                  .map(entry -> entry.getKey().toString())
	                  .collect(Collectors.joining());
	        System.out.println("Repeated letters: " + repeatedLetters);
	    }

	    public static String findRepeatedLetters(String str) 
	    {
	        return str.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
	                  .entrySet().stream()
	                  .filter(entry -> entry.getValue() > 1)
	                  .map(entry -> entry.getKey().toString())
	                  .collect(Collectors.joining());
	    }
}
