// ------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	04
// Due Date: 		February 10, 2016
// -----------------------------------------
import javax.swing.JFrame;

public class IncrementDecrementTester
{
   public static void main (String[] args)
   {
	   // Create frame, add pane, make visable
	   JFrame frame = new JFrame("Increment / Decrement");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.getContentPane().add(new IncrementDecrementPanel());
	   frame.pack();
	   frame.setVisible(true);

   }	// end method main
}  // end class IncrementDecrementTester

