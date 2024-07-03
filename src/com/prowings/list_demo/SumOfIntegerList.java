package com.prowings.list_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntegerList {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 4, 2, 2, 3);

		Integer sum = nums.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);

		Integer sumOfElem = nums.stream().reduce(2, (a, b) -> a * b);
		System.out.println(sumOfElem);
	}

}
