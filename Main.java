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
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane gameLayout = new Pane();
			Scene scene = new Scene(gameLayout,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Swimmy Duck");
						
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		new AnimationTimer()
		{
			public void handle(long currentNanoTime)
			{
				update();
			}
		}.start();
	}
	
	private static class Player extends GameObject {
		Player(){
			super(new Circle(15, 15, 15, Color.ORANGE));
		}
	}
	
	public static void update(){
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
