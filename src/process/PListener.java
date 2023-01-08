package process;



import java.awt.Color;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventListener;

import gui.*;
import gui.Pandess;

import java.awt.Point;

import java.awt.*;
/**
 * Cette classe va nous permettre de récuperer tout les points qui composent un Trait et de l'enregistrer par la suite dans une Arraylist de Trait
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class PListener implements MouseListener,MouseMotionListener, EventListener{
	
	protected Pandess paintzone;
	
	/**
	 * 
	 * @param p Panel de la zone de dessin
	 */
	public PListener(Pandess p) {
		// TODO Auto-generated constructor stub
		this.paintzone=p;
	}

	@Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        Point p=e.getPoint();
        if(paintzone.clicked) {
            paintzone.addpointTrait(p);
            Graphics g=paintzone.getGraphics();
            Graphics2D g2=(Graphics2D) g;
            g2.setColor(paintzone.getCurColor());
            g2.setStroke(new BasicStroke(Pandess.taillecrayon));
            g2.drawLine(paintzone.x,paintzone.y,p.x,p.y);
            paintzone.x=p.x;
            paintzone.y=p.y;

        }
    }

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p=e.getPoint();
		paintzone.clicked=true;
		paintzone.starttr(p);
		paintzone.x=p.x;
		paintzone.y=p.y;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		paintzone.clicked=false;
		paintzone.finaltr(e.getPoint());
		paintzone.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
