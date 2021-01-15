package com.yannickBellerose.terminalInterface;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MyForm extends VBox{

	ArrayList<MyField> button;
	
	MyForm(MyField[] buttons){
		buildMyForm(new ArrayList<MyField>(Arrays.asList(buttons)));
	}
	
	MyForm(ArrayList<MyField> buttons){
		buildMyForm(buttons);
	}
	
	private void buildMyForm(ArrayList<MyField> buttons){
		this.setAlignment(Pos.CENTER);
		this.button = buttons;
        this.getChildren().add(buildGridPane(button));
	}
	
	public String getCommand() {
		String command = "";
		for (int i = 0; i<button.size(); i++) {
			command+=button.get(i).getCommand();
		}
		return command;
	}
	
	private GridPane buildGridPane(ArrayList<MyField> buttons) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        
        for (int i = 0; i<button.size(); i++) {
        		pane.add(new Label(button.get(i).getName()), 0, i);
        		pane.add(button.get(i).getChild(), 1, i);
        }
        
		return pane;
	}
}