package com.prowings.stream_demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

	public static void main(String[] args) 
	{
		
		List<String> fruits = Arrays.asList("apple","Banana","grapes","blueberry");
		
		Optional<String> res = fruits.stream().filter(str -> str.toLowerCase().startsWith("b")).findFirst();
		
		System.out.println(res);
	}
}
