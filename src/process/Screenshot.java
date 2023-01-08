package process;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Cette classe permet l'enregistrement du dessin. 
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class Screenshot {
public Screenshot() {}

	public void takeSnapShot(JPanel panel ){
		
	       BufferedImage bufImage = new BufferedImage(panel.getSize().width, panel.getSize().height,BufferedImage.TYPE_INT_RGB);
	       File file;
	       File finalfile;
	       final JFrame frame = new JFrame();
	       
	       JFileChooser chooser = new JFileChooser(); 
    	    chooser.setDialogTitle("choisir le chemin");
    	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    	    chooser.setAcceptAllFileFilterUsed(false);
    	    if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) { 
    	    	file = chooser.getSelectedFile();
    	    	String path = file.getAbsolutePath();
    	    	String dessin = "\\dessin";
    	    	String finals;
    	    	finals=path+dessin+".png";
    	    	finalfile = new File(finals);  	    	
    	    	boolean exists = true;
        	    // on verifie l'existance d'une image sous le nom de dessin.png
    	    	while(exists) {
    	    		if(finalfile.exists()) { // rajout d'une lettre "n"
    	    			dessin+="n";
    	    			finals=path+dessin+".png";
    	    			finalfile = new File(finals);
    	    		}
    	    		else{
    	    			exists = false;
    	    		}
    	    	}
    	    //sauvegarde de l'image
    	    	panel.paint(bufImage.createGraphics());
    	    	try{
    	    		finalfile.createNewFile();
    	    		ImageIO.write(bufImage, "png", finalfile);
    	    	}catch(Exception ex){
    	    	} 
    	    }
	}
}
