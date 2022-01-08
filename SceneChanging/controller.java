package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class controller {
	@FXML
	private Circle circ1  ;
	private double radius  ;
	
	private Stage stg ;
	private Scene sc1 ;
	
	private Parent root ;
	
	public void big(ActionEvent a) {
		radius =  circ1.getRadius() ;
		circ1.radiusProperty().set(radius+1);
		
	}
	
	public void small(ActionEvent b) {
		radius =  circ1.getRadius() ;
		circ1.radiusProperty().set(radius-1);
	}
	
	
	public void green(ActionEvent B) {
		circ1.setFill(Color.GREEN);
	}
	public void Blue(ActionEvent B) {
		circ1.setFill(Color.BLUE);
	}
	public void Black(ActionEvent B) {
		circ1.setFill(Color.BLACK);
	}
	public void Yellow(ActionEvent B) {
		circ1.setFill(Color.YELLOW);
	}
	public void RED(ActionEvent B) {
		circ1.setFill(Color.RED);
	}
	
	
	
	public void Reduce_Opacity(ActionEvent c){
		circ1.setOpacity(circ1.getOpacity()-0.1);
		
	}
	
	public void Increase_Opacity(ActionEvent c) {
		circ1.setOpacity(circ1.getOpacity()+0.1);
	}
	
	
public void Rectangle(ActionEvent aEvent) {
	// Rectangle Scene 
	
	 try {
		 stg =  (Stage)((Node)aEvent.getSource()).getScene().getWindow() ;
		 
		root  = FXMLLoader.load(getClass().getResource("Rectangle.fxml"));
		Scene sc1  =  new  Scene(root);

		stg.setTitle("Rectangle");

		stg.setScene(sc1);
		stg.show();
				
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	
}
