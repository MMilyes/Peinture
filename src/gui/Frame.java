package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import process.Importfnc;
import process.Screenshot;
import process.SliderCubisme;
import process.SliderTaille;
/**
 * Cette classe sert à regrouper le Panel de dessin avec la boite à outils et ajout un JMenu en haut.
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */

public class Frame extends JFrame implements ActionListener {
	// initialisation des tailles de base
    final int SMALL = 4;
    final int MEDIUM = 8;
    final int LARGE = 10;
    
    private PanelOutils panelOutils;
    public static Pandess drawPanel = new Pandess();
    
    Container con = getContentPane();
    BorderLayout layout = new BorderLayout(10,10);
    
    // instanciation des differents menu 
    JMenuBar mainMenuBar = new JMenuBar();
    JMenu menufich = new JMenu("Fichier");
    JMenu menutaille = new JMenu("Taille");
    JMenu menuoutils = new JMenu("outils");
    JMenu menuinfo = new JMenu("Info");
    JMenu menustyles = new JMenu("Styles");

    ImageIcon eraser;
    ImageIcon retour;
    // instanciation des differents items des menus
    JMenuItem clear = new JMenuItem("Effacer");
    JMenuItem ret = new JMenuItem("Retour");
    JMenuItem exit = new JMenuItem("Quiter");
    JMenuItem small = new JMenuItem("Petit");
    JMenuItem medium = new JMenuItem("Moyen");
    JMenuItem large = new JMenuItem("Large");
    JMenuItem about = new JMenuItem("A propos");
    JMenuItem gomme = new JMenuItem("Gomme");
    JMenuItem Custom = new JMenuItem("personnaliser");
    JMenuItem save = new JMenuItem("Sauvegarder");
    JMenuItem simple = new JMenuItem("Simple");
    JMenuItem impr = new JMenuItem("Impressionisme");
    JMenuItem cub = new JMenuItem("Cubisme");
    JMenuItem importt = new JMenuItem("Importer");



    






    public Frame()
    {
    	JPanel p=new JPanel();
        con.setLayout(layout);
        drawPanel = new Pandess();
        drawPanel.setBackground( Color.WHITE );
        drawPanel.setVisible(true);
        
        setJMenuBar(mainMenuBar);
        mainMenuBar.add(menufich);
        mainMenuBar.add(menutaille);
        mainMenuBar.add(menuoutils);
        mainMenuBar.add(menustyles);
        mainMenuBar.add(menuinfo);
        menufich.add(clear);
        menufich.add(save);
        menufich.add(importt);
        menufich.add(exit);
        menutaille.add(small);
        menutaille.add(medium);
        menutaille.add(large);
        menutaille.add(Custom);
        menustyles.add(simple);
        menustyles.add(impr);
        menustyles.add(cub);
        
        menuinfo.add(about);
        menuoutils.add(gomme);
        menuoutils.add(ret);
        
        eraser = new ImageIcon("src/images/gomme1.png");
        retour = new ImageIcon("src/images/retour.png");
        gomme.setIcon(eraser);
        ret.setIcon(retour);

        exit.addActionListener(this);
        clear.addActionListener(this);
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);
        gomme.addActionListener(this);
        Custom.addActionListener(this);
        save.addActionListener(this);
        importt.addActionListener(this);
        impr.addActionListener(this);
        simple.addActionListener(this);
        cub.addActionListener(this);
        ret.addActionListener(this);
        about.addActionListener(this);

        
        panelOutils=new PanelOutils(drawPanel);
        
        
        //this.add(drawPanel);
        p.setPreferredSize(new Dimension(800,85));
        p.setBackground(Color.gray);
        p.add(panelOutils);
        drawPanel.setPreferredSize(new Dimension(800,600));
        con.add(drawPanel,BorderLayout.CENTER);
        con.add(p,BorderLayout.NORTH);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String arg = e.getActionCommand();
        if(arg.equals("Quiter") )
        {
            System.exit(0);
        }
        if(arg.equals("A propos") )
        {
            JOptionPane.showMessageDialog(null, "GLP-Peinture \n Mohammed ilyes Malki \n Djouhoudi Soilihi \n Yann Rospars");
        }
        if(arg.equals("Effacer"))
        {
           drawPanel.clear();
           Pandess.image=null;
           repaint();
        }
        if(arg.equals("Retour"))
        {
        	drawPanel.retour();
        	repaint();        	
        }
        
        if(arg.equals("Petit"))
        {
            drawPanel.setTaillep(SMALL);
        }
        if(arg.equals("Moyen"))
        {
            drawPanel.setTaillep(MEDIUM);
        }
        if(arg.equals("Large"))
        {
            drawPanel.setTaillep(LARGE);
        }
        if(arg.equals("Gomme"))
        {  
        	Pandess.curColor=Color.WHITE;

        }
        if(arg.equals("personnaliser"))
        {
        	SliderTaille slider = new SliderTaille();
        	
        }
        if(arg.equals("Simple"))
        {
        	Pandess.typestyle=0;
        	repaint();
        	
        }
        if(arg.equals("Impressionisme"))
        {
        	Pandess.typestyle=1;
        	repaint();
        	
        }
        if(arg.equals("Cubisme"))
        {
        	Pandess.typestyle=2;
        	SliderCubisme sli = new SliderCubisme(drawPanel);
        	repaint();

        }
        if(arg.equals("Importer"))
        {
        	Importfnc im = new Importfnc();
			im.imp();
     	   repaint();
     	   
        	
        }
        if(arg.equals("Sauvegarder"))
        {
        	Screenshot scr = new Screenshot();
        	scr.takeSnapShot(drawPanel);
         }
    }
}