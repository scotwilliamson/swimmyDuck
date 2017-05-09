package application;

import java.awt.Rectangle;
import java.util.ArrayList;

public class GameObject extends Main{

	public static void create() {
		Rectangle hitbox = new Rectangle(30,30,Xpos - 15,Ypos - 15);
		
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		Rectangle c = new Rectangle();
		Rectangle d = new Rectangle();
		Rectangle e = new Rectangle();
		
		ArrayList<Rectangle> upperPoles = new ArrayList<Rectangle>();
		upperPoles.add(a);
		upperPoles.add(b);
		upperPoles.add(c);
		upperPoles.add(d);
		upperPoles.add(e);
		
		Rectangle f = new Rectangle();
		Rectangle g = new Rectangle();
		Rectangle h = new Rectangle();
		Rectangle l = new Rectangle();
		Rectangle j = new Rectangle();
		
		ArrayList<Rectangle> lowerPoles = new ArrayList<Rectangle>();
		lowerPoles.add(f);
		lowerPoles.add(g);
		lowerPoles.add(h);
		lowerPoles.add(l);
		lowerPoles.add(j);
	}
}
