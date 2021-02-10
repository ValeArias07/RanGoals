package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddGUI {
	
    @FXML
    private TextField divNameM;

    @FXML
    private TextField topicNameM;

    @FXML
    private ListView<String> divViewer;

    @FXML
    private ListView<String> divTopic;

    @FXML
    private ChoiceBox<String> selectGoalModifie;

    @FXML
    private TextField nameGoalNew;

    @FXML
    private TextField rangeNew;
    
    @FXML
    private AnchorPane addGoalPane;

    @FXML
    void addDivButtomClic(ActionEvent event) {

    }

    @FXML
    void addTopicButtomClic(ActionEvent event) {

    }
	
	public AnchorPane getPane(){
		return addGoalPane;
	}
}
