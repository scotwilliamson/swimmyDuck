package application;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	private static int Ypos = 300;
	private static int Yspeed = 0;
	private static int[] rectX = { 800, 1000, 1200, 1400, 1600 };
	private static double[] rectHeight = {Math.random() * 400 + 50, Math.random() * 400 + 50, Math.random() * 400 + 50,
			Math.random() * 400 + 50, Math.random() * 400 + 50 };

	@Override
	public void start(Stage primaryStage) {
		Pane gameLayout = new Pane();
		Scene scene = new Scene(gameLayout, 600, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Swimmy Duck");

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
		
		for (int i = 0; i < upperPoles.size(); i++) {
			upperPoles.get(i).setWidth(50);
			upperPoles.get(i).setHeight((int)rectHeight[i]);
			upperPoles.get(i).setFill(Color.FORESTGREEN);
			gameLayout.getChildren().add(upperPoles.get(i));
		}
		
		for(int k = 0; k < lowerPoles.size(); k++){
			lowerPoles.get(k).setWidth(50);
			lowerPoles.get(k).setHeight(600);
			lowerPoles.get(k).setY((int)rectHeight[k] + 100);
			lowerPoles.get(k).setFill(Color.FORESTGREEN);
			gameLayout.getChildren().add(lowerPoles.get(k));
		}

		scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
			if (key.getCode() == KeyCode.SPACE) {
				Yspeed = -15;
			}
		});
		Circle player = new Circle(15, 15, 15, Color.ORANGE);
		player.centerXProperty().bind(gameLayout.widthProperty().divide(3));
		player.setCenterY(Ypos);
		gameLayout.getChildren().add(player);
		new AnimationTimer() {
			public void handle(long currentNanoTime) {
				updatePlayer();
				updateRectangles();
				for (int i = 0; i < upperPoles.size(); i++) {
					upperPoles.get(i).setX(rectX[i]);
					upperPoles.get(i).setHeight(rectHeight[i]);
					lowerPoles.get(i).setX(rectX[i]);
					lowerPoles.get(i).setHeight(600);
					lowerPoles.get(i).setY((int)rectHeight[i] + 100);
				}   
				player.setCenterY(Ypos);
			}
		}.start();
	}

	public static void updatePlayer() {
		Ypos += Yspeed;
		if (Yspeed < 6) {
			Yspeed += 1;
		}
	}

	public static void updateRectangles() {
		for (int i = 0; i < rectX.length; i++) {
			rectX[i] -= 2;
			if (rectX[i] < -200) {
				rectX[i] = 800;
				rectHeight[i] = Math.random() * 450 + 50;
			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
