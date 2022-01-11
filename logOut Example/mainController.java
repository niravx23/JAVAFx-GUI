package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent ; 

public class mainController {
	
	 
@FXML
TextField name  ;

@FXML 
TextField Age  ;

@FXML 
TextField photoAdd ; 

@FXML  
TextArea Address ;

@FXML 
TextField Occupation ;
 
Stage stg ;
Parent root ;
Scene sc1 ;

@FXML 
AnchorPane pane  ;


public void build(ActionEvent login) throws IOException { 
	

	
	
	stg = (Stage)((Node)login.getSource()).getScene().getWindow() ;  
	
	FXMLLoader loader =  new FXMLLoader(getClass().getResource("profile.fxml")); 
	
	
	 

	 root  = loader.load();  
	 

	
	 
	 sc1  =  new Scene(root); 
	 stg.setScene(sc1);
	 stg.setFullScreen(true);
	 
	 stg.show();	 
	 
	 		profileController obj1 = loader.getController() ;
		
			obj1.address  = Address.getText() ;
			obj1.age1  = Age.getText() ;
			obj1.name1 = name.getText() ;
			obj1.occp =  Occupation.getText() ;
			obj1.setter(); 



}


}
