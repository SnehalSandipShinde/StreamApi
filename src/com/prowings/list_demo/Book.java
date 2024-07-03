package com.prowings.list_demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Book {

	public static void main(String[] args) {
		List<String> books = Arrays.asList("Math","Spring", "Java", "Spring","Spring");

		Iterator<String> itr = books.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		String bookObj = "Spring";
		String student2 = books.stream()
				.filter(s -> s.equals(bookObj))
				.findAny()
				.orElse(null);
		
		System.out.println("given book = " + student2);
		
		List<String>book = books.stream().filter(s->s.equals(bookObj)).collect(Collectors.toList());
		System.out.println(book);

		Long cnt = book.stream().count();
		System.out.println("Count of "+bookObj+" = "+cnt);
		
		List<String> bk = books.stream().sorted().collect(Collectors.toList());
		System.out.println(bk);
		
	}
}