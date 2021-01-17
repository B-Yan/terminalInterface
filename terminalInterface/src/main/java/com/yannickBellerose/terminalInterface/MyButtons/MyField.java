package com.yannickBellerose.terminalInterface.MyButtons;

import javafx.scene.Node;

/**
 * Command needed to create simple button for use in MyForm
 * 
 * @author yan
 */

public abstract class MyField{
	
	/**
	 * 
	 * @return the command to display on the command prompt
	 */
	abstract public String getCommand();
	
	/**
	 * 
	 * @return the name to put on the label of the button in the form
	 */
	abstract public String getName();
	
	/**
	 * 
	 * @return the node to display as the button the form
	 */
	abstract public Node getChild();
}
