package com.yannickBellerose.terminalInterface;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * An application used to add an excel like interface to the linux command line
 * tool
 * 
 * @author yan
 * @version 1.0.0
 */
public class App extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		MyVBox vbox = new MyVBox(primaryStage);
		
		Scene scene = new Scene(vbox.getVBox(), 900, 600);
		
		MyController controller = vbox.getController();
		controller.setVBox(vbox);

		primaryStage.setTitle("K.I.S.S.I.T.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void stop() {
		Platform.exit();
		System.exit(0);
	}
}