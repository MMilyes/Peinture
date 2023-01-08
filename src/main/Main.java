package main;



import javax.swing.JFrame;

import gui.Frame;
/**
 * Main GUI de peinture
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */

public class Main {

	public static void main(String[] args) {
		JFrame frame = new Frame();
        frame.setTitle("Peinture");
        frame.setSize(1300, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
	}


