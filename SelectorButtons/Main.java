package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader =  new FXMLLoader(getClass().getResource("checkANDroundButtons.fxml")); 
			Parent root  =  loader.load();  
			
			Scene sc = new Scene(root);  
			primaryStage.setScene(sc);
			
			primaryStage.setTitle("Example");
			primaryStage.show(); 
 
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
