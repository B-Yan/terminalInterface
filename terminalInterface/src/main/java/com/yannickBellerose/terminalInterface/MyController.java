package com.yannickBellerose.terminalInterface;

//TODO replace all advanced by a full menu (ssh first)
//TODO replace all /or/ by a small generic menu (vbox.execChoice("description 1", "command 1", "description 2", "command 2");)

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MyController {
	MyVBox vbox;
	
	final String preAdvanced = "echo '";
	final String advanced = " IS AN ADVANCED COMMAND AND HAVENT BEEN IMPLEMENTED YET- THERE ARE ALOT OF GREAT TUTORIAL FOR THIS COMMAND ONLINE'\n";
	
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
    	vbox.exec("rm FILE_NAME /OR/ rm -r DIRECTORY_NAME");
	}
    @FXML
	public void cp(ActionEvent event) throws IOException {
    	vbox.exec("cp FILE_NAME COPY_NAME");
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
    	vbox.exec("gzip FILE_NAME /OR/ gzip -r DIRECTORY_NAME");
	}
    @FXML
	public void zip(ActionEvent event) throws IOException {
    	vbox.exec("zip ARCHIVE_NAME.zip FILE1 FILE2...");
	}
    
	/*-------------------------SEARCH-------------------------*/
    
    @FXML
	public void find(ActionEvent event) throws IOException {
    	vbox.exec("find FILE_NAME");
	}
    @FXML
	public void grep(ActionEvent event) throws IOException {
    	vbox.exec("grep -r -i WORD_SEARCHED DIRECTORY_TO_SEARCH_IN");
	}
    @FXML
	public void sed(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"sed"+advanced);
	}
    @FXML
	public void sort(ActionEvent event) throws IOException {
    	vbox.exec("sort FILENAME");
	}
    @FXML
	public void history(ActionEvent event) throws IOException {
    	vbox.exec("history");
	}
    
	/*-------------------------NETWORK-------------------------*/
    
	@FXML
	public void ssh(ActionEvent event) throws IOException {
    	vbox.exec("ssh USERNAME@HOST/IP_ADRESSE");
	}
    @FXML
	public void scp(ActionEvent event) throws IOException {
    	vbox.exec("scp USERNAME@HOST/IP_ADRESSE:PATH_TO_FILE USERNAME@HOST/IP_ADRESSE:PATH_WHERE_TO_COPY_FILE");
	}
    @FXML
	public void wget(ActionEvent event) throws IOException {
    	vbox.exec("wget FILE_URL");
	}
    @FXML
	public void ping(ActionEvent event) throws IOException {
    	vbox.exec("ping -c 4 URL");
	}
    @FXML
	public void whois(ActionEvent event) throws IOException {
    	vbox.exec("whois URL");
	}
    @FXML
	public void ifconfig(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"ip"+advanced);
	}
    @FXML
	public void ethtool(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"ethtool"+advanced);
	}
    @FXML
	public void dig(ActionEvent event) throws IOException {
    	vbox.exec("dig URL");
	}
    
	/*-------------------------ADMINISTRATION-------------------------*/
    
	@FXML
	public void chmod(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"chmod"+advanced);
	}
    @FXML
	public void chown(ActionEvent event) throws IOException {
    	vbox.exec("chown NEW_OWNER FILE_NAME");
	}
    @FXML
	public void sudo(ActionEvent event) throws IOException {
    	vbox.exec("sudo COMMAND");
	}
    @FXML
	public void adduser(ActionEvent event) throws IOException {
    	vbox.exec("adduser USER_NAME");
	}
    @FXML
	public void passwd(ActionEvent event) throws IOException {
    	vbox.exec("passwd");
	}
    @FXML
	public void userdel(ActionEvent event) throws IOException {
    	vbox.exec("deluser USER_NAME");
	}
    @FXML
	public void usermod(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"usermod"+advanced);
	}
    @FXML
	public void id(ActionEvent event) throws IOException {
    	vbox.exec("id USER_NAME");
	}
    @FXML
	public void apt(ActionEvent event) throws IOException {
    	vbox.exec("apt install APPLICATION_NAME");
	}
    @FXML
	public void make(ActionEvent event) throws IOException {
    	vbox.exec("make");
	}
    @FXML
	public void git(ActionEvent event) throws IOException {
    	vbox.exec(preAdvanced+"git"+advanced);
	}
    @FXML
	public void ps(ActionEvent event) throws IOException {
    	vbox.exec("ps -e");
	}
    @FXML
	public void top(ActionEvent event) throws IOException {
    	vbox.exec("top");
	}
    @FXML
	public void kill(ActionEvent event) throws IOException {
    	vbox.exec("kill PROCESS_ID");
	}
    @FXML
	public void mount(ActionEvent event) throws IOException {
    	vbox.exec("mount FILE_PATH");
	}
    @FXML
	public void free(ActionEvent event) throws IOException {
    	vbox.exec("free");
	}
    @FXML
	public void date(ActionEvent event) throws IOException {
    	vbox.exec("date");
	}
    
	/*-------------------------AUTOMATION-------------------------*/
    
	@FXML
	public void execute(ActionEvent event) throws IOException {
    	vbox.exec("./FILE_NAME");
	}
    @FXML
	public void echoTemplate(ActionEvent event) throws IOException {
    	vbox.exec("echo '"
    			+ "#!/bin/bash\n" + 
    			"################################################################################\n" + 
    			"#                        Comment your template here                            #\n" + 
    			"# Author:                                                                      #\n" +
    			"# Date:                                                                        #\n" +
    			"# Purpose:                                                                     #\n" +
    			"# Argument:                                                                    #\n" +
    			"# Return value:                                                                #\n" +
    			"################################################################################\n" + 
    			"\n" + 
    			"echo \"hello world!\"'"
    			+ ">> newScript.sh && nano newScript.sh\n");
	}
    @FXML
	public void crontab(ActionEvent event) throws IOException {
    	vbox.exec("");
	}
    @FXML
	public void writeTo(ActionEvent event) throws IOException {
    	vbox.exec("COMMAND > FILE_NAME");
	}
    @FXML
	public void appendTo(ActionEvent event) throws IOException {
    	vbox.exec("COMMAND >> FILE_NAME");
	}
    @FXML
	public void pipeTo(ActionEvent event) throws IOException {
    	vbox.exec("COMMAND1 | COMMAND2");
	}
    @FXML
	public void sequenceTo(ActionEvent event) throws IOException {
    	vbox.exec("COMMAND1 && COMMAND2");
	}
    @FXML
	public void alias(ActionEvent event) throws IOException {
    	vbox.exec("alias");
	}
    @FXML
	public void aliasAdd(ActionEvent event) throws IOException {
    	vbox.exec("echo 'alias YOUR_SHORTCUT=\"PATH_TO_YOUR_SCRIPT\"' >> ~/.bash_aliases");
	}
    
	/*-------------------------VIEW-------------------------*/

    @FXML
	public void clear (ActionEvent event) throws IOException {
    	vbox.exec("clear\n");
	}
    
	/*-------------------------HELP-------------------------*/
    
    @FXML
	public void man(ActionEvent event) throws IOException {
    	vbox.exec("man COMMAND");
	}
    @FXML
	public void tutorial(ActionEvent event) throws IOException {
    	vbox.exec("sensible-browser https://duckduckgo.com/?t=lm&q=linux+command+line+tutorial&ia=web\n");
	}
    @FXML
	public void feedback(ActionEvent event) throws IOException {
    	vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface/issues\n");
	}
    @FXML
	public void donate(ActionEvent event) throws IOException {
    	vbox.exec("echo 'Thank you for you interest! Please go and give to your favorite linux distribution! They have a full time team and need the fund to keep making great software for us to enjoy our command line tool!'\n");
	}
    @FXML
	public void license(ActionEvent event) throws IOException {
    	vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface/blob/main/LICENSE\n");
	}
    @FXML
	public void about(ActionEvent event) throws IOException {
    	vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface\n");
	}
}
