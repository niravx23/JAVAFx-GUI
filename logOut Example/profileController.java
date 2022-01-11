package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class profileController {
	

	@FXML 
	 Label name ; 
	String name1 ;
	
	@FXML 
	Label age ; 
	String age1;
	
	@FXML  
	TextField Add ; 
	String address ; 
	 
	@FXML 
	Label Occ ;
	String occp ;
	
	Stage stgOrg  ;
	
	public void setter() {
		
		name.setText(name1);
		age.setText(age1);
		Add.setText(address);
		Occ.setText(occp);
		
		
	}
	
	public void quit(ActionEvent ac) throws IOException {
		
		stgOrg  =  (Stage)((Node)ac.getSource()).getScene().getWindow();
		
		FXMLLoader loader  = new FXMLLoader(getClass().getResource("closerAlert.fxml"));
		 Parent root  = loader.load();   
		 Stage stg  = new Stage() ;
		 Scene sc1 =  new Scene (root); 
		 
		 
		 stg.setScene(sc1); 
		 stg.show() ;
		 closer obj = loader.getController();
		 obj.StageBringer(stgOrg) ;

		 
	
		 
		 
		 
		 
		 
		 
		  
	}  
	


}
