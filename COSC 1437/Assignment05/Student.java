//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #: 	05
// Due Date:     	February 17, 2016
//---------------------------------------------------
	
// import for number formatting
import java.text.DecimalFormat;

public class Student 
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;

	// Declare instance fields
	private int test1, test2, test3;
	
	public Student(String first, String last, Address home,
			       Address school, int t1, int t2, int t3)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		
		// set test scores to be parameter values
		this.test1 = t1;
		this.test2 = t2;
		this.test3 = t3;
		
	}   // end constructor Student
	
	public Student(String first, String last, Address home,
		       Address school)
    {
	    firstName = first;
	    lastName = last;
	    homeAddress = home;
	    schoolAddress = school;
	    
	    // Set test scores to be zero
	    this.test1 = 0;
	    this.test2 = 0;
	    this.test3 = 0;

    }   // end overloaded constructor Student
	
	public void setTestScore(int testNumber, int score)
	{
		switch(testNumber)
		{
			case 1:
				this.test1 = score;
				break;
			case 2:
				this.test2 = score;
				break;
			case 3:
				this.test3 = score;
				break;
			default:
				System.out.println("Error, " + testNumber + " does not exist");
		} // end switch statement
	}   // end method setTestScore
	
	public int getTestScore(int testNumber)
	{
		int testScore;
		switch(testNumber)
		{
			case 1:
				testScore = this.test1;
				break;
			case 2:
				testScore = this.test2;
				break;
			case 3:
				testScore = this.test3;
				break;
			default:
				System.out.println("Error, " + testNumber + " does not exist");
				testScore = -1;
		} // end switch statement
		
		return testScore;	
		
	}   // end method getTestScore
	
	public double getAverage()
	{
		double average;
		
		// calculate average test score
		average = (double) (this.test1 + this.test2 + this.test3) / 3.0;
		
		return average;	
	}   // end method getAverage
	
	public String toString()
	{
		String result;
		
		// Declare formatting helper
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		// Build display string
		result = "Student: ";
		result += firstName + " " + lastName + "\n\n";
		result += "Home Address: " + homeAddress + "\n";
		result += "\nSchool Address:\n" + schoolAddress;
		
		// add information about the test scores
		result += "\n\nTest 1 score: " + test1;
		result += "\nTest 2 score: " + test2;
		result += "\nTest 3 score: " + test3;
		result += "\nAverage test score: " + fmt.format(getAverage());
		
		return result;	
	}   // end method toString
	

}   // end class Student