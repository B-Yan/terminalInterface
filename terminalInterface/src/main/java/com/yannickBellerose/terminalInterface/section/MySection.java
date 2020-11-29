package com.yannickBellerose.terminalInterface.section;

import javafx.collections.ObservableList;
import javafx.scene.layout.HBox;

/**
 * A section contains have a name and a collection of subsection
 * 
 * @author yan
 * @version 1.0.0
 */
public class MySection extends HBox{
	
	String name;
	
	public MySection(String name, MySubsection[] subSections) {
		super();
		
		this.name = name;
		
		ObservableList list = this.getChildren();
		list.addAll(subSections);
	}
	
	public String getName() {
		return this.name;
	}
}