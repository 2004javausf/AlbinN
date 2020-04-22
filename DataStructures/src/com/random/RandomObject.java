package com.random;

public class RandomObject {

	String name;
	public RandomObject(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RandomObject [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
