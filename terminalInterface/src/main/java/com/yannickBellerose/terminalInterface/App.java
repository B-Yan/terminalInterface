package com.yannickBellerose.terminalInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.kodedu.terminalfx.TerminalBuilder;
import com.kodedu.terminalfx.TerminalTab;

/**
 * @author yan
 * @version 1.0.0
 */
public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TerminalBuilder terminalBuilder = new TerminalBuilder();
        TerminalTab terminal = terminalBuilder.newTerminal();
        TabPane tabPane = new TabPane();
        tabPane.getTabs().add(terminal);
		
        FXMLLoader loaded = new FXMLLoader(getClass().getResource("/testJavaFX_v2.fxml"));
        Parent topMenu = loaded.load();
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(topMenu, tabPane);
        
		Scene scene = new Scene(vbox, 900, 600);
		primaryStage.setTitle("K.I.S.S.I.T.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public static void main( String[] args )
    {
        launch( args );
    }
}
