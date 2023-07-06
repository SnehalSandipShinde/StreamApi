package com.prowings.stream_demo;

import java.util.Arrays;
import java.util.List;

public class AllEven {

	public static void main(String[] args) 
	{
		
		List<Integer> nums = Arrays.asList(2,6,4,8);
		
		boolean res = nums.stream().allMatch(n -> n % 2 == 0);
		
		if(res)
			System.out.println("All numbers are even...");
		else
			System.out.println("All numbers are not even...");
	}
}