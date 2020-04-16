package com.revature.control;

public class LoopyLoops {
/*
 * IF STATEMENT
 * 	for decision making
 * 	providing multiple paths of execution
 * 
 * if(<conditional>){
 * 	<what to do if true>
 * 	}
 * else if(<second conditional>){
 * 	<what to do if 2nd conditional is true>
 * }
 * else{
 * 	<what to do if false>
 * }
 * 
 * SWITCH CASES
 * 	-Provides multiple paths of execution based on some value
 * 	-The "switch" is based on an integer numeric, a string, 
 * 		a char, a boolean, or enum.
 * 
 * 
 * 
 */
	static int p;
	static String color;
	public static void whatColor(String color) {
		switch (color) {
			case "green":
				System.out.println("color is green");
				break;
			case "purple":
				System.out.println("color is purple");
				break;
			case "crimson":
				System.out.println("color is crimson");
				break;
			default:
				System.out.println("you chose poorly");
				break;
		}
		
		
	}
		/*FOR LOOPS
		 * for(a;b;c) {do something}
		 * a is a variable declaration (counter)
		 * b is the condition that controls how far the loop will go
		 * c is the incrementor/decrementor
		 */
	public static void theForLoop(int p) {
		for(int i = p; i>0; i--) {
			if(i==10 ) {
				continue;
			}
			System.out.println(i);
		}
	}
	/*
	 * Enhanced for loop aka for each
	 * 	for (x:<Array or collection>) {do thing}
	 * 	good for moving through collections, arrays and other iterables
	 * 	more CPU efficient
	 * 	no issues w/ index out of bounds - not size dependent
	 * 	good for access elements in one collection
	 * 	bad for adding and removing
	 * 	
	 */
	
	static int [] myArray = {11,33,44,5,77,22,66,243};
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	/*
	 * WHILE LOOPS
	 * 	while(<condition>) {do something}
	 * 
	 * do while
	 * do {<do thing>} while (<condition>)
	 */
	
	public static void wileyWhile(int i) {
		while(i++<10) {
			System.out.println("boring");
			//i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		do {
			System.out.println("not so boring");
			i++;
		}
		while(i<10);
	}
	
	
	public static void main(String[] args) {
		
		//whatColor("green");
		//theForLoop(100);
		//forEachFun(myArray);
		wileyWhile(3);
		doWileyWhile(12);
	}

	/*
	 * CONDITIONALS
	 * 	Logical Operators
	 * 		<, >, <=, >=, !=, ==
	 * 		OR
	 * 			a|b - bit wise
	 * 			a||b - short circuit OR if a is true, return true without b
	 *		AND
	 *			a&b - bit wise
	 *			a&&b - checks both and evaluates true iff both are true
	 *		EQUALS
	 *			== compares values of primitives. compare the reference for objects not the contents
	 *			!= is good for checking nulls
	 *			.equals() is used for strings
	 *			method inherited object
	 *			all reference types have it
	 *			looking at content
	 * 
	 * 		
	 * 
	 * 
	 */
	
	





}
