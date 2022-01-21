package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class controllerClass implements Initializable {
 
 @FXML 
 AnchorPane anchor ;
 
 @FXML 
 ListView<String>  list ;
 
 @FXML 
 Button buttonForList ; 
 
 @FXML
 TreeView<String> myTree ;
 
 

 
 
	String[] itemsToAdd = {"CSS", "JAVAFX" , "UNREAL",  "OS", "CA" ,"SystemDEV"} ; 


	@SuppressWarnings("unchecked")
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	
	list.getItems().addAll(itemsToAdd);
	
	list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			
			
			buttonForList.setText(list.getSelectionModel().getSelectedItem()); 

		}
});
		
	TreeItem<String>t = new TreeItem<String>("Fonts");
	TreeItem<String>t1 =  new TreeItem<String>("Formal"); 
	TreeItem<String>t2 = new TreeItem<String>("InFormal");
	
	TreeItem<String>t11 =  new TreeItem<String>("Franklin Gothic"); 
	TreeItem<String>t12 =  new TreeItem<String>("Goudy Old Style"); 
	TreeItem<String>t13 =  new TreeItem<String>("Bookman Old Style "); 
	TreeItem<String>t14 =  new TreeItem<String>("Book Antiqua"); 
	
	TreeItem<String>t21 = new TreeItem<String>("Freestyle Script");
	TreeItem<String>t22 = new TreeItem<String>("French Script MT");
	TreeItem<String>t23 = new TreeItem<String>("Harlow Solid");
	
	
	t.getChildren().add(t1) ;
	t.getChildren().add(t2) ; 	
	
	t1.getChildren().addAll(t11,t12,t13,t14);
	t2.getChildren().addAll(t21,t22,t23);
	
		myTree.setRoot(t);
	}
	
	public void close(ActionEvent event) {
		
	Stage	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	stage.close();
	}
	
	
	
	public void fontSelector(){
		TreeItem<String> item = myTree.getSelectionModel().getSelectedItem();
		

		if(item!=null)buttonForList.setFont(new Font(item.getValue(),20));
	}
	
	
	
	
	


}


