package com.yannickBellerose.terminalInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yannickBellerose.terminalInterface.MyButtons.ButtonCheck;
import com.yannickBellerose.terminalInterface.MyButtons.ButtonRadio;
import com.yannickBellerose.terminalInterface.MyButtons.ButtonText;
import com.yannickBellerose.terminalInterface.MyButtons.MyField;
import com.yannickBellerose.terminalInterface.MyButtons.MyForm;
import com.yannickBellerose.terminalInterface.MyButtons.MyPopup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * This is the class who receives all buttons input and process their behavior.
 * 
 * @author yan
 */
public class MyController {
	MyVBox vbox;

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
		MyField[] buttons = {
				new ButtonCheck("Show hidden files", " -a"),
				new ButtonCheck("Display more information", " -l -h")
				};
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("ls - list files", form);
		if(popup.getWritten()) {
			vbox.exec("ls" + form.getCommand());
		}
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
		ArrayList<MyField> buttons = new ArrayList<MyField>();
		String[] a1 = {"File", "Folder"};
		String[] a2 = {"rm FILE_NAME", "rm -r DIRECTORY_NAME"};
		buttons.add(new ButtonRadio("File or folder?", a1, a2));
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("rm - remove/delete", form);
		if(popup.getWritten()) {
			vbox.exec(form.getCommand());
		}
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
		ArrayList<MyField> buttons = new ArrayList<MyField>();
		String[] a1 = {"File", "Folder", "Extract"};
		String[] a2 = {"gzip FILE_NAME", "gzip -r DIRECTORY_NAME", "gunzip FILE_NAME"};
		buttons.add(new ButtonRadio("A file or a folder?", a1, a2));
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("gzip - GNUZip compress", form);
		if(popup.getWritten()) {
			vbox.exec(form.getCommand());
		}
	}

	@FXML
	public void zip(ActionEvent event) throws IOException {
		ArrayList<MyField> buttons = new ArrayList<MyField>();
		String[] a1 = {"Files", "Folder", "Extract"};
		String[] a2 = {"zip ARCHIVE_NAME FILE1 FILE2...", "zip -r ARCHIVE_NAME DIRECTORY_NAME", "unzip FILE_NAME"};
		buttons.add(new ButtonRadio("Many files or a folder?", a1, a2));
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("zip - zip compress (gzip is preferred)", form);
		if(popup.getWritten()) {
			vbox.exec(form.getCommand());
		}
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
		vbox.exec("sed 's/SEARCH/REPLACE_BY/g' FILE_NAME");
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
		vbox.exec("ssh USERNAME@IP_ADRESSE");
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
		vbox.exec("man ip");
	}

	@FXML
	public void ethtool(ActionEvent event) throws IOException {
		vbox.exec("man ethtool");
	}

	@FXML
	public void dig(ActionEvent event) throws IOException {
		vbox.exec("dig URL");
	}

	/*-------------------------ADMINISTRATION-------------------------*/

	@FXML
	public void chmod(ActionEvent event) throws IOException { //TODO wont work
		String[] a1 = {"File", "Folder"};
		String[] a2 = {"", " -r"};
		MyField[] buttons = {
				new ButtonRadio("Is it a folder", a1, a2),
				new ButtonCheck("Read by owner", " 400"),
				new ButtonCheck("Read by group", " 40"),
				new ButtonCheck("Read by anyone", " 4"),
				new ButtonCheck("Write by owner", " 200"),
				new ButtonCheck("Write by group", " 20"),
				new ButtonCheck("Write by anyone", " 2"),
				new ButtonCheck("Execute by owner", " 100"),
				new ButtonCheck("Execute by group", " 10"),
				new ButtonCheck("Execute by anyone", " 1"),
				};
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("chmod - Change mode/permissions", form);
		if(popup.getWritten()) {
			String command = "chmod";
			List<String> formData = Arrays.asList(form.getCommand().trim().split(" "));
			
			int i = 0;
			int sum = 0;
			if (formData.size() > 0){
				if(formData.get(0).contains("-r")){
					i++;
					command += " -r";
				}
				for (int a = i; a<formData.size(); a++) {
					if (formData.get(a) != "" && !formData.get(a).isEmpty() && formData.get(a) != null) {
						sum += Integer.parseInt(formData.get(a));
					}
				}
			}
			if (sum < 10) {
				command += " 00";
			} else if (sum < 100) {
				command += " 0";
			} else {
				command += " ";
			}
			command += sum;

			vbox.exec(command+" FILE_NAME");
		}
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
		vbox.exec("passwd USER_NAME");
	}

	@FXML
	public void userdel(ActionEvent event) throws IOException {
		vbox.exec("deluser USER_NAME");
	}

	@FXML
	public void usermod(ActionEvent event) throws IOException {
		ArrayList<MyField> buttons = new ArrayList<MyField>();
		String[] a1 = {"List existing group", "Create new group", "Add user to group", "Remove user from group"};
		String[] a2 = {"getent group", "groupadd GROUP_NAME", "usermod -a -G NEW_GROUP USER_NAME", "gpasswd -d USER_NAME GROUP_NAME"};
		buttons.add(new ButtonRadio("Manage group", a1, a2));
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("Group - access", form);
		if(popup.getWritten()) {
			vbox.exec(form.getCommand());
		}
	}

	@FXML
	public void id(ActionEvent event) throws IOException {
		vbox.exec("id");
	}

	@FXML
	public void apt(ActionEvent event) throws IOException {
		vbox.exec("apt install APPLICATION_NAME");
	}
	
	@FXML
	public void update(ActionEvent event) throws IOException { 
		vbox.exec("apt update & apt upgrade");
	}

	@FXML
	public void make(ActionEvent event) throws IOException {
		vbox.exec("make OPTIONAL_TARGET");
	}

	@FXML
	public void git(ActionEvent event) throws IOException {
		ArrayList<MyField> buttons = new ArrayList<MyField>();
		String[] a1 = {"Copy a repository (clone)", "Commit your changes", "Push your changes", "Download change you don't have yet (pull)", "Learn more"};
		String[] a2 = {"clone URL", "add * & git commit -m 'DESCRIPTION_OF_YOUR_CHANGES'","push","pull","sensible-browser https://guides.github.com/"};
		buttons.add(new ButtonRadio("Github ", a1, a2));
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("git - Distributed version-control", form);
		if(popup.getWritten()) {
			vbox.exec("git " + form.getCommand());
		}
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
		MyField[] buttons = {
				new ButtonText("Your script name"),
				};
		MyForm form = new MyForm(buttons);
		MyPopup popup = new MyPopup("Script template", form);
		if(popup.getWritten()) {
		vbox.exec("echo '" + "#!/bin/bash\n"
				+ "################################################################################\n"
				+ "#                        Comment your template here                            #\n"
				+ "# Author:                                                                      #\n"
				+ "# Date:                                                                        #\n"
				+ "# Purpose:                                                                     #\n"
				+ "# Argument:                                                                    #\n"
				+ "# Return value:                                                                #\n"
				+ "################################################################################\n" + "\n"
				+ "echo \"hello world!\"'" + ">> "+form.getCommand()+".sh && nano "+form.getCommand()+".sh\n");
	}
	}

	@FXML
	public void crontab(ActionEvent event) throws IOException {
		vbox.exec("crontab -e");
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
	public void clear(ActionEvent event) throws IOException {
		vbox.exec("clear");
	}

	/*-------------------------HELP-------------------------*/

	@FXML
	public void man(ActionEvent event) throws IOException {
		vbox.exec("man COMMAND");
	}

	@FXML
	public void tutorial(ActionEvent event) throws IOException {
		vbox.exec("sensible-browser https://duckduckgo.com/?t=lm&q=linux+command+line+tutorial&ia=web");
	}

	@FXML
	public void feedback(ActionEvent event) throws IOException {
		vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface/issues");
	}

	@FXML
	public void donate(ActionEvent event) throws IOException {
		vbox.exec(
				"echo 'Thank you for you interest! Please go and give to your favorite linux distribution! They have a full time team and need the fund to keep making great software for us to enjoy our command line tool!'");
	}

	@FXML
	public void license(ActionEvent event) throws IOException {
		vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface/blob/main/LICENSE");
	}

	@FXML
	public void about(ActionEvent event) throws IOException {
		vbox.exec("sensible-browser https://github.com/B-Yan/terminalInterface");
	}
}
