package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 * A popup pan who detect if you close it or if you click on the "write" button
 * 
 * @author yan
 */
public class MyPopup extends Stage{
	
	boolean writeIt;
	
	public MyPopup(String commandName, Pane pane){
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
	
	/**
	 * 
	 * @return true if the popup has been closed by clicking on "write" or false otherwise
	 */
	public boolean getWritten() {
		return writeIt;
	}
}