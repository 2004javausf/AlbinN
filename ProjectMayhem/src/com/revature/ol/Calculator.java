package com.revature.ol;

//example of overloading with add method

public class Calculator {

	static int a;
	static double b;
	
	
	public static void main(String[] args) {
		//parametric polymorphism. knows which add method we made to use based on input type
		//can take doubles and ints
		
		a = 5;
		b = a;
		b = 3.1;
		a = (int)b;
		System.out.println(b);
		
		
		add(3,6);
		add(1.3, 4.5);
	}

	static int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
	
	static double add(double a, double b) {
		System.out.println(a + b);
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println(a + b + c);
		return a + b + c;
	}
}
