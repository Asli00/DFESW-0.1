package com.qa.hash;

import java.util.HashMap;

public class HashMapRecap {

	//keyValue pairs instead of index/value like lists
	private HashMap<String, String> capitalCities = new HashMap<>();
	
	public void addToHashMapRecapMethod() {
	//Add Values	
	capitalCities.put("Spain", "Madrid");
	capitalCities.put("England", "London");
	
	//get Values
	capitalCities.get("England"); //returns "London"
	
	// Remove 
	capitalCities.remove("england"); // Removes "england" entry
	
	//Get the size of the map
	capitalCities.size();
	
	//clear the entire map
	capitalCities.clear();
		
  // you dont always need to remeber syntax, knowing what you can do and the options you have, its important to understand it. If you know you can do   
   //*** loop through keys 
//	for (String key ; capitalCities.key()); {
   //***loop through values 
//	for	(String value ; capitalCities.values
   //***loop through both
 // this ^ are the three options you have and are widely used

	
	
}
}