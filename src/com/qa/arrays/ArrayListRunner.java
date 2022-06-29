package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
	
   public static void main(String[] args) {
	   
	   // Primitive Data Types ( LOWER CASE DATA ONLY)                   
	   //int, double,float, boolean, char, short, byte
	   
	   //***there are two versions of this Data Type the top ^ and the bottom. The first one is one type one and the second type two***
	   
	   //Object Type aka Wraper Classes(CAPITAL IN MOST CASES)
	   //Integer, Double, Float, Long, Boolean, Short, Character, Byte
	 //  *** lISTS AND ARRAYLISTS ONLY DEAL WITH OBJECT TYPE DATA TYPES HENCE THE VERSIONS*** for example if you wanted to use these in the place where string is, it wont work unless its object despite being the same 
	//you can tell whether it is a primitve or an obeject if it is capitilised, for exmaple string is an object as its in caps.
	 List<String> listOfStrings = new ArrayList<>();
	 
	 //adding new values to the arraylist
	 listOfStrings.add("Hello");
	 listOfStrings.add("There");   // adding new elements to the array
	 listOfStrings.add("Anoush");
	 
	 //print the whole list
	 System.out.println(listOfStrings);
	 
	 //get a value by its index in the list
	System.out.println(listOfStrings.get(2));
	 
	//Change an existing value, using index
	 listOfStrings.set(2, "Brenda");
	 
	 //print the whole list
	 System.out.println(listOfStrings);
	 
	 //remove an element using index
	 listOfStrings.remove(0);
	 
	// print the whole list 
	 System.out.println(listOfStrings);
	 
	 //get the size of the acraylist
	 System.out.println(listOfStrings.size());
	 
	 //empty the size of the arraylist
	 listOfStrings.clear();
	 
	 //loop through arraylist
	 for (int i = 0; i < listOfStrings.size(); i++ ) {
		 System.out.println(listOfStrings.get(i));
	 }
	 
	 for (String value : listOfStrings) {
		 System.out.println(value);
		 
	 }
   }
	 
	 
	 
	 
}

