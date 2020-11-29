package com.yannickBellerose.terminalInterface.section;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * A subsection contains a name and a collection of buttons
 * 
 * @author yan
 * @version 1.0.0
 */
public class MySubsection extends VBox{
	
	String name;
	
	public MySubsection(String name, Button[] buttons) {
		super();
		
		this.name = name;
		
		Text title = new Text(name);
		TilePane pane = new TilePane();
		
		ObservableList tileList = pane.getChildren();
		tileList.addAll(buttons);
		
		ObservableList list = this.getChildren();
		list.addAll(pane, title);
	}
	
}
