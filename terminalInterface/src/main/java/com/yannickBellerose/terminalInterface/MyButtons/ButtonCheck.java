package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;

public class ButtonCheck extends MyField {
	
	String label;
	String command;
	CheckBox cb;
	
	public ButtonCheck(String label, String command){
		this.label = label;
		this.command = command;
		this.cb = new CheckBox();
	}

	@Override
	public String getCommand() {
		return cb.isSelected() ? command : "";
	}

	@Override
	public String getName() {
		return label;
	}

	@Override
	public Node getChild() {
		return cb;
	}

}
