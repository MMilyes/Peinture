package gui;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import data.Trait;
import process.PListener;
import styles.*;

import java.awt.Point;

/**
 * Cette classe qui definit le panel de dessin
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */

public class Pandess extends JPanel {
	

	private static final long serialVersionUID = 1L;
	protected EventListener lis;
	public Boolean clicked;
	public int  x;
	public int y;
	// l'image qui va servire pour l'import
    public static BufferedImage image;
    // Variable qui va determiner le style 
    public static int typestyle;
    // l'intensite (force) du cubisme
    public static int force = 45;


	protected List traits=new ArrayList<>();
	protected Trait curTrait =null;
	// couleur actuelle
	public static Color curColor =Color.black;
	// taille du crayon
	public static int taillecrayon=5;
	
	
	public Pandess() {
		// TODO Auto-generated constructor stub
		lis= new PListener(this);
		addMouseMotionListener((MouseMotionListener)lis);
        addMouseListener((MouseListener)lis);
        // style de depart style simple 
        typestyle = 0 ;
	}
	/**
	 * Change la couleur courante
	 * @param cur
	 */
	public void setcurColor(Color cur){
		this.curColor=cur;
	}
	/**
	 * 
	 * @return la couleur courante
	 */
	public Color getCurColor() {
		return curColor;
	}
	/**
	 * creation et debut d'un trait
	 * @param p
	 */
	public void starttr(Point p) {
		curTrait=new Trait(curColor,taillecrayon);
		curTrait.addpoint(p);
	}
	/**
	 * Ajoute des point pour prolonger le trait
	 * @param p
	 */
	public void addpointTrait(Point p){
		if(curTrait != null) {
			curTrait.addpoint(p);
		}
	}
	/**
	 * termine un Trait et ajoute le trait fin dans l'Arralist de trait
	 * @param p
	 */
	public void finaltr(Point p) {
		if(curTrait != null) {
			curTrait.addpoint(p);
			traits.add(curTrait);
			curTrait=null;
		}
	}
	// on retire le dernier trait de la liste
	public void retour(){
		if(traits.size()!=0) {traits.remove(traits.size()-1);}
	}
	
	public void clear() {
		// on efface la liste
		 traits.clear();
	}
	/**
	 * Change la taille du pinceau
	 * @param t
	 */
	public void setTaillep(int t) {
		taillecrayon=t;
	}
	/**
	 * 
	 * @param c
	 */
	public void setClicked(boolean c) {
		this.clicked=c;
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
			
			if (image != null) {
				Graphics2D g2d = (Graphics2D) g.create();
				g2d.drawImage(image, 0, 0, this);
			}
		// selon la valeur de la varible typestyle, un seul style sera execute  
		if(typestyle==0) {
			Stylesimple s=new Stylesimple();
			s.styleSimple(g2, traits);
			}
		if(typestyle==1) {
			Styleimpressionnisme s=new Styleimpressionnisme();
			s.styleImpressionnisme(g2, traits,this);
			}
		if(typestyle==2) {
			Stylecubisme s=new Stylecubisme();
			s.styleCubisme(g2, traits,force);
			}
			
		}
		
		}

