package com.revature.driver;

import java.util.Date;

import com.revature.beans.Human; //<-- grabs info from the human class
//import com.revature.beans.*  will import everything in beans folder
//static import - this only grabs static members of the class
//Static import .....

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
		
		Date d = new Date();
		Date e = new Date();
		java.sql.Date f = new java.sql.Date(0);
		
		/* public - access modifier which allows everything to access it
		 * static - do not need to instantiate to use / belongs to the class
		 * void - doesn't return anything
		 * String[] args - parameter(s) used for this method
		 * 
		 * 
		 */
		
		Human.setHomePlanet("Mars");
		
		System.out.println("Roll Tide");
		Human h = new Human("Abid", 22, 200);
		System.out.println(h);
		
		Human i = new Human();
		System.out.println(i);
	}







}