package com.example.lab17_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Counter_Controller {
    @FXML
    private Label label1;
    @FXML
    private Button button1;
    @FXML
    private void clickbutton1(ActionEvent eventOne){
        if (Float.parseFloat(TF1.getText())<3){
            float num1, result;
            num1 = Float.parseFloat(TF1.getText());
            result = num1+1;
            TF1.setText(String.valueOf(result));
        }
        else {
            float num1, result;
            num1 = Float.parseFloat(TF1.getText());
            result = num1;
            TF1.setText(String.valueOf(result));
        }
    }
    @FXML
    private Button button2;
    @FXML
    private void clickbutton2(ActionEvent eventTwo){
        if (Float.parseFloat(TF1.getText())>-5){
            float num1, result;
            num1 = Float.parseFloat(TF1.getText());
            result = num1-1;
            TF1.setText(String.valueOf(result));
        }
        else {
            float num1, result;
            num1 = Float.parseFloat(TF1.getText());
            result = num1;
            TF1.setText(String.valueOf(result));
        }
    }
    @FXML
    private TextField TF1;
}