package application;

import javafx.geometry.Point2D;
import javafx.scene.Node;

public class GameObject {

	private Node view;
	private Point2D speed = new Point2D(0, 0);
	private boolean alive = true;

	public void update() {
		view.setTranslateX(view.getTranslateX() + speed.getX());
		view.setTranslateY(view.getTranslateY() + speed.getY());
	}
	public GameObject(Node view) {
		this.view = view;
	}
	public boolean isAlive() {
		return alive;
	}
	public double getRotate() {
		return view.getRotate();
	}

	public void rotateUp() {
		view.setRotate(45);
	}

	public void rotateDown() {
		view.setRotate(view.getRotate() + 5);
	}

}
