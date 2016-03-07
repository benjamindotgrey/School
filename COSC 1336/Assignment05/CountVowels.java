// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1336 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	07
// Due Date: 		March 09, 2016
// --------------------------

import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args) 
	{
		// Constants and variables
		int acount, ecount, icount, ocount, ucount, ycount, consonant, index;
		boolean keepGoing = true;
		char charAnswer;
		String oneString, output, answer;
		
		
		// Pool up scanner
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			acount = 0;
			ecount = 0;
			icount = 0;
			ocount = 0;
			ucount = 0;
			ycount = 0;
			consonant = 0;
			
			// Prompt for input
			System.out.println("\nEnter a string: ");
			oneString = keyboard.nextLine();
			
			// Convert to lower case
			oneString = oneString.toLowerCase();
			System.out.println("Lower case string is now: " + oneString);
			
			for (index = 0; index < oneString.length(); index++)
			{
				switch(oneString.charAt(index))
				{
				case 'a': acount++; break;
				case 'e': ecount++; break;
				case 'i': icount++; break;
				case 'o': ocount++; break;
				case 'u': ucount++; break;
				case 'y': ycount++; break;
				default: consonant++; 
				} // end switch statement
			} // end for loop
			
			// Build string and print output
			output = "\nNumber of each vowel in the string: " +
					"\na: " + acount +
					"\ne: " + ecount +
					"\ni: " + icount +
					"\no: " + ocount +
					"\nu: " + ucount +
					"\ny: " + ycount +
					"\nconsonant: " + consonant;
			System.out.println(output);
			System.out.println("\n\nWould you like to continue with another word (y/n)?");
			answer = keyboard.nextLine();
			charAnswer = answer.charAt(0);
			if (charAnswer == 'y' || charAnswer == 'Y')
			{
				keepGoing = true;
			}
			else
			{
				keepGoing = false;
			}
		} while (keepGoing == true);
		
		System.out.println("\nThis program was written by Hassan Shirani.");
		System.out.println("\nEnd Program.");
	} // end method main

} // end class CountVowelsf