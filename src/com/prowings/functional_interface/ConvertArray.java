package com.prowings.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArray {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> list =  Arrays.stream(arr).collect(Collectors.toList());
		
		System.out.println(list);
		
		Object[] arr1 = list.stream().toArray();
		System.out.println(Arrays.asList(arr1));

	}
}