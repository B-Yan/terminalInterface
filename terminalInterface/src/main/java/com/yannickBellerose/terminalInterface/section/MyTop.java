package com.yannickBellerose.terminalInterface.section;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * An excel like menu bar.
 * 
 * There is two section to the menu:
 * 	-The menu bar is always shown and allow navigation between the section
 * 	-The section are shown one at a time
 * 
 * The section are divided by subSection that contains the functions
 * 
 * @author yan
 * @version 1.0.0
 */
public class MyTop extends VBox{
	
	HBox menu = new HBox();
	MySection[] sections;
	ArrayList<Button> buttons;
	
	public MyTop(MySection[] sections) {
		super();
		
		this.sections = sections;

		 this.buttons = new ArrayList<Button>();
				
		for (int i = 0; i<sections.length ; i++) {
			this.buttons.add(new Button(sections[i].getName()));
			final int a = this.buttons.size()-1; 
			this.buttons.get(a).setOnMouseClicked((new EventHandler<MouseEvent>() { 
		         public void handle(MouseEvent event) { 
		            changeMenu(a); 
		         } 
		      }));
		}
		
		
		ObservableList menuList = menu.getChildren();
		menuList.addAll(buttons);
		
		
		ObservableList list = this.getChildren();
		list.addAll(menu);
		list.addAll(sections[0]); //TODO AFFICHER SECTION ACTUELLE
	}
	
	public void changeMenu(int button) {
		ObservableList list = this.getChildren();
		list.clear();
		list.addAll(menu);
		list.addAll(sections[button]); //TODO AFFICHER SECTION ACTUELLE
	}

}