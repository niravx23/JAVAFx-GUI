package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class controller {
	@FXML
	private Circle circ1  ;
	private double radius  ;
	
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
	
	
}
