package data;



import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Point;

/**
 * Cette classe définit un trait comme un groupe de points
 * 
 * 
 * @author Mohammed ilyes Malki / Soilihi djouhoudi / Yann Rospars 
 */
public class Trait {
	
	protected List points=new ArrayList<Point>();
	protected Color color =Color.black;
	protected int taille =5;
	
	public Trait() {
		// TODO Auto-generated constructor stub
	}
	
	public Trait(Color color) {
		this.color=color;
	}
	
	public Trait(Color color,int t) {
		this.color=color;
		this.taille=t;
	}
	
	public Color getcolor() {
		return color;
	}
	
	public void addpoint(Point p) {
		if(p!=null) {
			points.add(p);
		}
	}
	
	public List getpoints() {
		return points;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public int getTaille() {
		return taille;
	}
}
