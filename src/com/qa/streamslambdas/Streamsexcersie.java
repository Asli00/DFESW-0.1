package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamsexcersie {

	public static void main(String[] args) {
		
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Michael");
		listOfNames.add("James");
		listOfNames.add("Chris");
		listOfNames.add("Jane");
		
		Stream<String> streamOfNames = listOfNames.stream(); //convert the list to stream
		
		streamOfNames.filter(name -> !name.contains("J")).forEach(name -> System.out.println("hello" + name));
		
		//solution if you want to print James as well 
		streamOfNames.forEach(name -> {
			if (!name.equals(James)){
				System.out.println("Hello + name");
			}else { 
				System.out.println(name);
				
			}
			
		});
		
		
		
		
		
	}
}
