package process;


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import gui.Pandess;
/**
 * Cette classe represente le slider qui permet de changer la force du cubisme
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class SliderCubisme implements ChangeListener {

	 JFrame frame;
	 Pandess pan;
	 JPanel panel;
	 JLabel label;
	 JSlider slider;
	 
	 public SliderCubisme(Pandess p){
		 
	  this.pan=p;
	  frame = new JFrame("Réglez l'intensité");
	  panel = new JPanel();
	  label = new JLabel();
	  slider = new JSlider(0,100,50);
	  
	  slider.setPreferredSize(new Dimension(400,200));
	  
	  slider.setPaintTicks(true);
	  slider.setMinorTickSpacing(10);
	  
	  slider.setPaintTrack(true);
	  slider.setMajorTickSpacing(25);
	  
	  slider.setPaintLabels(true);
	  slider.setFont(new Font("MV Boli",Font.PLAIN,15));
	  label.setFont(new Font("MV Boli",Font.PLAIN,25));
	  
	  slider.setOrientation(SwingConstants.VERTICAL);
	  
	  label.setText("intensité = "+ slider.getValue());
	  
	  slider.addChangeListener(this);
	  
	  panel.add(slider);
	  panel.add(label);
	  frame.add(panel);
	  frame.setSize(200,300);
	  frame.setVisible(true);
	 }
	 
	 @Override
	 public void stateChanged(ChangeEvent e) {
	  
	  label.setText("Intensité = "+ slider.getValue());
	  Pandess.force = slider.getValue();
	  pan.repaint();
	  
	 }

	}


