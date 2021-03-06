// ------------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 006
// Semester: 		Spring 2016
// Assignment #:	03
// Due Date: 		February 10, 2016
// ------------------------------------------------

import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.util.Random;

public class FlightTester 
{
	public static void main(String[] args) throws Exception 
	{
		// Declare variables
		final int NUM = 3;
		int flightNumber, i, j, number;
		String airline, origin, destination;
		String flightNumberText;
		String output, fileText;
		
		
		// Instantiate object of type Random
		Random gen = new Random();

		// Declare an array of 'Flight' objects
		Flight allFlights[] = new Flight[5];
		
		// Prompt user for data and read in
		fileText = JOptionPane.showInputDialog(null,
				"Please enter the data file name:");
		File inputFile = new File(fileText);
		Scanner fromFile = new Scanner(inputFile);
		i = 0;
		output = "";
		
		// read in from the data file 
		while (fromFile.hasNext()) // need to change condition
		{
			airline = fromFile.next();
			origin = fromFile.next();
			destination = fromFile.next();
			flightNumberText = fromFile.next();
			flightNumber = Integer.parseInt(flightNumberText);
			
			// Instantiate flight objects, place in array.
			allFlights[i] = new Flight(airline, origin, destination, flightNumber);
					
			i++;
		}   // end while loop
		
		// Close the data file
		fromFile.close();
		
		// Build a string for display
		output = "(AIRLINE, ORIGIN, DESTINATION, FLIGHT NUMBER)\n\n";
		
		// concatenate the info from the array
		// to the 'output' string
		for (j = 0; j < i; j++)
		{
			output += allFlights[j];
			output += "\n";
		}
		
		// Print 'output' string to the option pane
		JOptionPane.showMessageDialog(null, output);
		
		// Prompt for new flight data
		airline = JOptionPane.showInputDialog(null,
				"Please enter new airline: ");
		origin = JOptionPane.showInputDialog(null,
				"Please enter new origin: ");
		destination = JOptionPane.showInputDialog(null,
				"Please enter new destination: ");
		flightNumberText = JOptionPane.showInputDialog(null,
				"Please enter new flight number: ");
		flightNumber = Integer.parseInt(flightNumberText);
		
		// Randomly select flight
		number = gen.nextInt(NUM);
		
		// Display which flight will be changed
		JOptionPane.showMessageDialog(null, 
				"Number " + number +
				" flight will be changed!");
		
		// Invoke mutators
		allFlights[number].setAirline(airline);
		allFlights[number].setOrigin(origin);
		allFlights[number].setDestination(destination);
		allFlights[number].setFlightNumber(flightNumber);
		
			// prepare string to display new
			// information about the flight that
			// you changed via the four accessor
			// methods to an option pane
		output = "(AIRLINE, ORIGIN, DESTINATION, FLIGHT NUMBER)\n\n";
		output += "(";
		output += allFlights[number].getAirline() + ",";
		output += allFlights[number].getOrigin() + ",";
		output += allFlights[number].getDestination() + ",";
		output += allFlights[number].getFlightNumber();
		output += ")";
		
		
		// Display this new flight!
		JOptionPane.showMessageDialog(null, 
				"New flight info for number " +
				number + "\n\n" +
				output);
		
		// Prepare string to display all flight records
		output = "(AIRLINE, ORIGIN, DESTINATION, FLIGHT NUMBER)\n\n";
		
		for (j = 0; j < i; j++)
		{
			output += allFlights[j] + "\n";
		}
		
		// Display all flights and closing message
		JOptionPane.showMessageDialog(null, output);
		JOptionPane.showMessageDialog(null,
		"\nThis program was written by Hassan Benjamin Shirani.\n" +
		"End of program.");

	}   // end method main

}   // end class FlightTester