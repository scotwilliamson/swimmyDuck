package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Main extends Application {
	private static int Ypos = 300;
	private static int Yspeed = 0;

	@Override
	public void start(Stage primaryStage) {
		Pane gameLayout = new Pane();
		Scene scene = new Scene(gameLayout, 600, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Swimmy Duck");

		Circle player = new Circle(15, 15, 15, Color.ORANGE);
		player.centerXProperty().bind(gameLayout.widthProperty().divide(3));
		player.setCenterY(Ypos);
		gameLayout.getChildren().add(player);
		new AnimationTimer() {
			public void handle(long currentNanoTime) {
				updateValues();
				player.setCenterY(Ypos);
			}
		}.start();
	}

	public static void updateValues() {
			Ypos += Yspeed;
			if(Yspeed < 6){
				Yspeed += 1;
			}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
