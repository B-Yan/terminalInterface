package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.scene.Node;

/**
 * Is used to insert a command between two other buttons without displaying anything
 * 
 * @author yan
 */

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
