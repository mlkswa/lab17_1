package Primer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller_Primer {
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Label label_3;

    @FXML
    private void clickButton1(ActionEvent eventOne) { label_3.setText("Click ButtonOne");}

    @FXML
    private void clickButton2(ActionEvent eventTwo) { label_3.setText("Click ButtonTwo");}

    @FXML
    private void clickButton3(ActionEvent eventThree) { label_3.setText("Click ButtonThree");}
}