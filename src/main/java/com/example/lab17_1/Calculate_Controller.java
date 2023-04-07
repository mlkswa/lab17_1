package com.example.lab17_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculate_Controller {
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Button button1;
    @FXML
    private void clickbutton1(ActionEvent eventOne) {
        float num1, num2, result;
        num1 = Float.parseFloat(TF1.getText());
        num2 = Float.parseFloat(TF2.getText());
        result = num1+num2;
        TF3.setText(String.valueOf(result));
    }
    @FXML
    private Button button2;
    @FXML
    private void clickbutton2(ActionEvent eventTwo){
        TF1.setText("");
        TF2.setText("");
        TF3.setText("");
    }
    @FXML
    private TextField TF1;
    @FXML
    private TextField TF2;
    @FXML
    private TextField TF3;

}
