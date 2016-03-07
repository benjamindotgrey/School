//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #: 	06
// Due Date:     	February 17, 2016
//---------------------------------------------------
	
	// for GUI programming
import javax.swing.JFrame;

public class NumericKeypadTester
{
   
   public static void main (String[] args)
   {
	   	// create a frame and add pane to it and
	   	// make it visible
	   JFrame numericFrame = new JFrame("Numeric Keypad");
	   numericFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   numericFrame.getContentPane().add(new NumericKeypadPanel());
	   numericFrame.pack();
	   numericFrame.setVisible(true);

   }	// end method main
}	// end class NumericKeypadTester