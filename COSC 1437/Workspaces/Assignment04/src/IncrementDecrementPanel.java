// ------------------------------------------
// Programmer:		Hassan Benjamin Shirani
// Course:			COSC 1437 Spring 2016
// Semester: 		Spring 2016
// Assignment #:	04
// Due Date: 		February 10, 2016
// -----------------------------------------
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementDecrementPanel extends JPanel
{
	// Declare constant
	private int INITIAL_NUMBER = 50;
	
	// Declare variables/controls
   	private JLabel numberLabel;
   	private JButton incButton, decButton;
   	private int number;
 
   public IncrementDecrementPanel()
   {
	   number = INITIAL_NUMBER;

	   // Create a label showing the number
      numberLabel = new JLabel(String.valueOf(INITIAL_NUMBER));

      // Create two buttons and associate listeners
      incButton = new JButton("Increment");
      incButton.addActionListener(new IncListener());
      decButton = new JButton("Decrement");
      decButton.addActionListener(new DecListener());
      
      // Add controls to panel
      this.add(decButton);
      this.add(numberLabel);
      this.add(incButton);

      // set up size and color of panel
      this.setPreferredSize(new Dimension(250, 50));
      this.setBackground(Color.GRAY);
      
   }	// end constructor IncrementDecrementPanel


   private class IncListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
    	  // increment number and display it
    	  numberLabel.setText(Integer.toString(++number));
      }
   }	// end class IncListener

   
   private class DecListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
    	  // decrement number and display it
    	  numberLabel.setText(Integer.toString(--number));
      }
   }	// end class DecListener
}   // end class IncrementDecrementPanel
