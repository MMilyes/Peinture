package gui;

import javax.swing.border.Border;

import process.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * Cette classe represente la boite à outils
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class PanelOutils  extends JPanel implements ActionListener{
	private Pandess paneldessin;
	
	private JPanel colorChooser1;
	private JPanel outils;
	private JPanel style;
	private JPanel curentColor;
	
	
	private JButton colorcustom;
	private JButton sauve;
	private JButton importer;
	private JButton effacer;
	private JButton gomme;
	private JButton retour;
	private JButton size;
	private JButton cub;
	private JButton imp;
	private JButton simpl;

	private BorderLayout layout = new BorderLayout(5,0);
	
	private int alpha=255;
		
	JButton j1=new JButton("");//Blanc
	JButton j2=new JButton("");//Noir
	JButton j3=new JButton("");//Rouge
	JButton j4=new JButton("");//Bleu
	JButton j5=new JButton("");//Vert
	JButton j6=new JButton("");//Jaune
	JButton j7=new JButton("");//Orange
	JButton j8=new JButton("");//Violet
	JButton j9=new JButton("");//Rose
	JButton j10=new JButton("");//Rouge foncé
	JButton j11=new JButton("");//Bleu foncé
	JButton j12=new JButton("");//Vert foncé
	JButton j13=new JButton("");//Cyan
	JButton j14=new JButton("");//Marron
	JButton j15=new JButton("");//Gris
	JButton j16=new JButton("");//Gris foncé
	JButton j17=new JButton("");//Beige
	JButton j18=new JButton("");//Khaki
	JButton j19=new JButton("");//
	JButton j20=new JButton("");//
	
	Color c1 =new Color(255, 255, 255,alpha);
	Color c2 =new Color(0,0,0,alpha);
	Color c3 =new Color(255, 0, 0,alpha);
	Color c4 =new Color(0, 0, 255,alpha);
	Color c5 =new Color(0, 128, 0,alpha);
	Color c6 =new Color(255, 255, 0,alpha);
	Color c7 =new Color(255, 165, 0,alpha);
	Color c8 =new Color(238, 130, 238,alpha);
	Color c9 =new Color(255, 192, 203,alpha);
	Color c10 =new Color(139, 0, 0,alpha);
	Color c11 =new Color(0, 0, 139,alpha);
	Color c12 =new Color(0, 100, 0,alpha);
	Color c13 =new Color(0, 255, 255,alpha);
	Color c14 =new Color(128, 0, 0,alpha);
	Color c15 =new Color(211, 211, 211,alpha);
	Color c16 =new Color(169, 169, 169,alpha);
	Color c17 =new Color(245, 245, 220,alpha);
	Color c18 =new Color(240, 230, 140,alpha);
	
	Color curColor=new Color(0,0,0,alpha);;
	
	
	public PanelOutils(Pandess p) {
		// TODO Auto-generated constructor stub
		this.paneldessin=p;
		
		colorChooser1=new JPanel();
		style=new JPanel();
		outils=new JPanel();
		
		colorChooser1.setLayout(new GridLayout(3,6));
		colorChooser1.add(j1);
		colorChooser1.add(j2);
		colorChooser1.add(j3);
		colorChooser1.add(j4);
		colorChooser1.add(j5);
		colorChooser1.add(j6);
		colorChooser1.add(j7);
		colorChooser1.add(j8);
		colorChooser1.add(j9);
		colorChooser1.add(j10);
		colorChooser1.add(j11);
		colorChooser1.add(j12);
		colorChooser1.add(j13);
		colorChooser1.add(j14);
		colorChooser1.add(j15);
		colorChooser1.add(j16);
		colorChooser1.add(j17);
		colorChooser1.add(j18);
			
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		j6.addActionListener(this);
		j7.addActionListener(this);
		j8.addActionListener(this);
		j9.addActionListener(this);
		j10.addActionListener(this);
		j11.addActionListener(this);
		j12.addActionListener(this);
		j13.addActionListener(this);
		j14.addActionListener(this);
		j15.addActionListener(this);
		j16.addActionListener(this);
		j17.addActionListener(this);
		j18.addActionListener(this);
		
		j1.setBackground(c1);
		j2.setBackground(c2);
		j3.setBackground(c3);
		j4.setBackground(c4);
		j5.setBackground(c5);
		j6.setBackground(c6);
		j7.setBackground(c7);
		j8.setBackground(c8);
		j9.setBackground(c9);
		j10.setBackground(c10);
		j11.setBackground(c11);
		j12.setBackground(c12);
		j13.setBackground(c13);
		j14.setBackground(c14);
		j15.setBackground(c15);
		j16.setBackground(c16);
		j17.setBackground(c17);
		j18.setBackground(c18);
		colorChooser1.setPreferredSize(new Dimension(160,80));

		
		colorcustom=new JButton();
		sauve=new JButton();
		importer=new JButton();
		effacer=new JButton();
		gomme=new JButton();
		retour=new JButton();
		size=new JButton();
		cub=new JButton();
		imp=new JButton();
		simpl=new JButton();
		
		colorcustom.setPreferredSize(new Dimension(70,70));
		sauve.setPreferredSize(new Dimension(70,70));
		importer.setPreferredSize(new Dimension(70,70));
		effacer.setPreferredSize(new Dimension(70,70));
		gomme.setPreferredSize(new Dimension(70,70));
		retour.setPreferredSize(new Dimension(70,70));
		size.setPreferredSize(new Dimension(70,70));
		cub.setPreferredSize(new Dimension(70,70));
		imp.setPreferredSize(new Dimension(70,70));
		simpl.setPreferredSize(new Dimension(70,70));
		
		

		//outils.setLayout(new GridLayout(3,6));
		
		outils.add(sauve);
		outils.add(importer);
		outils.add(gomme);
		outils.add(effacer);
		outils.add(retour);
		outils.add(size);
		outils.add(colorcustom);
		outils.setPreferredSize(new Dimension(550,70));
		
		style.add(simpl);
		style.add(cub);
		style.add(imp);
		

		
		try {
		    Image img = ImageIO.read(getClass().getResource("/images/cercle-chrom.png"));
		    colorcustom.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/cub.png"));
			cub.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/imp.png"));
			imp.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/cray.jpg"));
			simpl.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/gommee.png"));
			gomme.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/importer.png"));
			importer.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/sauvegarder.png"));
			sauve.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/poubelle.png"));
			effacer.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/retour2.png"));
			retour.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource("/images/taille2.png"));
			size.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		
		colorcustom.addActionListener(this);
		importer.addActionListener(this);
		effacer.addActionListener(this);
		gomme.addActionListener(this);
		sauve.addActionListener(this);
		retour.addActionListener(this);
		size.addActionListener(this);
		cub.addActionListener(this);
		imp.addActionListener(this);
		simpl.addActionListener(this);
		
				
		//créer une bordure de trait noir et largeur minimale 1
		Border lineborder = BorderFactory.createLineBorder(Color.black, 1);
		curentColor=new JPanel();
		curentColor.setPreferredSize(new Dimension(70,70));
		curentColor.setBackground(curColor);
		curentColor.setBorder(lineborder);
		
		
		
		setLayout(layout);
		add(right(),BorderLayout.EAST);
		add(outils,BorderLayout.WEST);
		add(curentColor,BorderLayout.CENTER);
	}
	
	public JPanel right() {
		JPanel sswp = new JPanel();
		sswp.setLayout(new BorderLayout());
		sswp.add(colorChooser1, BorderLayout.WEST);
		sswp.add(style,BorderLayout.CENTER);
		return sswp;
	}
	public Color getcurColor() {
		return curColor;
	}
	
	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object  arg=e.getSource();
		if(arg.equals(colorcustom))
        {
			JColorChooser colorchooser = new JColorChooser();
        	Color c = JColorChooser.showDialog(null, "choisissez une couleur", Color.black);
        	curColor=c;
        	curentColor.setBackground(curColor);
        	paneldessin.setcurColor(curColor);
        }
		if(arg.equals(sauve))
		{
			Screenshot scr = new Screenshot();
        	scr.takeSnapShot(paneldessin);
		}
		if(arg.equals(gomme))
		{
			paneldessin.setcurColor(Color.WHITE);
			curentColor.setBackground(Color.WHITE);
		}
		if(arg.equals(imp))
		{
			Pandess.typestyle=1;
        	paneldessin.repaint();
		}
		if(arg.equals(simpl))
		{
			Pandess.typestyle=0;
        	paneldessin.repaint();
		}
		if(arg.equals(cub))
		{
			Pandess.typestyle=2;
			SliderCubisme sli = new SliderCubisme(paneldessin);
        	paneldessin.repaint();
		}
		if(arg.equals(effacer))
		{
			paneldessin.clear();
	           Pandess.image=null;
	           paneldessin.repaint();
		}
		if(arg.equals(importer))
		{
			Importfnc im = new Importfnc();
			im.imp();
	     	paneldessin.repaint();
	     	   
		}
		if(arg.equals(retour))
        {
			paneldessin.retour();
			paneldessin.repaint();
        }
		if(arg.equals(size))
        {
			SliderTaille slider = new SliderTaille();
        }
		if(arg.equals(j1) )
        {
            curColor=c1;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j2) )
        {
        	curColor=c2;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j3))
        {
        	curColor=c3;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j4))
        {
        	curColor=c4;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j5))
        {
        	curColor=c5;   
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j6))
        {
        	curColor=c6;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j7))
        {
        	curColor=c7;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j8))
        {
        	curColor=c8;   
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j9))
        {
        	curColor=c9;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j10))
        {
        	curColor=c10;  
            curentColor.setBackground(curColor); 
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j12))
        {
        	curColor=c12;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j11))
        { 
        	curColor=c11;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j13))
        {
        	curColor=c13;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j14)) {
        	curColor=c14;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j15)) {
        	curColor=c15;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j16)) {
        	curColor=c16;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j17)) {
        	curColor=c17;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        if(arg.equals(j18)) {
        	curColor=c18;
            curentColor.setBackground(curColor);
            paneldessin.setcurColor(curColor);
        }
        
	}

}
