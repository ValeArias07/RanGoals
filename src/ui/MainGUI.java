package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainGUI {

	private DeleteGUI deleteTable;
	private EditGUI editTable;
	private ChooseGUI chooseTable;
	private AddGUI addTable;
	
	private final String CHOOSE="ChooseTable.fxml";
	private final String ADD="AddTable.fxml";
	private final String EDIT="EditTable.fxml";
	private final String DELETE="deleteTable.fxml";
	
    @FXML
    private BorderPane mainPane;
    
	public MainGUI() throws IOException {
		deleteTable = new DeleteGUI();
		editTable= new EditGUI();
		chooseTable= new ChooseGUI();
		addTable= new AddGUI();
	}
	
	@FXML
	void deleteGoal(ActionEvent event) throws IOException {
		loadFxml(DELETE,deleteTable);
	}

	@FXML
	void editGoal(ActionEvent event) throws IOException {	    	
	   loadFxml(EDIT,editTable);
	}

	@FXML
	void generate(ActionEvent event) throws IOException {
	    loadFxml(CHOOSE,chooseTable);
	}
    
	@FXML
	void newGoal(ActionEvent event) throws IOException {
	    loadFxml(ADD,addTable);
	}
	    
	public void loadFxml(String n, Object c) throws IOException {
	   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(n));
	   fxmlLoader.setController(c);
	   Parent parent = fxmlLoader.load();
	   mainPane.setCenter(parent);
	}
}
