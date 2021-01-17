# terminalInterface

- I want to apologize for the gramatical error I may have made, this is not my first tongue. If you find any please inform me in the issue section or better yet edit and push your correction.

## Description

A small java software to implement an efficient GUI to the linux command line tool. It is intended for education purpose and eventually (when it will be thorougly debugged) for business purpose. Indeed the purpose is to offer to professional business user the kind of automation used by IT professional and more globally to facilitate the passage from GUI to CLI user.

More specifically the software have an excel like menu bar including some of the most used command. The default behavior when a command is selected is to put the command and the option that will offer a result that will be clear to a new command line user. Some more complexe command have a specific popup form when selected to help guide the user in selecting the parameter.

## Author

Yannick Bellerose (B-Yan on github)

## How to install 

### Install from the binary

- Make sure you have java 8 jdk, maven and git installed -> `sudo apt install maven git openjdk-8-jdk`
- Copy all the files from this github repository -> `git clone https://github.com/B-Yan/terminalInterface`
- Go to terminalInterface/terminalInterface there should be a file named Makefile -> `cd terminalInterface & cd terminalInterface`
- Make the file -> `make install`

Everytime you will want to start the app you will have to go to this same folder and enter -> `make`

### Install with the .jar

- Install java
    - On linux -> `sudo apt install openjdk-8-jdk`
    - On windows -> google java jre and install the .exe
- Right click on the jar and select open with java or openjdk

### Install with .exe

- Double click on the .exe and follow the prompt

### Warning to windows user

The command are linux command, when you open the application the ssh command will be pre-entered. You have to connect via ssh to a linux computer for the other command to work. Simply enter ssh USER@IP on the prompt of the application.

If you are just starting with the command line I recommend you seek advice on how to setup SSH on the server or to simply use this software on a linux machine.

## Library

javafx (https://openjfx.io/)

terminalFx (https://github.com/javaterminal/TerminalFX)

## Status

Finished
