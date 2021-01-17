package com.yannickBellerose.terminalInterface.MyButtons;

import java.util.ArrayList;
import java.util.Arrays;

import com.yannickBellerose.terminalInterface.MyButtons.MyField;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * A VBox who act as a form who take in buttons and return a command
 * 
 * It automatically populate a gridpane with the array of buttons
 * 
 * @author yan
 */
public class MyForm extends VBox{

	ArrayList<MyField> button;
	
	public MyForm(MyField[] buttons){
		buildMyForm(new ArrayList<MyField>(Arrays.asList(buttons)));
	}
	
	public MyForm(ArrayList<MyField> buttons){
		buildMyForm(buttons);
	}
	
	private void buildMyForm(ArrayList<MyField> buttons){
		this.setAlignment(Pos.CENTER);
		this.button = buttons;
        this.getChildren().add(buildGridPane(button));
	}
	
	/**
	 * 
	 * @return the command to display on the command prompt
	 */
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
        
        int j = 0;
        for (int i = 0; i<button.size(); i++) {
        	if (button.get(i).getChild() != null) {
        		pane.add(new Label(button.get(i).getName()), 0, j);
        		pane.add(button.get(i).getChild(), 1, j);
        		j++;
        	}
        }
        
		return pane;
	}
}