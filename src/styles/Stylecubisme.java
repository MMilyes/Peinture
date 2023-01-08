package styles;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;

import data.Trait;
/**
 * Cette classe represente la fonction paint component pour le cubisme
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class Stylecubisme {
	public Stylecubisme() {}

	public void styleCubisme(Graphics2D g2,List traits,int y) {
		if (traits!=null) {
			int z;
			Iterator<Trait> it1=traits.iterator();
			while(it1.hasNext()) {
				z=y;
				Trait trait=it1.next();
				if (trait != null) {
					g2.setColor(trait.getcolor());
					Point pre=null;
					List points=trait.getpoints();
					Iterator<Point> it2=points.iterator();
					while(it2.hasNext()) {
						Point cur=(Point) it2.next();
						z++;
						if (z>y-1) {
							if (pre !=null ) {
								g2.setColor(trait.getcolor());
								g2.setStroke(new BasicStroke(trait.getTaille()));
								g2.drawLine(pre.x,pre.y,cur.x,cur.y);
							z=0;
							}
							pre=cur;
						}
						
					}
				}
			}
		}
	}
}
