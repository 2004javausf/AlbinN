package com.revature.beans;
//Packages are just very fancy folders
/*
 * NAMING CONVENTIONS
 * Classes and Projects: Pascal casing -- Capitalize first letter of each word
 * Methods and variables: Camel casing -- ex: firstSecondThird
 * packages: lower.case and delimited by periods to make folders
 * Constants: ALL_CAPS and delimited by underscores
 * 
 */





public class Human {

	/*
	 * Members of a Class - couple of forms
	 * 		Instance variables - property of a specific object (human's name)
	 * 		Static variables - property of class shared by all of its instances
	 * 		Instance methods - behavior relative to a specific object
	 * 		Static method - behavior relative to entire class
	 * 		Constructor - instantiates class using the keyword 'new'
	 * 
	 */
	private String name;
	private int age; private int weight;
	
	
//GETTER AND SETTER METHODS FOR THE VARIABLES
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	


}
