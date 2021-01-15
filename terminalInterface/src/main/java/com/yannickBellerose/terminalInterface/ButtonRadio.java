package com.yannickBellerose.terminalInterface;

import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class ButtonRadio extends MyField{
	
	VBox vbox;
	String label;
	String[] commandList;
	
	ButtonRadio(String name, String[] optionName, String[] command){
		vbox = new VBox();
		label = name;
		commandList = command;
		
		ToggleGroup gp = new ToggleGroup();
		for (int i=0; i<optionName.length && optionName.length == command.length; i++) {
			RadioButton rb = new RadioButton(optionName[i]);
			rb.setToggleGroup(gp);
			vbox.getChildren().add(rb);
		}
		((ToggleButton) vbox.getChildren().get(0)).setSelected(true);

	}
	
	@Override
	public String getCommand() {
		String command = "";
		for (int i=0; i<vbox.getChildren().size() && command == ""; i++) {
			if (((ToggleButton) vbox.getChildren().get(i)).isSelected()) {
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
		return vbox;
	}

}
