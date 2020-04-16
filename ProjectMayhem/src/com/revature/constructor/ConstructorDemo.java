package com.revature.constructor;

public class ConstructorDemo extends D {

	/*
	 * CONSTRUCTORS
	 * 	how we instantiate an object
	 * 	no return type but does return the object that was created
	 */
	
	public static void main(String[] args) {
		System.out.println("In main");
		C c = new C();
		
	}
	
}

class A {
	{System.out.println("A's instance code block");}
	A() {
		//B b = new B(); this would create infinite loop and break program
		System.out.println("I'm inside A's constructor");
	}
	static {System.out.println("A's static code block");}
}

class B extends A {
	B() {
		System.out.println("I'm inside B's constructor");
	}
}

class C extends B {
	static {System.out.println("C's static code block");}
	C() {
		System.out.println("I'm inside C's constructor");
	}
}

class D {
	static {System.out.println("D's static code block");}
	D() {
		System.out.println("Inside D's constructor");
	}
}