package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<String> myAnimalList = new ArrayList<>();
		myAnimalList.add("cat");
		myAnimalList.add("dog");
		myAnimalList.add("fish");
		
		//converting my list to a stream
		//This will allow me to use stream operations on my collections
		Stream<String> myAnimalStream = myAnimalList.stream();
		
		//terminal operations - Always go at the end of the stream pipeline
		//Foreach
//		myAnimalStream.forEach(value -> System.out.println(value));
		// .collect
		//This converts the stream back into a list
		
		//intermediate operations
		//Filter - used to filter OUT certain values 
		//The lambda should return true or false
//	myAnimalStream.filter(animal -> animal.contains("a")).forEach(value -> System.out.println(value));
		//makes it easier to use in application but not necessary, hence it being intermediate
		
		List<String> myFilteredList = myAnimalStream.filter(animal -> animal.contains("a")).collect(Collectors.toList());
		
		//second filter example
		//using integer
		List <Integer> myIntList = new ArrayList<>();
		myIntList.add(1);
		myIntList.add(2);
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(5);
		
		Stream<Integer> myIntStream = myIntList.stream();
		
		myIntStream.filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));
		// map (intermediate operation)
	    // used for modyfying/chnaging values in the stream
		//lambda expssion provided decides how they are chnaged 
		myAnimalStream.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		List<String> myUpperCaseAnimals = myAnimalStream.map(animal -> animal.toUpperCase()).collect(Collectors.toList());
		
		//Reduce (terminal operation)
	//	int sum = myIntStream.reduce ()
	}
	
	
	
}
