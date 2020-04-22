package com.revature.classtypes;

public class Shark extends Fish implements Hunt {

	@Override
	public void swim() {
		System.out.println("I'm swimming underwater and i'm terrifying");
		
		
	}

	@Override
	public void breathe() {
		System.out.println("I breathe underwater, boi");
		
	}

	@Override
	public void findPrey() {
		System.out.println("I ate fish it was good.");
		
	}

}
