package styles;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;

import data.Trait;
/**
 * Cette classe represente la fonction paint component pour le style simple 
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class Stylesimple {
	public Stylesimple() {}
public void styleSimple(Graphics2D g2,List traits) {
		
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
							if (pre !=null ) {
								g2.setColor(trait.getcolor());
								g2.setStroke(new BasicStroke(trait.getTaille()));
								g2.drawLine(pre.x,pre.y,cur.x,cur.y);
							}
							pre=cur;
						
					}
				}
			}
		}
	}

}
