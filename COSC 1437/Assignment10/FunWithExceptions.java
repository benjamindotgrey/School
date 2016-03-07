// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	10
// Due Date: 		March 02, 2016
// --------------------------

import javax.swing.*;
import java.util.Random;

public class FunWithExceptions
{
   public static void main (String[] args) throws StringTooLongException, NoEvenNumberException
   {
	   // declare variables to be used in program
	   final int MAX = 20;
	   int num;
	   String input = "";
	   String name = "Hassan Shirani";
	   
	   // instantiate an object from the
	   // Random class so we can 
	   // generate random numbers
	   Random rand = new Random();
	   
	   // set up exceptions to 
	   // be caught if raised
	   StringTooLongException lengthException = new StringTooLongException("String has to many characters");
	   NoEvenNumberException noEvenException =  new NoEvenNumberException("No even numbers are allowed");
	   
	   // process string
	   // and number
	   do
	   {
		   // prompt the user to enter a string, read string in.
		   input = JOptionPane.showInputDialog(null, "Please enter a string. Enter DONE when finished.");
		   if (!input.equalsIgnoreCase("DONE"))
		   {
			   try
			   {
				   if (input.length() > MAX)
				   {
					   throw lengthException;
				   } // end if 
				   else
				   {
					   JOptionPane.showMessageDialog(null, 
							   "You entered: \"" + 
								input + 
								"\", its length was " + 
								input.length(), 
								"String info", 
								JOptionPane.INFORMATION_MESSAGE);
				   } // end else clause
				   
				   // Generate a random number between 0 and 99
				   num = rand.nextInt(100);
				   System.out.println("num is: " + num);
				   
				   // Number is even (throw exception)
				   if ((num % 2) == 0)
				   {
					   throw noEvenException;
				   } // end if
				   
			   } // end try clause
			   // Catch long string exception that was raised
			   catch (StringTooLongException e)
			   {
				   JOptionPane.showMessageDialog(null, e.getMessage() + "\nPlease try again!", "Invalid string input", JOptionPane.ERROR_MESSAGE);
			   }
			   // Catch even number exception
			   catch (NoEvenNumberException e)
			   {
				   JOptionPane.showMessageDialog(null, e.getMessage() + "\nOops!", "Invalid even number", JOptionPane.ERROR_MESSAGE);   
			   }
		   }
	   } while (!input.equalsIgnoreCase("DONE"));
	   JOptionPane.showMessageDialog(null, "This program was written by " + name + "\nEnd of program.", "Good bye!", JOptionPane.INFORMATION_MESSAGE);

   }	// end method main
}	// end class FunWithExceptions