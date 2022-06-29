package com.qa.contructors;

public class Runner {

	public static void main(String[] args) { 
		Person anoush = new Person ("Anoush", 29, 11);
		
		Person tom = new Person ("Tom", 15, 10);
		
		Person asli =new Person ("Asli", 20, 6);
		
//***NOTE: As you can see above,^this can be reduced to two lines instead of 8 like the example down below
//Now we'll create a person variable, that means the dataType of my person is person with a capital p
//Note - non primitive datatypes in java are all objects. This means that String and Person is an object. The only difference is that string is part of java and person is new which is added by the individual. 
//In java there are two datatypes: Primitive and non primitive. 
 // DataType + Variable = Value
//	Person anoush = new Person (); //new person object
//	anoush.name = "Anoush Lowton";
//	anoush.age = 29;
//	anoush.shoeSize = 11;
//  this step can now be repeated and filled in with the desired person. There's always going to be the persons name 
//	at the top there's an anoush object and down below there's a tom object and you can run them to see each one's value.
//	Person tom = new Person (); //new person object
//	tom.name = "Tom Smith";
//	tom.age = 15;
//	tom.shoeSize = 10;
	
//System.out.println( anoush.name + "'s age"+ anoush.age);
// the name is the object, the age is the string and the age at the end.

//System.out.println(tom.name + "'s age" + tom.age);
// two objects created  and can be run

System.out.println(anoush.name);
System.out.println(anoush.age);
System.out.println(anoush.shoeSize);


		
		
		
	}

}
