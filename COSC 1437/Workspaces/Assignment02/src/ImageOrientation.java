//---------------------------------------------------
// Programmer:   	Hassan Benjamin Shirani
// Course:       	COSC 1437 Section 006
// Semester:     	Spring 2016
// Assignment #:	02 
// Due Date:     	Feb 03, 2016
//---------------------------------------------------

import java.awt.*;
import javax.swing.*;

public class ImageOrientation 
{
	public static void main(String[] args) 
	{
		// Instantiate a frame from the class JFrame
		JFrame frame = new JFrame("Image Orientation");
	  
		// Frame is set to close using EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Instantiate four labels from the 
		JLabel label1 = new JLabel(new ImageIcon ("books.jpg"));
		JLabel label2 = new JLabel(new ImageIcon ("couple.jpg"));
		JLabel label3 = new JLabel(new ImageIcon ("lightbulb.jpg"));
		JLabel label4 = new JLabel(new ImageIcon ("dog.jpg"));
			     
		// Instantiate a panel from the JPanel
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.add(label1);
		panel1.add(label2);
		
		// Instantiate another panel from the JPanel
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add(label3);
		panel2.add(label4);
		
		// A primary panel is instantiated from the
		JPanel primary = new JPanel();
		primary.setBackground(Color.cyan);
		primary.add(panel1);
		primary.add(panel2);
		
		// Add primary panel to frame and make visible
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);

	}  // end method main

} // end class ImageOrientation