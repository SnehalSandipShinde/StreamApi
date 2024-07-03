package com.prowings.functional_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElem {

	public static void main(String[] args) {
		Integer arr1[] = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};
		Set<Integer> uniqueNo = new HashSet<>();

		for(Integer elem : arr1)
		{
			uniqueNo.add(elem);
		}
		System.out.println(uniqueNo);
		
		List<Integer> list1 = Arrays.asList(arr1).stream().distinct().collect(Collectors.toList());

		List<Integer> list2 = Arrays.stream(arr1).distinct().collect(Collectors.toList());
		
		
		System.out.println("using streamAPI"+list1);
		System.out.println("using streamAPI"+list2);
		
		String str = "Test" /* + "123" */ + 123;
		System.out.println(str);
	}
}