import java.util.Scanner;

// ------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1336 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	02
// Due Date: 		February 10, 2016
// -----------------------------------------
public class CompareNumbers 
{
	public static void main(String[] args) 
	{
		// Declare variables
		int number1, number2;
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt for first number
		System.out.println("Enter the first number: ");
		number1 = keyboard.nextInt();
		
		// Prompt for second number
		System.out.println("Enter the second number: ");
		number2 = keyboard.nextInt();
		
		// Determine if second input is less than 20
		if (number2 < 20)
		{
			System.out.println("\nSecond number is less than 20");
		}
		
		// Triple value 1, echo new value
		number1 = number1 * 3;
		System.out.println("\nNumber 1 is now " + number1);
		
		// Quadruple value 2, echo new value
		number2 = number2 * 4;
		System.out.println("\nNumber 2 is now " + number2 + ".");
		
		// Determine if first number is an even number
		if (number1 % 2 == 0)
		{
			System.out.println("\nNumber 2 is an even number.");
		}
		else
		{
			System.out.println("\nNumber 2 is an odd number.");
		}
		
		// Determine if both numbers are over 25
		if (number1 > 25 && number2 > 25)
		{
			System.out.println("\nBoth numbers are above 25.");
		}
		
		// Determine if number1 is greater than 50
		// or if number2 is less than or equal to 10
		if (number1 > 50 || number2 <= 10)
		{
			System.out.println("\nNumber 1 is above 50 or number 2 is 10 or less.");
		}
		
		// Close keyboard (scanner) handle, terminate program
		keyboard.close();
		System.out.println("\nThis program was written by Hassan Shirani.");
		System.out.println("End of Program.");
		
	} // end method main

} // end class CompareNumbers
