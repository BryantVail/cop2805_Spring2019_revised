package week14;

import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
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
		Button getRecord = new Button("Get Record");
		Scene scene = new Scene(getRecord, 200,250);
		
		primaryStage.setTitle("Find The Record");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
