package com.prowings.stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsStream {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("Suhana");
		arrList.add("Vaishali");
		arrList.add("Ankush");
		arrList.add("Pooja");

		List<String> names = arrList.stream().collect(Collectors.toList());

		System.out.println("Display List of names by using stream:- ");
		System.out.println(names);

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(12);
		arr.add(23);
		arr.add(14);
		arr.add(76);

		System.out.println(arr);

		List<Integer> nums = arr.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Even Number's :- " + nums);

		List<Integer> oddNums = arr.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println("Odd Number's :- " + oddNums);
		
		//===============Display Stream ==========================
		arrList.stream().forEach(System.out :: println);
		
		System.out.print("elements of grater than 30 :- ");
		arr.stream().filter(i -> i>30).forEach(System.out :: print);

	}
}
