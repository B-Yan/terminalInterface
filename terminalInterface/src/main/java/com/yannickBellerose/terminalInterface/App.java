package com.yannickBellerose.terminalInterface;

import com.yannickBellerose.terminalInterface.section.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

/**
 * @author yan
 * @version 1.0.0
 */
public class App extends Application{

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bPane = new BorderPane();
		
		Button[] buttons = new Button[] { 
		         new Button("SunDay"), 
		         new Button("MonDay"), 
		         new Button("TuesDay"), 
		         new Button("WednesDay"), 
		         new Button("ThursDay"), 
		         new Button("FriDay"), 
		         new Button("SaturDay")  
		      };
		
		Button[] buttons2 = new Button[] { 
		         new Button("SunDay2"), 
		         new Button("MonDay2"), 
		         new Button("TuesDay2"), 
		         new Button("WednesDay2"), 
		         new Button("ThursDay2"), 
		         new Button("FriDay2"), 
		         new Button("SaturDay2")  
		      };
		
		Button[] buttons3 = new Button[] { 
		         new Button("SunDay3"), 
		         new Button("MonDay3"), 
		         new Button("TuesDay3"), 
		         new Button("WednesDay3"), 
		         new Button("ThursDay3"), 
		         new Button("FriDay3"), 
		         new Button("SaturDay3")  
		      };
		
		Button[] buttons4 = new Button[] { 
		         new Button("SunDay4"), 
		         new Button("MonDay4"), 
		         new Button("TuesDay4"), 
		         new Button("WednesDay4"), 
		         new Button("ThursDay4"), 
		         new Button("FriDay4"), 
		         new Button("SaturDay4")  
		      };
		
		MySubsection[] subSections = {
				new MySubsection("testTitle1", buttons),
				new MySubsection("testTitle2", buttons2)
			};
		
		MySubsection[] subSections2 = {
				new MySubsection("testTitle3", buttons3),
				new MySubsection("testTitle4", buttons4)
			};
		
		MySection[] section = {new MySection("sectionName",subSections),new MySection("section2Name", subSections2)};
		
		MyTop top = new MyTop(section);
		MyCenter center = new MyCenter();
		MyLeft left = new MyLeft();
		//MyBottom bottom = new MyBottom(center);
		
		bPane.setTop(top); 	    
	    bPane.setLeft(left);
	    bPane.setCenter(center); 
	    //bPane.setBottom(bottom); 
	    
		Scene scene = new Scene(bPane);
		scene.getStylesheets().add("com/yannickBellerose/terminalInterface/style/v1.css");
		
		primaryStage.setTitle("K.I.S.S.I.T.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public static void main( String[] args )
    {
        launch( args );
    }
}
