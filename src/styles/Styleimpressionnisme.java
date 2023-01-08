package styles;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;

import gui.*;
import data.Trait;
/**
 * Cette classe represente la fonction paint component pour le style impressionnisme
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */

public class Styleimpressionnisme {
	public Styleimpressionnisme() {}
	public void styleImpressionnisme(Graphics2D g2,List traits, Pandess paintzone) {
		int z=0;
		if (traits!=null) {
			Iterator<Trait> it1=traits.iterator();
			while(it1.hasNext()) {
				Trait trait=it1.next();
				if (trait != null) {
					g2.setColor(trait.getcolor());
					Point pre=null;
					List points=trait.getpoints();
					Iterator<Point> it2=points.iterator();
					while(it2.hasNext()) {
						Point cur=(Point) it2.next();
						if (z<10) {
						
							if (pre !=null ) {
								int r=trait.getTaille();
								double e=(Math.sqrt(2)/2)*r;
								int ec=(int)e;
								//g2.setColor(trait.getcolor());
								g2.setStroke(new BasicStroke(trait.getTaille()));
								
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 30));
								g2.drawLine(pre.x,pre.y+r,cur.x,cur.y+r);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 60));
								g2.drawLine(pre.x,pre.y-r,cur.x,cur.y-r);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 90));
								g2.drawLine(pre.x+r,pre.y,cur.x+r,cur.y);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 120));
								g2.drawLine(pre.x-r,pre.y,cur.x-r,cur.y);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 150));
								g2.drawLine(pre.x+ec,pre.y+ec,cur.x+ec,cur.y+ec);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 120));
								g2.drawLine(pre.x+ec,pre.y-ec,cur.x+ec,cur.y-ec);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 90));
								g2.drawLine(pre.x-ec,pre.y+ec,cur.x-ec,cur.y+ec);
								g2.setColor(new Color(trait.getcolor().getRed(), trait.getcolor().getGreen(), trait.getcolor().getBlue(), 60));
								g2.drawLine(pre.x-ec,pre.y-ec,cur.x-ec,cur.y-ec);
								
							}
							pre=cur;
							z++;
						}
						if(z==10) {
							paintzone.setClicked(false);
							Point p=new Point(pre.x,pre.y);
							pre=cur;
							z++;
						}
						if(z>10 && z<15) {
							z++;
							pre=cur;
						}
						if(z==15) {
							Point p=new Point(pre.x,pre.y);
							paintzone.setClicked(true);
							paintzone.starttr(p);
							pre=cur;
							z=0;
						}
					}
				}
			}
		}
	}

}
