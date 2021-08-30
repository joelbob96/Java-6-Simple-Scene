import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ChoiceDialog;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

 
 public class Project6 extends Application{
 
 String s = "Hello World";
 
 public static void main(String[] args) {
        launch(args);
    }
	
	
	public void start(Stage primaryStage){
		
		int width = 80;
		int height = 40;
		
		primaryStage.setTitle("Project 6");
		
		Label lbl = new Label("Hello World");
		Button upBtn = new Button("Uppercase");
		Button lowBtn = new Button("Lowercase");
		Button newBtn = new Button("New Phrase");
		Button resetBtn = new Button("Reset");
		
		TextInputDialog dialog = new TextInputDialog("Hello World");
		dialog.setTitle("Text Input");
		dialog.setHeaderText("Launched text input");
		dialog.setContentText("Please enter a new phrase:");
		
		upBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				s = lbl.getText();
				s = s.toUpperCase();
				lbl.setText(s);
			}
		});
		
		lowBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				s = lbl.getText();
				s = s.toLowerCase();
				lbl.setText(s);
			}
		});
		
		
		
		newBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				//lbl.setText("New");
				Optional<String> input = dialog.showAndWait();
				if (input.isPresent()){
				s = input.get();
				}
				lbl.setText(s);
			}
		});
		
		resetBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				lbl.setText("Hello World");
			}
		});
		
		GridPane root = new GridPane();
		//lbl.setPrefSize(100,50);
		
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(10, 10, 10, 10));
		lbl.setStyle("-fx-border-color: black;");
		//lbl.setStyle("-fx-background-color: #CCC");
		lbl.setPadding( new Insets( 5,5,5,50 ) );
		lbl.setPrefSize(170,45);
		upBtn.setPrefSize(width,height);
		lowBtn.setPrefSize(width,height);
		newBtn.setPrefSize(width,height);
		resetBtn.setPrefSize(width,height);
        root.add( lbl,0,0,2,1);
		root.add( upBtn, 0, 1 );
		root.add( lowBtn, 1, 1 );
		root.add( newBtn, 0, 2 );
		root.add( resetBtn, 1, 2 );
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
 }
 
 }