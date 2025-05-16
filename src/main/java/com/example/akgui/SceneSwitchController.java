package com.example.akgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/*
SceneSwitchController.java
@author: Marcelo Cruz
The class serves as the functionality in switching between scenes (fxml files).
 */


public class SceneSwitchController {
    public SceneSwitchController(ActionEvent event,  String fxmlFile) throws IOException {





        Parent root = null;
        FXMLLoader loader = new FXMLLoader(SceneSwitchController.class.getResource(fxmlFile));
        root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Test");
        stage.setScene(new Scene(root, 450, 650));
        stage.show();
    }


    //new
    public SceneSwitchController(MouseEvent event, String fxmlFile ) throws IOException {
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(SceneSwitchController.class.getResource(fxmlFile));
        root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Test");
        stage.setScene(new Scene(root, 450, 650));
        stage.show();
    }

}
