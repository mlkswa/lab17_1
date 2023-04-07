package com.example.lab17_1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Primer_1_1 extends Application {
    @Override
    public void start(Stage stage) {

        Text text = new Text("Hello from JavaFX!");
        text.setLayoutX(100);
        text.setLayoutY(80);

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Apple");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}