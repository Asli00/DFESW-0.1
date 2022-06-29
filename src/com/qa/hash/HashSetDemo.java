package com.qa.hash;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Key/Value pairs
		//We don't choose the key
		//The key is a hash code of the value
		//The keys are unique
		//So you can't have duplicate objects
		//***the keys are generated from the value and baded on the value syou have added***
		HashSet<String> myHashSet = new HashSet<>();
		
		myHashSet.add ("Anoush");
		myHashSet.add("Claire");
		myHashSet.add("Charles");
		
		
		
		
		
		//This will overwrite the previous "Anous" string in the set
		// You CAN NOT add duplicate values
		myHashSet.add ("Anoush");
		System.out.println(myHashSet);
		
		//size of the set
		System.out.println(myHashSet.size());
		
		//check if the set is empty or not 
		System.out.println(myHashSet.isEmpty());//true or false
		
		//remove the set
		myHashSet.remove ("Anoush");
		
		//check if the headset contains an object
		System.out.println(myHashSet.contains ("Claire"));
		
		//this is what a hashcode looks like
		System.out.println("Charles".hashCode());
		
		//enhanced loop
		for (String value : myHashSet ) {
			System.out.println(value);
		}
		
		//forEach
		//For each entry in the collection, the provided method will run.
		myHashSet.forEach(value -> System.out.println(value));
		
	//	myHashSet.forEach(System.out.println());
		}
	}
	

