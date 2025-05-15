package com.example.akgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CafeLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 650);
        //scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("textAreaClass.css")).toExternalForm());
        stage.setTitle("MiCafeteria");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}