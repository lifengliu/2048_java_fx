package com.xer.fx2048;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application 
{
    public static void main( String[] args )
    {
		launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label hello=new Label("Hello world");
		Pane pane=new Pane();
		pane.getChildren().add(hello);
		Scene scene=new Scene(pane,300,300);
		primaryStage.setTitle("2048 in java FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
