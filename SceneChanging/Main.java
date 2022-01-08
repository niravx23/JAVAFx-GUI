
package application ;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	public static void main(String args[]) {
		launch(args);
	}
	
	public void start(Stage stg) {
		

	
			try {		
		
				Parent root  = FXMLLoader.load(getClass().getResource("Circle.fxml"));
					Scene sc1  =  new  Scene(root);
					Image img1 = new Image("C:\\Users\\nirav\\Pictures\\maxresdefault.jpg");
					stg.getIcons().add(img1);
					stg.setScene(sc1);
					stg.show();
				stg.setTitle("Circle"); 
				
				
			} catch (IOException e) {
		
				e.printStackTrace();
			}
	
		
	}
}
