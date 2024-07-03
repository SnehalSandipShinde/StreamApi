package com.prowings.list_demo;

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {

	    public static void main(String[] args)
	    {
	        int sum = IntStream.rangeClosed(1, 10).sum();
	        System.out.println("The sum of the first 10 natural numbers is: " + sum);
	    }
	}	

