//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #: 	05
// Due Date:     	February 17, 2016
//---------------------------------------------------

public class Address 
{
	// Declare instance fields
	private String streetAddress, city, state;
	private int zipCode;
	
	// Constructor
	public Address(String street, String town, String st, int zip)
	{
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}	// end constructor Address
	
	public String toString()
	{
		String result;
		
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		return result;
	}	// end method toString

}   // end class Address