package edu.ucsb.cs56.w14.drawings.tomcraig;
import javax.swing.*;

/** SimpleGui1 comes from Head First Java 2nd Edition p. 355.
      It illustrates a simple GUI with a Button that doesn't do anything yet.

     @author Head First Java, 2nd Edition p. 355
     @author P. Conrad (who only typed it in and added the Javadoc comments)
     @author Tom Craig
     @version CS56, Spring 2013, UCSB
*/

public class SimpleGui1
{

    /** main method to fire up a JFrame on the screen
          @param args not used
    */

    public static void main (String[] args) {
	JFrame frame = new JFrame() ;
	JButton button = new JButton("click me, I beg of you") ;

	java.awt.Color buttonFillColor = new java.awt.Color(153, 0, 0);
	button.setBackground(buttonFillColor);
	button.setOpaque(true);

	frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
	frame. getContentPane() . add(button) ;
	frame. setSize(300,300) ;
	frame. setVisible(true) ;
    }
}
