package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.scene.Node;

public class ButtonEmpty extends MyField {

	String name;
	
	public ButtonEmpty(String command) {
		name = command;
	}

	@Override
	public String getCommand() {
		return name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Node getChild() {
		return null;
	}

}
