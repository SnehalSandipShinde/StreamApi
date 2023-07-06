package com.prowings.stream_demo;

import java.util.ArrayList;

public class 
BasicStreamOperations {

	public static void main(String[] args) 
	{
		

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(12);
		arr.add(23);
		arr.add(14);
		arr.add(76);
		arr.add(76);
		arr.add(76);
		
		long cnt = arr.stream().filter(n -> n > 30).count();
		System.out.println(cnt);
		
		
	}
}
