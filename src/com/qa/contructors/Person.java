package com.qa.contructors;

public class Person {
	
	public String name;
	public int age;
	public int shoeSize;

//	public Person () {
//	This^ isn't needed to be written as it comes with the class by default
		
	public Person(String name, int age, int shoeSize) {
		this.name =name;
		this.age = age;
		this.shoeSize = shoeSize = 11; //default value
//		age, name, shoesize are properties of the class and part of the class members
//	***Class members are either variables or members within a class***
	}
		
//  This shows us that in java we can create these classes that that serve as/like a structure, like a blueprint
//	continue^: and then we can make custom objects and as many as we want out of this class and we can make as many people as new want to with different properties 
//	This is the first bit of program oriented that we've looked at
//	and another thing we've seen is that the main method does not have to be just in the class like before, we can take the main method out into its own class called a runner, that'll allow us to run from elsewhere
//	Its much better and easier as all the info is not just piling up on each other and that it is separate 
//	This follows neater principles as every class should have one job and one job only 
//	The job of this class is to run the program (Left = person) and the job of this class is to run a person (right =runner). 
//	A class cannot do two jobs hence why the separated classes
//	A better way to understand this is think of it like a book, they are the same material but have different jobs. The cover keeps the contents and the pages contain the contents
//	continue^: the cover is the class that has the Person and the runner is the pages which keeps it going.
	}
	

