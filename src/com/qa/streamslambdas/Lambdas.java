package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		//enhanced for loop
		for(Integer value : myList) {
			System.out.println(value * 10);
			
		}
		//Single argument lambda Expression syntax:
		//arg1-> {mehtod body}
				
		//Multiple argument Lambda Expression syntax:
	   //(arg1, arg2 ->{method body}
		
		
		// you only need curly brackets for method body when its multiple lines!
		//does the same thing as the loop above
		//Used a lambda expression as the parameter for the method forEach();
		myList.forEach(value -> System.out.println(value * 10));
		
		//This is identical to the abobe one, but on multiple for clarity
		myList.forEach(value-> {
			System.out.println(value);
		});
		
		//this is a multi line lambda expression
		//it contains some conditional logic as well
		
		myList.forEach(value -> {
			if(value % 2 == 0) {//checks if the value is even
				System.out.println(value); //print the value if its even
			}
		});
		
	}
}
		
			
		
		
		
		
		
	
		
		


