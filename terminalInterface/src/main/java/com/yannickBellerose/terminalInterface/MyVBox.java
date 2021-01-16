package com.yannickBellerose.terminalInterface;

import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;

import com.kodedu.terminalfx.TerminalBuilder;
import com.kodedu.terminalfx.TerminalTab;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyVBox {
	MyController controller;
	TabPane thatTab;
	Stage stage;

	MyVBox(Stage myStage) {
		super();
		stage = myStage;
	}

	public VBox getVBox() throws IOException {
		TerminalBuilder terminalBuilder = new TerminalBuilder();
		TerminalTab term = terminalBuilder.newTerminal();
		
		TabPane tabPane = new TabPane();
		tabPane.setSide(Side.BOTTOM);
		tabPane.getTabs().addAll(term);
		tabPane.setMinHeight(450);
		thatTab = tabPane;

		FXMLLoader loaded = new FXMLLoader(getClass().getResource("/testJavaFX_v2.fxml"));
		Parent topMenu = loaded.load();
		controller = loaded.getController();

		VBox vbox = new VBox();

		vbox.getChildren().addAll(topMenu, tabPane);

		vbox.heightProperty().addListener(e -> {
			tabPane.setMinHeight(vbox.getHeight() - 150);
		});
		
		term.onTerminalFxReady(() -> {
			if(SystemUtils.IS_OS_WINDOWS) {
				term.getTerminal().command("ssh USER_NAME@IP_ADRESS");
			} else {
				term.getTerminal().command("cd ~ && clear\n");
			}
		});
		return vbox;
	}

	public MyController getController() {
		return controller;
	}

	public void exec(String command) {
		TerminalTab currentTab = (TerminalTab) thatTab.getSelectionModel().getSelectedItem();
		currentTab.getTerminal().command(command);
	}
	
}
