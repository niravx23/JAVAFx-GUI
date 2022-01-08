package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class controller2 {
	
	@FXML
	private Rectangle rect ;
	private Stage stg ;
	private Parent  root ;
	
	public void Red(ActionEvent a) {
		rect.setFill(Color.RED);
		
	}

	
	public void Black(ActionEvent a) {
		rect.setFill(Color.BLACK);
		
	}
	
	public void Green(ActionEvent a) {
		rect.setFill(Color.GREEN);
		
	}
	
	
	public void Purple(ActionEvent a) {
		rect.setFill(Color.PURPLE);
		
	}

	 public void ReduceOpacity(ActionEvent a) {
		
		 rect.setOpacity(rect.getOpacity()-0.1);
	 }
	 
 public void IncreaseOpacity(ActionEvent a) {
	 rect.setOpacity(rect.getOpacity()+0.1);
		 
	 }
 
 public void rotateClockwise(ActionEvent a) {
	 rect.setRotate(rect.getRotate()+10);
 }
 
 public void rotateAntiClockwise(ActionEvent a) {
	 rect.setRotate(rect.getRotate()-10);
 }
 
 public void Circle(ActionEvent aEvent) {
	 
	 try {
		 stg =  (Stage)((Node)aEvent.getSource()).getScene().getWindow() ;
		 
		root  = FXMLLoader.load(getClass().getResource("Circle.fxml"));
		Scene sc1  =  new  Scene(root);

		stg.setTitle("Circle");

		stg.setScene(sc1);
		stg.show();
				
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 
}
