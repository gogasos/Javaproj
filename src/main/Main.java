package main;

import java.awt.*; 
import javax.swing.*;
public class Main extends JFrame
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JPanel pane = new JPanel();
  JButton pressme = new JButton("tryckpåmigförfan");
  Main()        // the frame constructor
  {
    super("JPrompt Demo"); setBounds(100,100,300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane);    // JPanel containers default to FlowLayout
    pressme.setMnemonic('P'); // associate hotkey to button
    pane.add(pressme); pressme.requestFocus();
    setVisible(true); // make frame visible
  }
  public static void main(String args[]) {new Main();}
}