package com.yannickBellerose.terminalInterface;

import java.io.IOException;

import com.kodedu.terminalfx.TerminalBuilder;
import com.kodedu.terminalfx.TerminalTab;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

public class MyVBox{
	MyController controller;
	TerminalTab terminal;
	
	public VBox getVBox() throws IOException{
		TerminalBuilder terminalBuilder = new TerminalBuilder();
        TerminalTab term = terminalBuilder.newTerminal();
        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.BOTTOM);
        tabPane.getTabs().add(term);
        tabPane.setMinHeight(450);
        terminal = term;
        
        FXMLLoader loaded = new FXMLLoader(getClass().getResource("/testJavaFX_v2.fxml"));
        Parent topMenu = loaded.load();
        controller = loaded.getController();
        
        VBox vbox = new VBox();
        
        vbox.getChildren().addAll(topMenu,tabPane);
        
        vbox.heightProperty().addListener(e ->{
        	tabPane.setMinHeight(vbox.getHeight()-150);
        });
        return vbox;
	}
	
	public MyController getController() {
		return controller;
	}
	
	public void exec(String command) {
		terminal.getTerminal().command(command);
	}
}
