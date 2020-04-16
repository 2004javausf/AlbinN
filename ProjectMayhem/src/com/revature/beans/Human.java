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
	 * Instance variables - property of a specific object (human's name) 
	 * Static variables - property of class shared by
	 * all of its instances 
	 * Instance methods - behavior relative to a specific
	 * object 
	 * Static method - behavior relative to entire class 
	 * Constructor - instantiates class using the keyword 'new'
	 * 
	 * CODE BLOCKS - {things between}
	 * 
	 * 
	 */

	//Instance code block
	{System.out.println("I'm in an instance code block");}
	//Static code block
	static {System.out.println("I'm in a static code block");}
	
	public Human() {
		//this is the no args constructor
		System.out.println("I'm in the no args constructor");
	}
	
	
	
	public Human(String name, int age, int weight) {
		//super(); is implicit here
		//this is constructor with fields
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("I'm in the constructor with fields");
		
	}
	
	public static String homePlanet = "Earth";
	private String name;
	private int age;
	private int weight;

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

	//EXAMPLE OF SHADOWING
	public void setWeight(int weight) {
		this.weight = weight;
		//weight is method scope; this.weight is instance scope
	}
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		Human.homePlanet = homePlanet;
	}



	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet=" + homePlanet + "]";
	}


	




}
