module com.example.akgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.akgui to javafx.fxml;
    exports com.example.akgui;
}