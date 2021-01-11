package com.yannickBellerose.terminalInterface;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MyController {
	MyVBox vbox;
	
	final String advanced = "IS AN ADVANCED COMMAND AND HAVENT BEEN IMPLEMENTED - THERE ARE ALOT OF GREAT TUTORIAL FOR THIS COMMAND ONLINE";
	
	public void setVBox(MyVBox vBox) {
		vbox = vBox;
	}
	
	/*-------------------------FILE-------------------------*/
	
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
	}
    @FXML
	public void gzip(ActionEvent event) throws IOException {
    	vbox.exec("gzip FILE_NAME OR -r DIRECTORY_NAME");
	}
    @FXML
	public void zip(ActionEvent event) throws IOException {
    	vbox.exec("zip ARCHIVE_NAME.zip FILE1 FILE2...");
	}
    
	/*-------------------------SEARCH-------------------------*/
    
    @FXML
	public void find
    (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void grep
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void sed
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void sort
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void history(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    
	/*-------------------------NETWORK-------------------------*/
    
	@FXML
	public void ssh
    (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void scp
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void wget
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void ping
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void whois
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void ifconfig
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void ethtool
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void dig(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    
	/*-------------------------ADMINISTRATION-------------------------*/
    
	@FXML
	public void chmod
    (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void chown
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void sudo
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void adduser
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void passwd
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void userdel
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void usermod
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void id
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void apt
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void make
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void git
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void ps
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void top
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void kill
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void mount
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void free
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void date(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    
	/*-------------------------AUTOMATION-------------------------*/
    
	@FXML
	public void execute
    (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void echoTemplate //echo 'template'> newScript && nano newScript
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void crontab
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void writeTo
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void appendTo
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void pipeTo
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void sequenceTo
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void alias
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void aliasAdd(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    
	/*-------------------------VIEW-------------------------*/

    @FXML
	public void clear (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    
	/*-------------------------HELP-------------------------*/
    
    @FXML
	public void man
    (ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void tutorial
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void feedback
	(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void donate(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void license(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
    @FXML
	public void about(ActionEvent event) throws IOException {
    	vbox.exec("touch FILE_NAME");
	}
}
