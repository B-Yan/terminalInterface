package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ButtonText extends MyField {

	String name;
	TextField text;
	
	public ButtonText(String label){
		name = label;
		text = new TextField();
	}
	
	@Override
	public String getCommand() {
		return text.getText();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Node getChild() {
		return text;
	}

}
