// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	09
// Due Date: 		March 02, 2016
// --------------------------

import javax.swing.*;
public class SpeakerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// declare object variables
		// to be used in program
		Speaker rover, aristotle, someone;

		// instantiate 'rover' to be a 'Dog' object
		rover = new Dog("Rover");
		rover.speak();
		rover.announce("Ruff ruff to all my fellow dogs!");
		
		// instantiate 'aristotle' to be a 'Philosopher' object
		aristotle = new Philosopher("Aristotle", "A true friend is one soul in two bodies");
		aristotle.speak();
		aristotle.announce("All men my nature desire to know.");
		
		
		// have aristotle pontificate!
		((Philosopher) aristotle).pontificate();
		
		// instantiate 'someone' to be a 'Dog' object
		someone = new Dog("Someone");
		someone.speak();
		someone.announce("Somebody thinks he is a dog.");

		
		// instantiate 'someone' to be a 'Philosopher' object
		someone = new Philosopher("Someone", "I think like a philosopher.");
		someone.speak();
		someone.announce("Somebody thinks he is smart.");
		
		// have 'someone' pontificate!
		((Philosopher) someone).pontificate();
		
		JOptionPane.showMessageDialog(null, "This program was written by Hassan Shirani");
		JOptionPane.showMessageDialog(null, "End of program.");

	}   // end method main

}   // end class SpeakerTester