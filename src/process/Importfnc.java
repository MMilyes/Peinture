package process;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import gui.Pandess;
/**
 * Cette classe de processus permet l'import d'image
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class Importfnc  {
	private File fileimage;
	public Importfnc() {}
	
	public void imp() {
		
		final JFrame frame = new JFrame();
		JFileChooser chooser2 = new JFileChooser(); 
  	    chooser2.setDialogTitle("choisir l'image");     	       
  	    if (chooser2.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) { 
  	    	fileimage = chooser2.getSelectedFile();
  	    }
  	   try {
  		 Pandess.image = ImageIO.read(fileimage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}

}
