package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		printMessage("this is my message");
         
	}


	public static void printMessage(String message) {
		
//		System.out.println(message);
		
	}
	
	
	public static void printMessage() {
//		DataType + VariableName = Value;
		String myMessage =  ("Hello World"); 
		
		System.out.println(myMessage);
		
		
//		to comment on your work and leave reminders or even keep code -do ctl and forward slash to do this.
//		System.out.println("hello world")
//		note 1- printlin is used to print text to new lines and print alone without the ln will make the lines in the same sentence in the console
//		note 2- anything inside double quotes like where hello world is written is known as a string. the double quotes define it. There are many data types and the data type for string is string with a capital s
//		note 3- single equals is something called assignment operator meaning it assigns values
//		note 4- the datatype next to message is such as the message above is a string. 
//		note 5- after every line of code there should be a semicolon otherwise the code wont run
//		note 6- the right data type must equal to the right variable, like two jigsaw pieces that fit together
//		note 7- line 9 and line 11 are the same or at least print out the same message as line 11 is the main function(method) that runs it. By inputing it in the brackets it presents the same answer when run in the application
//		note 8- cameltoe is when theres a capital at the beginning of everyword, for example hello world. The word message is a variable in lower case but still pascalcase and the reason for that is because its one word
//		note 9- pascalcase is what we use for vairables and it means the first letter is lower case and the first letter for every word would be upper case such as myMessage
//		note 10- Variables should be named somthing thats understandble and descriptive rather than something complicated unless theres context behind it. Such as writing the letter A as a variable is confusing unless there's context and example of that is maths
//		note 11- when running a string souble quotes isn't needed as you would like to print the message rather the the word message itself. By being the same colour such as yellow it shows that it recognises it
//		note 12- my message and hello word are equal as they are the same. My message is a variable that contains the value of a string called hello world. so to actually reference the variable you have to use it by name and not in quotes
//		note 13- to get hello world you must reference the variable to make it. The value of hello world is just stored in the variable my message, its just an extra common step
//		note 14- * we've gone from printing a string in the print, taking that string and storing it in a variable and then using that variable to print the value*
//		note 15 - line 5 is the MAIN method and is a method thats just special. it is used in by java as an entry point for the application. it is possible to write our own methods(functions) to use
//		note 16- function and mathod mean the same thing but java used method. the idea is to define a block of code, give it a specific name then run that block of code using its name later. much like how we referenced the vairable its just a little different.
//		note 17- the message/code that is written is contained within the curly brackets, the same thing applies to MAIN method and other main methods
//		note 18- the job of the main method is to serve as an entry point for the application, hence why its job is not to print a message. Almost like a title that is the MAIN heading and the sub heading is where all the message is done(printed out). thats why another main method (sub) is created to print the message which is its own code
//		note 19- theres a difference between the my message
	}
//		this is a main method but it is not the MAIN method as there is one above, just think of it like a sub heading under a main heading. The main method can be defined anywhere however the important part is where you call the method
		public static void printmessaage() {
		    System.out.println("SOME MESSAGE");
//		    the message above won't run as it is not a MAIN method and in order for it to run it must be put within the curly brackets under the main method which is above
	}
		
		
	
	
}