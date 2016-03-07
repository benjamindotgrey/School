// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1336 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	4
// Due Date: 		March 02, 2016
// --------------------------
import java.util.Scanner;

public class NumberOperations 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Initialize variables
		int number1, number2, answer1, selection;
		double answer2;
		boolean done, invalidChoice;
		
		// Configure variables;
		answer1 = -1;
		answer2 = 1.0;
		selection = 0;
		done = false;
		invalidChoice = false;
		
		// Configure input handle
		Scanner keyboard = new Scanner(System.in);
		
		// Collect first number
		System.out.println("Enter first number: ");
		number1 = keyboard.nextInt();

		// Collect second number
		System.out.println("Enter second number: ");
		number2 = keyboard.nextInt();
		
		while (done != true)
		{
			// Print menu
			System.out.println("\nPlease select operation type for " + number1 + " and " +  number2 + "\n");
			System.out.println("1 - add these two numbers");
			System.out.println("2 - subtract second number from first number");
			System.out.println("3 - multiply both numbers");
			System.out.println("4 - integer division (first number / second number)");
			System.out.println("5 - floating point division (first number / second number");
			System.out.println("6 - Exit\n");
			
			// Collect response
			selection = keyboard.nextInt();
			
			// Add
			if (selection == 1)
			{
				answer1 = number1 + number2;
				invalidChoice = false;
			}
			// Subtract
			else if (selection == 2)
			{
				answer1 = number1 - number2;
				invalidChoice = false;
			}
			// Multiply
			else if (selection == 3)
			{
				answer1 = number1 * number2;
				invalidChoice = false;
			}
			// Integer division
			else if (selection == 4)
			{
				answer1 = number1 / number2;
				invalidChoice = false;
			}
			// Floating point division
			else if (selection == 5)
			{
				answer2 = ((float) number1) / number2;
				invalidChoice = false;
			}
			else if (selection == 6)
			{
				done = true;
				invalidChoice = false;
			}
			else
			{
				invalidChoice = true;
				System.out.println("\n***ERROR*** " + selection + " is not a valid selection.  Please try again!");
			}
			
			if (selection == 5 && invalidChoice == false)
			{
				System.out.println("\nCalculated answer is: " + answer2);
			}
			else if (selection != 6 && invalidChoice == false)
			{
				System.out.println("\nCalculated answer is: "+ answer1);
			}
			else
			{
				System.out.println("\nNo calculation done.");
			}
		
		} // end while loop
		
		System.out.println("\nThis program was written by Hassan Shirani.");
		System.out.println("\nEnd program.");
		
	} // end method main

} // end class NumberOperations
