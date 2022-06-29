package com.qa.conditionals;

public class Runner {
	
	public static void main(String[] args) {
		//boolean condition =true;
		//  int number = 10;
		//  int numberTwo = 15;
		  
		
		// if (condition ==true {run this code} {run this code instead}
		
		// if (number >= 10) { // >less than     <greater than
		//	System.out.println("The condtion was true");
		 // } else { 
		//	System.out.println("The condtion was false");
			
		  
		//  &&- AND operator - used to say ALL conditions must be true
//			if (number == 10 && numberTwo <15) { // >less than     <greater than
//				System.out.println("The condtion was true");
//			  } else { 
//				System.out.println("The condtion was false"); 
			  }
			
		//  || - OR operator - used to say at LEAST ONE condition must be true
//		    if (number == 10 && numberTwo < 15) { // >less than     <greater than
//					System.out.println("The condtion was true");
//				  } else { 
//					System.out.println("The condtion was false");


	// if/else if/else
		int number = 60; {
		
//		if (number <= 40) {
//			System.out.println("Number is less than or equal to 40");
//		} else if (number <=50) {
//			 System.out.println("Number is less than or equal to 50");
//		} else if (number<=60)  {
//			System.out.println("Number is less than or equal to 60");
//		} else { 
//			System.out.println("Number is greator than 60");
			
		}
//		switch/case
		String grade = "A"; {
		
		switch (grade) { //down below the cases(lines) should break as when you run it, it calls everything under the string(A). so instead if A it does ABCD
		// ***the reason we break is so that we can split group cases together!for every case dont forget to break after its match so it doenst keep dropping down***
		
		case "A":
			System.out.println("Well done! Tope Mark");
			break;
		case "B":
			System.out.println("Not too bad, room for improvement");
			break;
		case "C":
			System.out.println("Not too bad, room for improvement");
			break;
		case "D":
			System.out.println("You have work to do!!!");
			break;
		default:
			System.out.println("You have failed :(");
					
					
					
					
		}
		
	}
}
