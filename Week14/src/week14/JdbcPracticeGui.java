package week14;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JdbcPracticeGui extends Application{
	
//	public static void main(String[] args) {
//		// 
//		Application.launch(args);
//		
//	}
	
	@Override
	public void start(Stage primaryStage)  {
		// 
		Label IdTextFieldLabel = new Label("Enter Id of Record");
		Button getRecordButton = new Button("Get Record");
		TextField accountIdTextField = new TextField();
		HBox mainInputOutputPane = new HBox();
		mainInputOutputPane.getChildren.add(IdTextFieldLabel);
		mainInputOutputPane.getChildren.add(accountIdTextField);
		mainInputOutputPane.getChildren.add(getRecordButton);
		
		Scene scene = new Scene(getRecord, 200,250);
		
		
		primaryStage.setTitle("Find The Record");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
