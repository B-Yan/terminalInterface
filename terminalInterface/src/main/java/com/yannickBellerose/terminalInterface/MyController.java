package com.yannickBellerose.terminalInterface;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MyController {
	MyVBox vbox;
	
	public void setVBox(MyVBox vBox) {
		vbox = vBox;
	}
	
    @FXML
	public void current(ActionEvent event) throws IOException {
    	vbox.exec("test");
	}
}
