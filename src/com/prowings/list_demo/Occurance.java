package com.prowings.list_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Abhishek", "Aditi", "Snehal", "Vijay", "Snehal", "Snehal", "Vijay");

		List<String> names = new ArrayList<>();
		names.add("Aditi");
		names.add("Abhishek");
		names.add("Aditi");
		names.add("Vijay");

		Map<String, Integer> collect = name.stream()
				.collect(Collectors
						.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

		System.out.println(collect);

	}
}