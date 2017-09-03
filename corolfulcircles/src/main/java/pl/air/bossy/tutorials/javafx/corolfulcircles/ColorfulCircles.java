package pl.air.bossy.tutorials.javafx.corolfulcircles;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.paint.Color;


public class ColorfulCircles extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		Group root = new Group();
		Scene scene = new Scene(root,800,600,Color.BLACK);
		primaryStage.setScene(scene);
        primaryStage.show();
	}

}
