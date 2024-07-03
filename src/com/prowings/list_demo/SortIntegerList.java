package com.prowings.list_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Three ways to sort an element of Integer List
public class SortIntegerList {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 4, 0, 2, 3);

		Stream<Integer> sortElem= nums.stream().sorted();
		sortElem.forEach(System.out::println);

		// using the comparator
		nums.sort(Comparator.reverseOrder());
		nums.forEach(System.out::println);

		Collections.sort(nums);
		nums.forEach(System.out::println);
		
		

	}

}
