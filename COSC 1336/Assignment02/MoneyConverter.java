// ------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1336 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	02
// Due Date: 		February 10, 2016
// -----------------------------------------

// Import the Scanner class
import java.util.Scanner;

public class MoneyConverter 
{
	// Method main
	public static void main(String[] args) 
	{
		// Declare constants (Number of pennies in X Dollar)
		final int TEN_DOLLARS = 1000;
		final int FIVE_DOLLARS = 500;
		final int ONE_DOLLAR = 100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int HUNDRED = 100;
		
		// Declare int variables to be used
		int tens, fives, ones, quarters, dimes, nickels;
		int remainingCents;
		
		// Declare float variables to be used
		double total, twiceAmount, halfAmount;
		double addTwoDollars, subtractOneDollar;
		
		// Declare character and string variables to be used
		char dollarSign, cents;
		String prefix, firstName, lastName;

		// Var assignments
		dollarSign = '$';
		cents = 162;
		prefix = "Mr.";
		firstName = "Hassan";
		lastName = "Shirani";
		
		// Instantiate object of type 'scanner'
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user to enter an amount of money
		System.out.print("Enter monetary amount:");
		
		// Read in amount given and assign value to variable
		//total = keyboard.nextFloat();
		total = keyboard.nextDouble();
		
		// Calculate twice, half, plus two dollars, and minus one dollar
		twiceAmount = total * 2.0;
		halfAmount = total / 2;
		addTwoDollars = total + 2.0;
		subtractOneDollar = total - 1.0;
		
		// Convert amount of money read into cents
		remainingCents = (int) (total * HUNDRED);
		
		// Print out current calculations
		System.out.println("\nThe amount of " + dollarSign +
				total +
				" is equivalent to " +
				remainingCents + cents +
				" " + "(cents)");
		System.out.println("Twice the amount is: " +
				dollarSign +
				twiceAmount + "!");
		System.out.println("Half the amount is: " +
				dollarSign +
				halfAmount + "!");
		System.out.println("Adding two dollars is: " +
				dollarSign +
				addTwoDollars + "!");
		System.out.println("Subtracting one dollar is: " +
				dollarSign +
				subtractOneDollar + "!");
		
		// Calculate how many ten dollar bills there are
		tens = remainingCents / TEN_DOLLARS;
		remainingCents %= TEN_DOLLARS;
		
		// Repeat procedure for five dollar bills,
		// one dollar bill, quarters, dimes, nickels, and pennies
		fives = remainingCents / FIVE_DOLLARS;
		remainingCents %= FIVE_DOLLARS;
		
		ones = remainingCents / ONE_DOLLAR;
		remainingCents %= ONE_DOLLAR;
		
		quarters = remainingCents / QUARTER;
		remainingCents %= QUARTER;
		
		dimes = remainingCents / DIME;
		remainingCents %= DIME;
		
		nickels = remainingCents / NICKEL;
		remainingCents %= NICKEL;
		
		// Print out information
		System.out.println("\nThat's equivalent to:\n");
		System.out.println(tens + " ten dollar bills");
		System.out.println(fives + " five dollar bills");
		System.out.println(ones + " one dollar bills");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(remainingCents + " pennies");
		
		System.out.println("\nThis program was written by " +
				prefix + 
				" " + 
				firstName + 
				" " +
				lastName);
	} // end method main

} // end class MoneyConverter