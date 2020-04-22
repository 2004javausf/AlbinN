package com.revature.classtypes;

/*
 * Abstract class is a special class that can't be instantiated
 * They must contain at least one abstract method
 * 	Can contain concrete methods as well
 * "Contract based" - abstract methods MUST be overridden in subclass
 * 
 *                                                                                                                                      
         ,--.                                                                                                                        
       ,--.'|               ___      ,---,                                       ,---,        ,--,                                   
   ,--,:  : |             ,--.'|_  ,--.' |                                      '  .' \     ,--.'|     ,---,     ,--,                
,`--.'`|  ' :             |  | :,' |  |  :                      ,---,          /  ;    '.   |  | :   ,---.'|   ,--.'|         ,---,  
|   :  :  | |             :  : ' : :  :  :                  ,-+-. /  |        :  :       \  :  : '   |   | :   |  |,      ,-+-. /  | 
:   |   \ | :  ,--.--.  .;__,'  /  :  |  |,--.  ,--.--.    ,--.'|'   |        :  |   /\   \ |  ' |   :   : :   `--'_     ,--.'|'   | 
|   : '  '; | /       \ |  |   |   |  :  '   | /       \  |   |  ,"' |        |  :  ' ;.   :'  | |   :     |,-.,' ,'|   |   |  ,"' | 
'   ' ;.    ;.--.  .-. |:__,'| :   |  |   /' :.--.  .-. | |   | /  | |        |  |  ;/  \   \  | :   |   : '  |'  | |   |   | /  | | 
|   | | \   | \__\/: . .  '  : |__ '  :  | | | \__\/: . . |   | |  | |        '  :  | \  \ ,'  : |__ |   |  / :|  | :   |   | |  | | 
'   : |  ; .' ," .--.; |  |  | '.'||  |  ' | : ," .--.; | |   | |  |/         |  |  '  '--' |  | '.'|'   : |: |'  : |__ |   | |  |/  
|   | '`--'  /  /  ,.  |  ;  :    ;|  :  :_:,'/  /  ,.  | |   | |--'          |  :  :       ;  :    ;|   | '/ :|  | '.'||   | |--'   
'   : |     ;  :   .'   \ |  ,   / |  | ,'   ;  :   .'   \|   |/              |  | ,'       |  ,   / |   :    |;  :    ;|   |/       
;   |.'     |  ,     .-./  ---`-'  `--''     |  ,     .-./'---'               `--''          ---`-'  /    \  / |  ,   / '---'        
'---'        `--`---'                         `--`---'                                               `-'----'   ---`-'               
                                                                                                                                     
 */



public abstract class Animal {

	//abstract method
	public abstract void breathe();	
}


