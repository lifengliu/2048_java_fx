package com.xer.fx2048;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

/**
 * 2048 based on java-fx
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
		GamePane pane=new GamePane();
		pane.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.K)
				pane.slideUp();
			else if(e.getCode()==KeyCode.L)
				pane.slideRight();
			else if(e.getCode()==KeyCode.J)
				pane.slideDown();
			else if(e.getCode()==KeyCode.H)
				pane.slideLeft();
		});
		Scene scene=new Scene(pane,300,300);
		primaryStage.setTitle("2048 in java FX");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.requestFocus();
	}
}
