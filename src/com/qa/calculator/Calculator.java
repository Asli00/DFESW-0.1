package com.qa.calculator;

public class Calculator {

	//Add 
	public void add(int numOne, int numTwo) {
		System.out.println(numOne + numTwo);
		
	}
	
	//Multiplication 
	public void multiply(int numOne, int numTwo) {
		System.out.println(numOne * numTwo);
		
	}
	
	//Subtract
	public void subtract(int numOne, int numTwo) {
		System.out.println(numOne - numTwo);
		
	}
	
	//Divide
	
	public void divide(double numOne, double numTwo) {
		System.out.println(numOne / numTwo);
		//int changed to double becuase int does not take decimals and only allows whole numbers. when doing division best to put double.
	}
	
	
}


