package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class closer {  
	
	@FXML 
 Stage stg  ;
	Stage aux ;
	
	

	
	public void close(ActionEvent a) {
		
		stg = 	(Stage)((Node)a.getSource()).getScene().getWindow();
		stg.close();  
	    aux.close() ;
	
	}
	public void StageBringer(Stage stg3) { 
		
		aux = stg3 ;
		
	}
	public void cancel(ActionEvent c) {
		Stage stg  =  (Stage)((Node)c.getSource()).getScene().getWindow();
		stg.close();
		
	}	 
	
	public void loop(ActionEvent event) throws IOException {
		
		Stage stg   = (Stage)((Node)event.getSource()).getScene().getWindow(); 
		FXMLLoader loader  = new FXMLLoader(getClass().getResource("mainScreen.fxml"));
		
		Parent root  =  loader.load(); 
		
		Scene sc =  new Scene(root) ;
		
		stg.setScene(sc);
		stg.show();
		stg.setFullScreen(true);

		
	}
}
