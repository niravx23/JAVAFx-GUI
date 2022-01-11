package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

public class controller {
	
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
	
	
	private String mainer = "" ;;
	
	
	
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
