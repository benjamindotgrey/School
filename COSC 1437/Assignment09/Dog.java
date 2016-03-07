// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	09
// Due Date: 		March 02, 2016
// --------------------------

public class Dog implements Speaker 
{
	private String name;
	public Dog(String inName)
	{
		name = inName;
	}
	
	public void speak()
	{
		System.out.println(name + " says: Woof");
	}
	
	public void announce(String str)
	{
		System.out.println(name + " playfully announces: " + str);
	}
}
