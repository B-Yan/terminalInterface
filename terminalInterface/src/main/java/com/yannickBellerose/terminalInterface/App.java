package com.yannickBellerose.terminalInterface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//On ajoute les elements a root dans new Group(element 1, element 2, etc.)
		Group root = new Group();
		Scene scene = new Scene(root, 600, 300);
		
		primaryStage.setTitle("K.I.S.S.I.T.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public static void main( String[] args )
    {
        launch( args );
    }
}
