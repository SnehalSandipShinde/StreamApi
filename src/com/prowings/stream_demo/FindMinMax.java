package com.prowings.stream_demo;

import java.util.ArrayList;

public class FindMinMax {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		int max = numbers.stream().max(Integer :: compareTo).get();
		

        System.out.println("The maximum value is: " + max);
        
        int min = numbers.stream().min(Integer :: compareTo).get();

        System.out.println("The minimum value is: " + min);
        
	}
}
