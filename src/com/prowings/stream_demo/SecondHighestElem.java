package com.prowings.stream_demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SecondHighestElem {

	public static void main(String[] args) {
//		int[] arr = {12,23,45,65};
		
		List<Integer> num = Arrays.asList(12,12,23,12,45,23);
		Optional<Integer> res =  num.stream().distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
		System.out.println(res);
		Integer n = num.stream()
				.distinct()
				.sorted((a,b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.orElse(null);
		
		System.out.println(n);
		
		OptionalDouble avg = num.stream().mapToInt(Integer :: intValue).average();
		
		
		System.out.println("Avg="+ avg);
		
		}
}