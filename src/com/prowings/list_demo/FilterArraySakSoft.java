package com.prowings.list_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArraySakSoft {

	public static void main(String[] args) 
	{
		List<Integer> input = Arrays.asList(10, 3, 7, 12, 1, 9, 18, 15, 20, 40);

		List<Integer> output = input.stream()
									.filter(num -> num >= 10)
									.filter(num -> num != 15) // exclude 15
									.collect(Collectors.toList());

		System.out.println(output);
	}

}
