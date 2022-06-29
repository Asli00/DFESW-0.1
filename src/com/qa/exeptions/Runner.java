package com.qa.exeptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("please enter a integer: ");
			
			int numberOne = 0;
			
			try {
				numberOne = scanner.nextInt(); //This line is throwing an exception when the input is invalid
				System.out.println("The number you have entered was: " + numberOne);
				flag= false;
				scanner.close();
		//	} catch (InputMismatchException ime) {
				System.err.println("You didn't enter an integer");
		//		scanner.nextline(); //clears the scanner
//				ime.printStackException ();
			} catch(IllegalStateException ise) {
				scanner.nextLine(); // clear the scanner
				System.out.println("I always run");
				scanner.close();
				
			}
		}
		
		
		
		
	}
	
	
}
