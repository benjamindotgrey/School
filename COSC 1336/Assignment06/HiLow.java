// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1336 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	06
// Due Date: 		February 06, 2016
// --------------------------

import java.util.Scanner;

public class HiLow 
{

	public static void main(String[] args) 
	{
		// Vars and Constants
		final int MAX = 100;
		int target, currentCount, guess;
		int overallGuessCount, totalTargetCount;
		double average;
		String again, stringOutput;
		
		// Assign variable values
		currentCount = 0;
		overallGuessCount = 0;
		totalTargetCount = 0;
		
		// Instantiate Scanner
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			// Instruct user
			System.out.println("Guess a number between 1 and " + MAX);
			
			// Generate random number between 1 and 100
			target = (int) (Math.random() * MAX) + 1; 
			
			// Increment number generated counter
			totalTargetCount += 1;
			
			// Set currentCount to zero
			currentCount = 0;
			
			// Run if target is not matched and guess is greater than zero
			do
			{
				// Instruct user
				System.out.println("Enter your guess (0 to quit): ");
				guess = Integer.parseInt(keyboard.nextLine());
				
				// Increment
				currentCount++;
				overallGuessCount++;
				
				// Test guess
				if (guess > 0)
				{
					// Guess too low
					if (guess < target)
					{
						System.out.println("Your guess was too LOW.");
					} 
					else if (guess > target)
					{
						System.out.println("Your guess was too HIGH.");
					} 
					else
					{
						System.out.println("Correct! Amount of guesses " + currentCount);
					} // end inner if statement
					
				} // end outer if statement
			} while (guess != target && guess > 0);
			
			// Instruct user
			System.out.println("Play again (y/n)?");
			again = keyboard.nextLine();
			
		} while (again.equalsIgnoreCase("y"));

		// Calculate stats
		average = (double) overallGuessCount / totalTargetCount;
		stringOutput = (average > 10.0) ? "need a new strategy!" : "are a great guesser!";
		
		// Inform user
		System.out.println("\nYou " + stringOutput);
		System.out.println("\nYou averaged " + average + "guesses for " + totalTargetCount + "targets.");
		System.out.println("Overall guess count: " + overallGuessCount + ".");
		System.out.println("\nThis program was written by Hassan Shirani.");
		System.out.println("\nEnd of Program.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	} // end method main

} // end class HiLow
