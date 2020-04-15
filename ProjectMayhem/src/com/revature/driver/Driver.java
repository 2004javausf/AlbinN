package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
		
		//NOTES
		/*
		 * 3 COMMON ACRONYMS --- JDK, JRE, JVM
		 * 	JVM - Java Virtual Machine
		 * 		Converts compiled Java code into machine code that it can understand
		 * 		Provides portability
		 * 	JRE - Java Runtime Environment
		 * 		JVM + Libraries in essence
		 * 		Libraries are programs that can be utilized
		 * 		Everything we need to RUN java
		 *	JDK - Java Development Kit
		 *		Contains JVM + JRE
		 *		Compiler, etc...
		 *		Everything we need to WRITE java	
		 *	
		 *OBJECT ORIENTED PROGRAMMING
		 *	Java is OOP
		 *	unit of programmability is the object
		 *	Objects have states and behavior
		 *	States - aka fields, attributes, variables, etc...
		 *	Behaviors - methods
		 *	Classes - blueprint or template of an object
		 *			 *
		 *	
		 */


	public static void main(String[] args) {
		
		/* public - access modifier which allows everything to access it
		 * static - do not need to instantiate to use / belongs to the class
		 * void - doesn't return anything
		 * String[] args - parameter(s) used for this method
		 * 
		 * 
		 */
		
		System.out.println("Roll Tide");
		Human h = new Human();
		h.setAge(34);
		System.out.println(h.getAge());
	}







}