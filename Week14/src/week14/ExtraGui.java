package week14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ExtraGui extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		Button searchButton = new Button("Search");
		Scene scene = new Scene(searchButton, 200, 250);
		primaryStage.setTitle("Search Customers");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
