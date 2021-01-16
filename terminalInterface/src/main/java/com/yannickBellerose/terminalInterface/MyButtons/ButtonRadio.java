package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class ButtonRadio extends MyField{
	
	GridPane pane;
	String label;
	String[] commandList;
	
	public ButtonRadio(String name, String[] optionName, String[] command){
		label = name;
		commandList = command;
		
		pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(5, 5, 5, 5));
		
		ToggleGroup gp = new ToggleGroup();
		for (int i=0; i<optionName.length && optionName.length == command.length; i++) {
			RadioButton rb = new RadioButton(optionName[i]);
			rb.setToggleGroup(gp);
			pane.add(rb,0,i);
		}
		((ToggleButton) pane.getChildren().get(0)).setSelected(true);

	}
	
	@Override
	public String getCommand() {
		String command = "";
		for (int i=0; i<pane.getChildren().size() && command == ""; i++) {
			if (((ToggleButton) pane.getChildren().get(i)).isSelected()) {
				command = commandList[i];
			}
		}
		return command;
	}

	@Override
	public String getName() {
		return label;
	}

	@Override
	public Node getChild() {
		return pane;
	}

}
