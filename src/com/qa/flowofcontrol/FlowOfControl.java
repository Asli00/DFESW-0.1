package com.qa.flowofcontrol;

public class FlowOfControl {
//	note- These two method below will not run as they are not under the Main method as thats where execution of code starts. No code under main method=no execution done
//	Notice how only line 3 runs and not one and two, thats becuase only 3 is on the main. At the momwnt this is irrevalnt. 
//	¬to get it to run it must go under the main and call it using methodOne();
	public static void methodOne1() {
		System.out.println("Line 1");
	}
	
	public static void methodOne() {
		System.out.println("Line 2");
	}
	
	

//	Note 1- flow of control refers to how java flows through the code. Its important to understand what order java does things in
//	Continue^ - and sometimes we can alter/interfere with that order
//	Note 2- ultimately flow of control is how java controls the order that the code executes it. 
	
    
//	code execution STARTS with the main method
//	Note- *** there's already 2 things we now know now: the code will begin in the main method and starts executing here.
//	continue^: second is that is goes line by line and goes down the main method. This is the basis of how java runs its application. some things we do intrerupt it, and this is when we do calling methods 
//	the methods can be placed anywhere and can be top or below, the code run in the order it was placed under the mehtod. However its good to organise your code.
//	**to put it simply, its going to look for the MAIN method first and run. It will do this in the order it is in. 
//	The order is: line 28, 29, 7 ,8 , 9, 30, 11, 12, 13, 31
	public static void main(String[] args) {
		methodOne1();
		methodTwo();
		System.out.println("Line 3");
	}

private static void methodTwo() {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
