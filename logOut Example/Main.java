package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
				
			 FXMLLoader loader  = new FXMLLoader(getClass().getResource("mainScreen.fxml"));
			 		
			 Parent parent  = loader.load();
			 
		
				 
			 
			 Scene sc1 =  new Scene(parent) ;
			 sc1.setFill(Color.CORNFLOWERBLUE);
			 sc1.setFill(Color.AQUAMARINE);
			 
			 primaryStage.setScene(sc1);
			 primaryStage.setTitle("Profile Builder");
			 primaryStage.setFullScreen(true); 
			 
			 primaryStage.show();
			 
		
				 
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
