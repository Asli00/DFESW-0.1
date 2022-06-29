package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		Operators op =new Operators();
		//op.basicMaths(10,5);
		//op.modules(9, 4);//
	                               	op.plusMinusEquals();
		op.minusEquals();
		
		op.increment();
	    op.decrement();
		
		op.notoperator();
		
		
		//** you have to create an object to access a method cause static is not in use here***
		//
		
	}
}
