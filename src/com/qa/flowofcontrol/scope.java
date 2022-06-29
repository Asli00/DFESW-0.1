package com.qa.flowofcontrol;

public class scope {

//	note- scope is the idea that certain areas in the code where things are accessible and there are areas where things are not accessible.can the code see where it is coming from? that is what scope is.
//	There are different types of scope. Starting with class level scope. This is when you put a variable at the top of the class outside of any methods whether its MAIN or main  
//	If i declare this variable down below inside the class but outside of the method, this is class level. This means that is visible and avaible everywhere.(in other langues its global scope) 
//	note- the curly brackets define the scope that it is available in. for example the whole class is from line 3 to last line the curly brackets are in, everything within is a scope.
//	however as discussed, there are different scopes. For example the scope starts on line line 15 and ends on line 20 (}start like this < end like this > {). Curly brackets trap the variable, they contain it and can be classified either as class level or method level depending on where they start and end.
//	*** void does not return a value(anything) unlike the ones that were covered in data types when returning values. If void was taken out of public static then that would mean that it needs to be return a value back which is what we dont't want unless you are actually returning a value.
//	continue ^: to put it simply void means no return at all***
//	*** if something is within scope, it means you can see it. if something is out of scope, it means you can't see it.
	//This is class level scope- this is the scope outside of the method but present in the class. when returning it is a value you can do something with going forward.
	public static String message = "class level";
	
	
	public static void methodOne () {
		//method level scope- this is the scope within  the method
		String methodLevelMsg = "method level";
		System.out.println(message);
		
	}
	
	public static void main(String[] args) {
		methodOne();
//		System.out.println(message);
		
	}
	
	
	
}






