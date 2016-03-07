// --------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	08
// Due Date: 		March 02, 2016
// --------------------------
import javax.swing.JFrame;

public class CheckboxesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instantiate a frame
		// from the class JFrame
		JFrame frame = new JFrame("Fun with check boxes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		// the primary panel is added
		// to the frame and made visible
		frame.getContentPane().add(new CheckboxesGUI());
		frame.pack();
		frame.setVisible(true);
		
		
		
	}	// end method main

}	// end class CheckboxesTester
