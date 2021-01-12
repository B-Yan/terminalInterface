# terminalInterface

## Description

- I want to apologize for the gramatical error I may have made, this is not my first tongue. If you find any please inform me in the issue section or better yet edit and push your correction.

A small java software to implement an efficient GUI to the linux command line tool. It is intended for education purpose and eventually (when it will be thorougly debugged) for business purpose. Indeed the purpose is to offer to professional business user the kind of automation used by IT professional and more globally to facilitate the passage from GUI to CLI user.

More specifically the software have an excel like menu bar including some of the most used command. The default behavior when a command is selected is to put the command and the option that will offer a result that will be clear to a new command line user. Some more complexe command have a specific popup form when selected to help guide the user in selecting the parameter.

## Author

Yannick Bellerose (B-Yan on github)

## How to install 

This is still a beta so there is no .jar yet. Here is the quickest way to install it.

- Make sure you have java 8 jdk, maven and git installed -> 'sudo apt install maven, git, openjdk-8-jdk'
- Copy all the files from this github repository -> 'git clone https://github.com/B-Yan/terminalInterface'
- Go to terminalInterface/terminalInterface there should be a file named Makefile -> 'cd terminalInterface & cd terminalInterface'
- Make the file -> 'make install'

Everytime you will want to start the app you will have to go to this same folder and enter -> 'make'

## How to use

<example>

## Library

javafx (https://openjfx.io/)
terminalFx (https://github.com/javaterminal/TerminalFX)

## Status

The project is functional but some advanced command line tool haven't been implanted yet. Also the app don't complete clause when the window is closed, you need to close the terminal that launched the app.
