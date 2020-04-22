package com.revature.classtypes;

import com.revature.beans.Human;

public class Driver {

	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.breathe();
		shark.findPrey();
		shark.swim();
		
		Human carl = new Human();
		carl.breathe();
		carl.findPrey();
	}

}
