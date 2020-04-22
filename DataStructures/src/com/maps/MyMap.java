/*
     ,·'´¨;.  '                                   ,.,   '             .,                             ,. -,    
    ;   ';:\           .·´¨';\                 ;´   '· .,        ,·´    '` ·.'                 ,.·'´,    ,'\   
   ;     ';:'\      .'´     ;:'\              .´  .-,    ';\       \`; `·;·.   `·,         ,·'´ .·´'´-·'´::::\' 
   ;   ,  '·:;  .·´,.´';  ,'::;'             /   /:\:';   ;:'\'      ;   ,'\::`·,   \'      ;    ';:::\::\::;:'  
  ;   ;'`.    ¨,.·´::;'  ;:::;            ,'  ,'::::'\';  ;::';     ;   ,'::'\:::';   ';     \·.    `·;:'-·'´     
  ;  ';::; \*´\:::::;  ,':::;        ,.-·'  '·~^*'´¨,  ';::;     ;   ;:::;'·:.'  ,·'\'     \:`·.   '`·,  '     
 ';  ,'::;   \::\;:·';  ;:::; '        ':,  ,·:²*´¨¯'`;  ;::';    ';  ';: -· '´. ·'´:::'\'      `·:'`·,   \'      
 ;  ';::;     '*´  ;',·':::;          ,'  / \::::::::';  ;::';    ;  ,-·:'´:\:::::::;·'        ,.'-:;'  ,·\     
 \´¨\::;          \¨\::::;          ,' ,'::::\·²*'´¨¯':,'\:;    ,'  ';::::::'\;:·'´       ,·'´     ,.·´:::'\    
  '\::\;            \:\;·'           \`¨\:::/          \::\'    \·.,·\;-· '´  '           \`*'´\::::::::;·'   
    '´¨               ¨'              '\::\;'            '\;'  '   \::\:\                   \::::\:;:·´        
                                       `¨'                       `'·;·'                     '`*'´            
 */

package com.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
	
	/*
	 * Consists of key, value pairs.
	 * 	-Each key has to be unique and can only be mapped to one value
	 *	-A key can be mapped to a duplicate value 
	 * 
	 * Methods:
	 * 	-Basic operations:
	 * 		>put, get, remove, containsKey, containsValue, size and empty
	 * 	-Bulk operations:
	 * 		>putAll, clear
	 * Collection Views:
	 * 	-keySet, entrySet, and values.
	 */

	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>();
		/*
		 * Allows duplicate values, not duplicate keys
		 * Allows a single null key, and it allows multiple null values
		 * Does not guarantee order
		 */
		Map<String, Integer> myOtherMap = new TreeMap<>();
		/*
		 * Does not allow null keys, but does allow null values
		 * Sorted according to the natural ordering of the keys
		 */
		Map<String, String> myOtherOtherMap = new LinkedHashMap<>();
		/*
		 * It maintains insertion order
		 */
		
		myMap.put(1, "This is my first value");
		System.out.println(myMap);

		myOtherOtherMap.put("Apple", "Red spherical thing, sometimes green");
		
		
		
		
//		MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIM
//		 MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIIM
//		  MIIMIMIMIIMIMIMNNNIMIMIMIIMIMIMIIMIAAAAMIMIIMIMIMIIMIMIMIIMIMIM
//		   MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIMIM
//		    MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIM
//		     MIIMIMIMTTTTTIIMIMIMIIMIMIMIIMHHHHHHIMIMIIMIMIMAAAIIMIMIM
//		      MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIM
//		       MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIM
//		        MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIIM
//		         MIIMIMIMIINNNNMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMII
//		          MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIIMIIM
//		           MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIM
//		            MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIM
//		              MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIM
//		                MIIMIMIMIIMIMIMIIMIMIMIIMIMIMIIMIIM
//		                   MIIMIMIMIIMIMIMIIMIMIMIIMIMIM
//		                      MIIMIMIMIIMIMIMIIMIMIIM
//		                          MIIMIMIMIIMIMIM
		
		                             
	}





}

/*                                                                                                
                                                 ____                                            
                .---.                          ,'  , `.                                          
               /. ./|                       ,-+-,.' _ |                                          
           .--'.  ' ;                    ,-+-. ;   , ||                  .--.   ,---.    __  ,-. 
          /__./ \ : |                   ,--.'|'   |  ;|                .--,`|  '   ,'\ ,' ,'/ /| 
      .--'.  '   \' .   ,---.          |   |  ,', |  ':  ,--.--.       |  |.  /   /   |'  | |' | 
     /___/ \ |    ' '  /     \         |   | /  | |  || /       \      '--`_ .   ; ,. :|  |   ,' 
     ;   \  \;      : /    /  |        '   | :  | :  |,.--.  .-. |     ,--,'|'   | |: :'  :  /   
      \   ;  `      |.    ' / |        ;   . |  ; |--'  \__\/: . .     |  | ''   | .; :|  | '    
       .   \    .\  ;'   ;   /|        |   : |  | ,     ," .--.; |     :  | ||   :    |;  : |    
        \   \   ' \ |'   |  / |        |   : '  |/     /  /  ,.  |   __|  : ' \   \  / |  , ;    
         :   '  |--" |   :    |        ;   | |`-'     ;  :   .'   \.'__/\_: |  `----'   ---'     
          \   \ ;     \   \  /         |   ;/         |  ,     .-./|   :    :                    
           '---"       `----'          '---'           `--`---'     \   \  /                     
                                                                     `--`-'                      
 */


