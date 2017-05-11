package application;

import java.awt.Rectangle;
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class GameObject extends Main{

	private static Rectangle a = new Rectangle();
	private static Rectangle b = new Rectangle();
	private static Rectangle c = new Rectangle();
	private static Rectangle d = new Rectangle();
	private static Rectangle e = new Rectangle();
	private static Rectangle f = new Rectangle();
	private static Rectangle g = new Rectangle();
	private static Rectangle h = new Rectangle();
	private static Rectangle i = new Rectangle();
	private static Rectangle j = new Rectangle();
	private static ArrayList<Rectangle> upperPoles = new ArrayList<Rectangle>();
	private static ArrayList<Rectangle> lowerPoles = new ArrayList<Rectangle>();
	private static Rectangle hitbox = new Rectangle(30,30,Xpos - 15,Ypos - 15);
	public static void create() {
		upperPoles.add(a);
		upperPoles.add(b);
		upperPoles.add(c);
		upperPoles.add(d);
		upperPoles.add(e);
		lowerPoles.add(f);
		lowerPoles.add(g);
		lowerPoles.add(h);
		lowerPoles.add(i);
		lowerPoles.add(j);
		for (int i = 0; i < upperPoles.size(); i++) {
			upperPoles.get(i).setSize(50, (int) rectHeight[i]);
			lowerPoles.get(i).setSize(50, 600);
		}
	}
	public static void logicUpdate(){
		for(int i = 0; i < upperPoles.size(); i++){
			upperPoles.get(i).setLocation(rectX[i],0);
			upperPoles.get(i).setSize(50, (int) rectHeight[i]);
			lowerPoles.get(i).setSize(50, 600);
			lowerPoles.get(i).setLocation(rectX[i], (int)rectHeight[i] + 125);
			if(hitbox.intersects(upperPoles.get(i))|| hitbox.intersects(lowerPoles.get(i))) {
				isAlive = false;
				System.out.println("The Player Has Died");
			}
		}
		hitbox.setLocation(Xpos - 15, Ypos - 15);
	}
}