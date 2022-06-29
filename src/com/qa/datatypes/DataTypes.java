package com.qa.datatypes;

public class DataTypes {
	
//	Datatype + variableName=value semicolon;
//	static String myString= "text";

//	Datatypes notes:
//	Note 1: in java there are a lot of different datatypes and they are split into two main categories. 
//	Note 2: the first is primitive datatypes and the second is non primitive(object) datatypes
//	Note 3: If the datatype has a capital letter it is not primitive (2) its an object, if it has lowercase it is primitive(1)
//	Note 4: ***Primitive datatypes are lowercase and non primitive datatypes start with an uppercase***
//	Note 5: a primitive datatype is the smallest form of data you can use in java. Things like numbers, ranging from different sizes from 8no's to 64no's. This means that there are numerous ways of storing these datatypes and what size they are.
//	Note 6: example of this is: byte- 8 bits long, short- 16 bits long, int- 32 bits long and long- 64 bits long and they are all used for whole numbers. Things like decimals arent inlcuded and anything that isnt a decimal is stored under these 4
//	Note 7: Float and double are the two datatypes used to store decimal numbers. The difference between the two is double is twice the size of float. Float is 32- bits long and double is 64-bits long.
//	Note 8: our variables can have datatypes but also our methods can too as well. Thats becuase they can return things. Void is the key word we use in java to signal that a method is not going to return a value.
//note to self- when trying to run a method if there is another MAIN method it wont run. Its either you make it grey or delete it. Two MAINS cannot exist only one does and the other mains go under it 
//	continuing^- for example when trying to run the static method below(returning) It didnt run because it was I didnt make it the main method, another one was there. Even if the code is right it won't run. Be careful and check.
	
//	Primitive datatypes (lowercase)
//	Note- the reason why this many datatypes exist is because they all are containers that hold a certain capacity. It gives you the option to choose between which container is suitable and of an appropriate size of the data that is trying to be stored. Also it is save space and not store small data in big unnecessary large spaces.
//	Note- in this case the datatypes byte,short,int and long can be used as it fits the range of letters it requires. Almost like a capcity limit. This number is 2 integers making it fit  all of them.
//	Note- in java, int is the most common type used because in most situations int covers most of what is going to be used and its not so large and covers a nice range of numbers.
//	Note- long is used for things like IDs becuase it covers a long range of numbers, longer than int
//	Note- Primitive uses whole numbers of different sizes, the example down below is a perfect example and if you want to creat a numerical datatype int is good to use
//	Note- these are used when we want to store a small piece of raw data using the appropriate primitive datatype, this can include numbers characters, true or false.
//	Note- primitive datatypes are highlighted in orange which makes it easier to distinguish
//	Note- 

	int age = 29;
	
	
//	Non-primitive (object)datatypes(start with capital letters)
//	float and doubles are used for decimal numbers. bank numbers for example can't use int because it isn't an integer. either a float or double will be used depending on the bits it has. Java however by default has it saved as a double.
	double bankBalance = 4999.99;
//	unless specificed if it is float it will store it in double.if it is a double stored in float it will complain and not run. like how int is the norm, double is the norm too.
// boolean values are either true or false and nothing else as thats how it works
	boolean happy = true;
	
//	characters are single letters
//	Note-In java, you have to use double quotes "" for strings because single quotes also known as single tics are for chars ''
//	Note- anything that falls 'unicode' structure is allowed and valid, and they are surrounded by single quotes
	
	char letter = 'a';

//	Note-  A default value is what you'll see if the variable doesn't have a value, this means that there will always be something if there is nothing specific written down in the variable slot because that is how java is. it will never be unidentified. 
	
	//public static void main(String[] args) {
//		System.out.println(myString );
//		Note- My string is the text that is above as it the variable we defined earlier. 
		

//	methods can return any datatype including void(meaning return nothing)
	public static double returnsommething() {
		return 9.99;
		
	}
	
//	system.out.println is a method and to call it out you must put curly brackets. Nothing will run if they are not between these 
//	note- the main method that is running everything is static. All the other methods under the MAIN method must have static in order to run as well as it having different names to distinguish between them
//	***Note- if the main method is static then the rest must be too. This applies to the other methods too***
	public static void main(String[] args) {
		System.out.println(methodName1());
		System.out.println(methodName2());
		System.out.println(methodName3());
		System.out.println(methodName4());
		System.out.println(methodName5());
		System.out.println(methodName6());
		methodName7(); //this is void, and will print on its own
}
	
	public static int methodName1() {
	    return 0;
	}
	public static boolean methodName2() {
	    return true;
	}
	public static char methodName3() {
	    return 'P';
	}
	public static long methodName4() {
	    return 52L;
	}
	public static float methodName5() {
	    return 0.6f;
	}
	public static String methodName6() {
	    return "Hi there";
	}
	public static void methodName7() {
	   System.out.println("I'm void!");
	}
	
}

