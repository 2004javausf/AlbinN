/***
 *          _,---.      ,----.  .-._           ,----.               .=-.-.  _,.----.    ,-,--.  
 *      _.='.'-,  \  ,-.--` , \/==/ \  .-._ ,-.--` , \  .-.,.---.  /==/_ /.' .' -   \ ,-.'-  _\ 
 *     /==.'-     / |==|-  _.-`|==|, \/ /, /==|-  _.-` /==/  `   \|==|, |/==/  ,  ,-'/==/_ ,_.' 
 *    /==/ -   .-'  |==|   `.-.|==|-  \|  ||==|   `.-.|==|-, .=., |==|  ||==|-   |  .\==\  \    
 *    |==|_   /_,-./==/_ ,    /|==| ,  | -/==/_ ,    /|==|   '='  /==|- ||==|_   `-' \\==\ -\   
 *    |==|  , \_.' )==|    .-' |==| -   _ |==|    .-' |==|- ,   .'|==| ,||==|   _  , |_\==\ ,\  
 *    \==\-  ,    (|==|_  ,`-._|==|  /\ , |==|_  ,`-._|==|_  . ,'.|==|- |\==\.       /==/\/ _ | 
 *     /==/ _  ,  //==/ ,     //==/, | |- /==/ ,     //==/  /\ ,  )==/. / `-.`.___.-'\==\ - , / 
 *     `--`------' `--`-----`` `--`./  `--`--`-----`` `--`-`--`--'`--`-`              `--`---'  
 */


package com.revature.generics;

/*
 * Generics:
 * 	-Using a type as a parameter
 * 	-Use angle brackets <> to denote that something is a generic
 * 	-Allows us to ensure type safety
 * 	-Adds stability to our code and reusability
 * 	-Placeholder (T, E, ?, etc.) - use instead of an explicit type
 */

public class Gen1<T> {
	
	//declare an object of type T
	T ob;
	//pass the constructor a reference to an object of type T
	Gen1(T o) {
		this.ob = o;
	}
	//returns ob
	T getOb() {
		return ob;
	}
	//show the type of T
	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
	
	
	
	
}
