package com.qa.operators;

public class Operators {

	public void basicMaths(int numOne, int numTwo) {
		//Maths operators, in the order plus , minus, multiply & divide
		System.out.println(numOne + numTwo);
		System.out.println(numOne - numTwo);
		System.out.println(numOne * numTwo);
		System.out.println(numOne / numTwo);

		}
		
	public void modules(int numOne, int numTwo) {
		System.out.println(numOne % numTwo);
		
	}
//	there are two operators
		//+= and -=
	public void plusMinusEquals() {
		int num = 10; //num is a variable
		num+= 5; // num = num + 5
	System.out.println(num);
	}		
		
	public void minusEquals() {
	} {
	    int num = 10;
	    num-= 5; //same as the one above but minus
	    System.out.println(num);
	
		//num = num + 5; // num + 5 won't work as it is a syntax error, hence why it is num = num +5		
		// however there is a shortcut which is num +=5 which means exactly the same thing as the comment above
	    //same method applies to x= and divide= (*= and /=)
		System.out.println(num);
		
	}

	//increment
	public void increment() {
	    int num = 10;
	    
	    num++; //addes one(+) by the num
	    
	    System.out.println(num);
	}
	//decrement 
	public void decrement() {
		int num = 10;
		
		num--; //takes away one (-) by the num
		
		System.out.println(num);
		
	}
	
	//***not operator (inversive)
	public void notoperator () {
		boolean flag =true;
		
		System.out.println(flag);
	}
	
	
	
	}
	
	

