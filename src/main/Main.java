package main;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel pane = new JPanel();
	JButton pressme = new JButton("tryckpåmigförfan");
	
	public Frame() {
		super("Flappy Bird sucks big tits");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane(); // inherit main frame
		con.add(pane);    // JPanel containers default to FlowLayout
		
		pressme.setMnemonic('P'); // associate hotkey to button
		pane.add(pressme);
		pressme.requestFocus();
		setVisible(true); // make frame visible
	}
	
}

public class Main{
	
	public static void main(String args[]) {
		new Frame();
	}
	
}