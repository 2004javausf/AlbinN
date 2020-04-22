package com.collections;

import java.util.*;

import com.random.RandomObject;

public class MySet {

	/*
	 *  _..._       .-'''-.                                         _..._                  .-'''-.                           
    .-'_..._''.   '   _    \  .---..---.                        .-'_..._''.              '   _    \                         
  .' .'      '.\/   /` '.   \ |   ||   |      __.....__       .' .'      '.\      .--. /   /` '.   \    _..._               
 / .'          .   |     \  ' |   ||   |  .-''         '.    / .'                 |__|.   |     \  '  .'     '.             
. '            |   '      |  '|   ||   | /     .-''"'-.  `. . '               .|  .--.|   '      |  '.   .-.   .            
| |            \    \     / / |   ||   |/     /________\   \| |             .' |_ |  |\    \     / / |  '   '  |            
| |             `.   ` ..' /  |   ||   ||                  || |           .'     ||  | `.   ` ..' /  |  |   |  |            
. '                '-...-'`   |   ||   |\    .-------------'. '          '--.  .-'|  |    '-...-'`   |  |   |  |            
 \ '.          .              |   ||   | \    '-.____...---. \ '.          .|  |  |  |               |  |   |  |            
  '. `._____.-'/              |   ||   |  `.             .'   '. `._____.-'/|  |  |__|               |  |   |  |            
    `-.______ /               '---''---'    `''-...... -'       `-.______ / |  '.'                   |  |   |  |            
             `                                                           `  |   /                    |  |   |  |            
                                                                            `'-'.-'''-.              '--'   '--'            
                                                                               '   _    \                                   
                            __  __   ___         __.....__                   /   /` '.   \              .                   
     _.._                  |  |/  `.'   `.   .-''         '.         _     _.   |     \  '            .'|                   
   .' .._|.-,.--.          |   .-.  .-.   ' /     .-''"'-.  `. /\    \\   //|   '      |  '.-,.--.  .'  |                   
   | '    |  .-. |    __   |  |  |  |  |  |/     /________\   \`\\  //\\ // \    \     / / |  .-. |<    |                   
 __| |__  | |  | | .:--.'. |  |  |  |  |  ||                  |  \`//  \'/   `.   ` ..' /  | |  | | |   | ____         _    
|__   __| | |  | |/ |   \ ||  |  |  |  |  |\    .-------------'   \|   |/       '-...-'`   | |  | | |   | \ .'       .' |   
   | |    | |  '- `" __ | ||  |  |  |  |  | \    '-.____...---.    '                       | |  '-  |   |/  .       .   | / 
   | |    | |      .'.''| ||__|  |__|  |__|  `.             .'                             | |      |    /\  \    .'.'| |// 
   | |    | |     / /   | |_                   `''-...... -'                               | |      |   |  \  \ .'.'.-'  /  
   | |    |_|     \ \._,\ '/                                                               |_|      '    \  \  \.'   \_.'   
   |_|             `--'  `"                                                                        '------'  '---'          
	 */
		//List, Set, Queue all interfaces in the collection
	//Why?
		//Array object within Java is limited. It is immutable and few methods to work with
	
	/*
	 * Called a framework (more library), provides interfaces and classes that allow developers to more easily
		manage a group of objects
	 
	 *Advantages:
	 	-Reduces effort (provides data structure and algorithms for you)
	 	-Increase performance 
	  	-Encourages software reuse
	  
	 * BUT!
	  	-Convert primitive values into objects
	 	-ints -> Integer 	
	  	-boolean -> Boolean
	  	-byte -> Byte
	 */
	
	/*
	 * What is a set?
	  	-Does not allow duplicate objects
	 	-Does not in general guarantee insertion order 
	 	-Sets are equal if they contain the same elements  
	  
	 * HashSet: 
	 	-Maintains no order, stores in hash table, best performance
	 * LinkedHashSet:
	 	-maintains insertion order, weaker performance 	
	 * TreeSet: 
	 	-Maintains value order, very slow performance	 
	 */
	
	
	public static void main(String[] args) {
		
		Set<String> myFirstSet = new HashSet<String>();
		myFirstSet.add("rerewrwerwerwer");
		myFirstSet.add("Hello there");
		myFirstSet.add("");
		myFirstSet.add("Peter Pan");
		System.out.println(myFirstSet);
		
		Set<String> myOtherSet = new HashSet<String>();
		myOtherSet.addAll(myFirstSet);
		myOtherSet.add("Spice Girls");
		System.out.println(myOtherSet);
		
		Set<RandomObject> randomSet = new HashSet<>();
		RandomObject rand1 = new RandomObject("Cameron");
		RandomObject rand2 = new RandomObject("Chad");
		System.out.println(randomSet);
		
		//TREE SET:
		
		Set<Integer> myFirstTreeSet = new TreeSet<>();
		myFirstTreeSet.add(420);
		myFirstTreeSet.add(12);
		myFirstTreeSet.add(3);
		myFirstTreeSet.add(4545);
		System.out.println(myFirstTreeSet);
		
		Set<Object> testy = new HashSet<>();
		testy.add(34);
		testy.add("minoino");
		System.out.println(testy);
		
		/*
		 * 
 ███▄    █  ▄▄▄     ▄▄▄█████▓ ██░ ██  ▄▄▄       ███▄    █     ▄▄▄       ██▓     ▄▄▄▄    ██▓ ███▄    █ 
 ██ ▀█   █ ▒████▄   ▓  ██▒ ▓▒▓██░ ██▒▒████▄     ██ ▀█   █    ▒████▄    ▓██▒    ▓█████▄ ▓██▒ ██ ▀█   █ 
▓██  ▀█ ██▒▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░▒██  ▀█▄  ▓██  ▀█ ██▒   ▒██  ▀█▄  ▒██░    ▒██▒ ▄██▒██▒▓██  ▀█ ██▒
▓██▒  ▐▌██▒░██▄▄▄▄██░ ▓██▓ ░ ░▓█ ░██ ░██▄▄▄▄██ ▓██▒  ▐▌██▒   ░██▄▄▄▄██ ▒██░    ▒██░█▀  ░██░▓██▒  ▐▌██▒
▒██░   ▓██░ ▓█   ▓██▒ ▒██▒ ░ ░▓█▒░██▓ ▓█   ▓██▒▒██░   ▓██░    ▓█   ▓██▒░██████▒░▓█  ▀█▓░██░▒██░   ▓██░
░ ▒░   ▒ ▒  ▒▒   ▓▒█░ ▒ ░░    ▒ ░░▒░▒ ▒▒   ▓▒█░░ ▒░   ▒ ▒     ▒▒   ▓▒█░░ ▒░▓  ░░▒▓███▀▒░▓  ░ ▒░   ▒ ▒ 
░ ░░   ░ ▒░  ▒   ▒▒ ░   ░     ▒ ░▒░ ░  ▒   ▒▒ ░░ ░░   ░ ▒░     ▒   ▒▒ ░░ ░ ▒  ░▒░▒   ░  ▒ ░░ ░░   ░ ▒░
   ░   ░ ░   ░   ▒    ░       ░  ░░ ░  ░   ▒      ░   ░ ░      ░   ▒     ░ ░    ░    ░  ▒ ░   ░   ░ ░ 
         ░       ░  ░         ░  ░  ░      ░  ░         ░          ░  ░    ░  ░ ░       ░           ░ 
                                                                                     ░                
		 */
		
		Set<Integer> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add(34);
		myLinkedSet.add(23);
		myLinkedSet.add(12121);
		System.out.println(myLinkedSet);
		
	}
	
}
