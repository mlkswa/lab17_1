module com.example.lab17_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab17_1 to javafx.fxml;
    exports com.example.lab17_1;
}