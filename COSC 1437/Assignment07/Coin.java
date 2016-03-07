//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #: 	07
// Due Date:     	February 24, 2016
//---------------------------------------------------

// Parent class
public class Coin 
{  
	// Constants
	protected final int HEADS = 0;
	protected final int TAILs = 1;
	
	// Variables
	private int face;
	
	// Constructor
	public Coin()
	{
		flip();
	}	// end constructor
	
	// flip the coin by randomly choosing a value
	public void flip()
	{
		face = (int) (Math.random() * 2);
	}   // end method flip
	
	public int getFace()
	{
		return this.face;  // to be modified
	}   // end method getFace
	
	// Parent's toString method
	public String toString()  
	{
		String faceName = "";
		
		if (getFace() == HEADS)
		{
			faceName = "(heads)";
		}
		else
		{
			faceName = "(tails)";
		}
		
		return faceName;  
	}	// end method toString

}   // end class Coin