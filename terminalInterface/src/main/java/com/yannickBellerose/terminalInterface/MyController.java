package com.yannickBellerose.terminalInterface;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MyController {
	MyVBox vbox;
	
	public void setVBox(MyVBox vBox) {
		vbox = vBox;
	}
	
	/*-------------------------FILE*-------------------------*/
	
    @FXML
	public void pwd(ActionEvent event) throws IOException {
    	vbox.exec("pwd");
	}
    @FXML
	public void cd(ActionEvent event) throws IOException {
    	vbox.exec("cd DIRECTORY_NAME");
	}
    @FXML
	public void ls(ActionEvent event) throws IOException {
    	vbox.exec("ls");
	}
    @FXML
	public void cat(ActionEvent event) throws IOException {
    	vbox.exec("cat FILE_NAME");
	}
    @FXML
	public void head(ActionEvent event) throws IOException {
    	vbox.exec("head FILE_NAME");
	}
    @FXML
	public void tail(ActionEvent event) throws IOException {
    	vbox.exec("tail FILE_NAME");
	}
    @FXML
	public void echo(ActionEvent event) throws IOException {
    	vbox.exec("echo 'Your text'");
	}
    @FXML
	public void nano(ActionEvent event) throws IOException {
    	vbox.exec("nano FILE_NAME");
	}
    @FXML
	public void rm(ActionEvent event) throws IOException {
    	vbox.exec("rm FILE_NAME");
	}
    @FXML
	public void cp(ActionEvent event) throws IOException {
    	vbox.exec("mv FILE_NAME COPY_NAME");
    	//TODO
	}
    @FXML
	public void mv(ActionEvent event) throws IOException {
    	vbox.exec("mv FILE_NAME DESTINATION_PATH");
	}
    @FXML
	public void touch(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void mkdir(ActionEvent event) throws IOException {
    	vbox.exec("mkdir DIRECTORY_NAME");
	}
    @FXML
	public void tar(ActionEvent event) throws IOException {
    	vbox.exec("tar -cf ARCHIVE_NAME.tar FILE1 FILE2...");
    	//TODO
	}
    @FXML
	public void gzip(ActionEvent event) throws IOException {
    	vbox.exec("gzip FILE_NAME OR -r DIRECTORY_NAME");
    	//TODO
	}
    @FXML
	public void zip(ActionEvent event) throws IOException {
    	vbox.exec("zip ARCHIVE_NAME.zip FILE1 FILE2...");
    	//TODO
	}
}
