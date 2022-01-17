package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.scene.control.Slider;

public class controller implements Initializable {
	
	@FXML 
	AnchorPane pane; 
	@FXML 
	ColorPicker pick ;
	
	
	@FXML 
	CheckBox java ; 
	@FXML 
	CheckBox cpp ;
	
	@FXML 
	CheckBox c; 
	
	@FXML 
	CheckBox chash ;
	
	@FXML
	
	RadioButton  show ; 
	
	@FXML 
	RadioButton  dontShow ;
	
	@FXML 
	TextArea area ;
		
	@FXML 
	ColorPicker texter ;
	
	@FXML
	Label  myLabel1 ;
	
	@FXML 
	ChoiceBox<String> box1 ;
	
	String[] collection = {"Copperplate Gothic" , "Algerian"  , "Cooper" , "Footlight MT" , "Garamond" , "Latin" ,"Impact" };
	private String mainer = "" ;

	@FXML
	Slider slider ;
	
	@FXML
	ProgressBar pgbar1 ;	 
	
	@FXML 
	Label progressTracker ;
	
	
	@Override 

	
public void initialize(URL location , ResourceBundle resource) {
		pgbar1.setStyle("-fx-accent: #00FF00;");
		
		pgbar1.setOnMouseClicked(this::progressChanger);
		
		Tooltip tp =  new Tooltip("Slider to change Size of Text");
		tp.setOpacity(0.5f);
		tp.setFont(new Font("Algerian", 40));
		
		
		Tooltip tp1=  new Tooltip("Shows TexT");
		tp1.setOpacity(0.5f);
		tp1.setFont(new Font("Algerian", 30));
		
		
		box1.getItems().setAll(collection) ;
		box1.setOnAction(this::setter1) ;	
		
	

	

		slider.setTooltip(tp);
		slider.setOnMouseEntered(this::mouseEntered); 	
		
		area.setTooltip(tp1);
		area.setOnMouseEntered(this::textHint); 
		
		

		slider.valueProperty().addListener(new ChangeListener<Number>() { 
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2){
			//on-Action Implementation
				
				area.setOpacity(slider.getValue());
		  
		
			}

			}
			) ;
	
		
		
	} 

	public void progressChanger(MouseEvent a) {
		
		if(pgbar1.getProgress()<1)	pgbar1.setProgress(pgbar1.getProgress()+0.05);
		String st  ;
		st = String.format("%.2f", pgbar1.getProgress()*100) +"%";
		if(pgbar1.getProgress()*100<100)  progressTracker.setText(st);
		
	}
	
	 
	public void textHint(MouseEvent ac) {
		
		area.getTooltip();
		
	}
	
public void mouseEntered(MouseEvent ac) {
	slider.getTooltip() ;

}
	
	public void setter1(ActionEvent ab) {  	
		
	 String new1 =  box1.getValue() ;
	 myLabel1.setText(new1);
	 
	 area.setFont(Font.font(new1, 30));

	 
	} 	
	
	public void selectTextColor(ActionEvent s ) {
		
		 Color getColor  =		texter.getValue();  
		java.setTextFill(getColor);
		cpp.setTextFill(getColor);
		c.setTextFill(getColor);
		chash.setTextFill(getColor);
		show.setTextFill(getColor);
		dontShow.setTextFill(getColor); 	 	
		
	}
	
	

	
	public void colorer(ActionEvent b) {
		
  Color getColor 	 =		pick.getValue(); 
  pane.setBackground(new Background(new BackgroundFill(getColor, null, null)));

  
	}
	
	public void  select1(ActionEvent a) {
		            area.setText(mainer);
		if(dontShow.isSelected()) {
			                                  dontShow.setSelected(false);   
			                                  
			              
		}
		
	} 
	
	public void  select2(ActionEvent a ) {
		area.setText("");
		
		if(show.isSelected()) {
		
		show.setSelected(false);
		
		
		}
		
	}
	

	
	
	public void java1(ActionEvent a) {
		 if(java.isSelected()) {
			 
			 mainer += " Java " ; 
			
			 if(show.isSelected()) area.setText(mainer);
			 
		 }
		 else {
			 mainer = mainer.replace(" Java ", "") ;
			 if(show.isSelected()) area.setText(mainer);
		 }
	}
 
	public void cpp1(ActionEvent a) {
		 if(cpp.isSelected()) {
			 mainer += " cpp " ;
		
			 if(show.isSelected()) area.setText(mainer);
		 }
		 else {
			 mainer =  mainer.replace(" cpp ", "") ;
			 if(show.isSelected()) area.setText(mainer);
		 }
	}
	
	public void C(ActionEvent a) {
		 if(c.isSelected()) {
			 mainer += " C " ;
		
			 if(show.isSelected()) area.setText(mainer);
		 }
		 else
		 {
			 mainer =  mainer.replace(" C ", "") ;
			 if(show.isSelected()) area.setText(mainer);
		 }
	}
	
	public void cSharp (ActionEvent a) {
		 if(chash.isSelected()) {
			 mainer += " cSharp " ; 
			 
			 if(show.isSelected()) area.setText(mainer);
		 }
		 else
		 {
			 mainer =  mainer.replace(" cSharp ", "") ;
			 if(show.isSelected()) area.setText(mainer);
		 }
	}




}
