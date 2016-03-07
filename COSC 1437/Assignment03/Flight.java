// ------------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 006
// Semester: 		Spring 2016
// Assignment #:	03
// Due Date: 		February 10, 2016
// ------------------------------------------------

public class Flight 
{
	// Declare instance fields
	private String airline, origin, destination;
	private int flightNumber;
	
	// Constructor
	public Flight(
					String inAirline, 
					String inOrigin,
					String inDestination,
					int inFlightNumber
				)
	{
		this.airline = inAirline;
		this.origin = inOrigin;
		this.destination = inDestination;
		this.flightNumber = inFlightNumber;
		
	}	// end constructor Flight
	

	// Accessors 
	public String getAirline()
	{
		return this.airline;
	}
	
	public String getOrigin()
	{
		return this.origin;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	public int getFlightNumber()
	{
		return this.flightNumber;
	}
	
	// Mutators
	public void setAirline(String inAirline)
	{
		this.airline = inAirline;
	}
	
	public void setOrigin(String inOrigin)
	{
		this.origin = inOrigin;
	}
	
	public void setDestination(String inDestination)
	{
		this.destination = inDestination;
	}
	
	public void setFlightNumber(int inFlightNumber)
	{
		this.flightNumber = inFlightNumber;
	}
	
	public String toString()
	{
		String localString;
		
		localString = "(" + this.airline + ", " + this.origin + ", " + 
						this.destination + ", " + 
					this.flightNumber + ")";
		return localString;
	}

}   // end class Flight