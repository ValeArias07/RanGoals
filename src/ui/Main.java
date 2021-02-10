package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	private MainGUI mainController;
	
	public Main() throws IOException {
		mainController = new MainGUI();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainTable.fxml"));
		fxmlLoader.setController(mainController);
		Parent parent = fxmlLoader.load();
		
		Scene scene= new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main (String[] args) {
		launch(args);
	}
}
