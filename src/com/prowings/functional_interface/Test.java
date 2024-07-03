package com.prowings.functional_interface;

public class Test {

	public static void main(String[] args) {
		
		TestAnnonymous obj = new TestAnnonymous() {
			
			@Override
			public void show() {
				
				System.out.println("Hello Annonymous...");
				
			}

			@Override
			public void printNum(int x) {
				System.out.println(x);
			}
		};
		
		obj.show();
		obj.printNum(22);
	}
}
