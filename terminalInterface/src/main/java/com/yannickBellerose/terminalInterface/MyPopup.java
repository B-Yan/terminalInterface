package com.yannickBellerose.terminalInterface;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MyPopup extends Stage{
	
	boolean writeIt;
	
	MyPopup(String commandName, Pane pane){
		super();
		this.initModality(Modality.APPLICATION_MODAL);
		this.setTitle(commandName);
		writeIt = false;
		
		Button writeButton = new Button("Write");
		writeButton.setOnAction(e -> {
			writeIt = true;
			this.close();
			});
		pane.getChildren().add(writeButton);
		GridPane pan = new GridPane();
        pan.setHgap(5);
        pan.setPadding(new Insets(5, 5, 5, 5));
        pane.getChildren().add(pan);
		
		Scene scene= new Scene(pane);
		this.setScene(scene);
		this.showAndWait();
	}
	
	public boolean getWritten() {
		return writeIt;
	}
}