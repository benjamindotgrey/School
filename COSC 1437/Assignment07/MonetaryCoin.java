//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #: 	07
// Due Date:     	February 24, 2016
//---------------------------------------------------

public class MonetaryCoin extends Coin 
{  // child class
	
	// declare an instance field that
	// represents the value of a coin
	private int value;
	
	public MonetaryCoin(int money)
	{
		// invoke the parent's constructor
		super();
		this.value = money;
		
	}   // end constructor Monetary
	
	public int getValue()
	{
		// only if and only if it is 
		// heads do we return its value
		// otherwise, do not return
		// its value
		if (this.getFace() == HEADS)
		{
			return this.value;
		}

		return 0;
	}   // end method getValue
	
	public String toString()
	{
		String result, coinType;

		// invoke parent's toString method
		// to begin building a string
		result = super.toString();
		
		switch(this.value)
		{
		case 1: coinType = "Penny"; break;
		case 5: coinType = "Nickel"; break;
		case 10: coinType = "Dime"; break;
		case 25: coinType = "Quarter"; break;
		case 50: coinType = "Half Dollar"; break;
		case 100: coinType = "Dollar"; break;
		default: coinType = "Unknown coin type"; break;
		} // end switch statement
		
		
		result += " for " + coinType + ": " + ((double) value / 100);
				
		return result;
		
	}   // end method toString

}   // end class MonterayCoin