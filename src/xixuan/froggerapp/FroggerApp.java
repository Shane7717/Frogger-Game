package xixuan.froggerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Problems to be solved:
//Bug 1: If you keep pressing keys, the position of your frog will be wrong!
//Bug 2: Frogs in the end will be more thant 1
//Bug 3: Keep pressing but score mounting is false
//3. Unit test -- see email by PEER

public class FroggerApp extends Application {
	
	private static Stage primaryStage;
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//When program starts running, the menu page will be shown
		setPrimaryStage(primaryStage);			     	            
	    Parent root = FXMLLoader.load(getClass().getResource("./views/MenuView.fxml"));
	    Scene menuScene = new Scene(root, 600, 800); 
	    primaryStage.setScene(menuScene);
	    
	    //Mustn't change the size of the main window
	    primaryStage.setMaxWidth(600);
	    primaryStage.setMaxHeight(800);
	    primaryStage.setMinWidth(600);
	    primaryStage.setMinHeight(800);
	    primaryStage.setTitle("Frogger");
	    primaryStage.show();
	}
	
	public static Stage getPrimaryStage() {
		return FroggerApp.primaryStage;
	}
	
	public void setPrimaryStage(Stage primaryStage) {
		FroggerApp.primaryStage = primaryStage;
	}	
}
