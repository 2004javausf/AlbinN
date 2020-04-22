package com.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
      ___                   ___           ___           ___     
     /\__\      ___        /\  \         /\  \         /\  \    
    /:/  /     /\  \      /::\  \        \:\  \       /::\  \   
   /:/  /      \:\  \    /:/\ \  \        \:\  \     /:/\ \  \  
  /:/  /       /::\__\  _\:\~\ \  \       /::\  \   _\:\~\ \  \ 
 /:/__/     __/:/\/__/ /\ \:\ \ \__\     /:/\:\__\ /\ \:\ \ \__\
 \:\  \    /\/:/  /    \:\ \:\ \/__/    /:/  \/__/ \:\ \:\ \/__/
  \:\  \   \::/__/      \:\ \:\__\     /:/  /       \:\ \:\__\  
   \:\  \   \:\__\       \:\/:/  /     \/__/         \:\/:/  /  
    \:\__\   \/__/        \::/  /                     \::/  /   
     \/__/                 \/__/                       \/__/    
 */

public class MyList {

	//List
		//A list is indexed
		//Allows duplicates
		//An ordered sequence
	
	public static void main(String[] args) {
	
		List<String> myFirstList = new ArrayList<>();
		myFirstList.add("We're doing great");
		myFirstList.add("Here's another String");
		myFirstList.add("Another one for good measure");
		System.out.println(myFirstList);

		myFirstList.set(1,  "Here's my new string");
		System.out.println(myFirstList);
		
		List<String> myOtherList = new LinkedList<>();
		myOtherList.addAll(myFirstList);
		
		
		//Linked list is only good if you're adding and removing many elements
		//Array list is more efficient overall
		
		/*
		 * Access via index (positional access): Interact with the elements based on their position in the ArrayList
		 * 	-get, set, add, addAll, and remove
		 * 
		 * Search: Find a specified object in the list and return its position:
		 * 	-indexOf()
		 * 	-lastIndexOf()
		 */
		
		System.out.println(myOtherList.indexOf("Here's my new string"));
	
		/*
		 * Range view methods:
		 * 	-sublist() **first digit included, last is not***
		 * 
		 */
	
		System.out.println(myOtherList.subList(1, 2));
	}

}

/*
 _ __                             _,    _          
( /  )     _/_ /                 / |   // / o      
 /  / __,  /  /_  __,  _ _      /--|  // / ,  _ _  
/  (_(_/(_(__/ /_(_/(_/ / /_  _/   |_(/_/_)(_/ / /_
                                                                                              
 */

