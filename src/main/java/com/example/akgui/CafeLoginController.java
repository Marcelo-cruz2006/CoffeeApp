package com.example.akgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class CafeLoginController implements Initializable {

    @FXML
    public TextField LogIn_passwordInput;
    public TextField logIn_UserNameInput;

    //to know which acc in array list is logged in
    static int selector = 0;

    //might need these two lists below

    //this arraylist holds an array of cafeAccount objects
    ArrayList<CafeAccount> loginPageUserNameData = new ArrayList<>();

    Alert alert = new Alert(Alert.AlertType.ERROR);



    //sign in button
    public void testRun(ActionEvent event) throws IOException {


        if (logIn_UserNameInput.getText().isEmpty() || logIn_UserNameInput.getText().contains(" ") || LogIn_passwordInput.getText().isEmpty() || LogIn_passwordInput.getText().contains(" ")) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("USER OR PASS AREA BLANK OR INVALID NO SPACE!!!");
            alert.showAndWait();
            logIn_UserNameInput.setText("");
            LogIn_passwordInput.setText("");
        } else {
            //this checks if username is true
            boolean userInList = false;


            for (int i = 0; i < loginPageUserNameData.size(); i++){
                if (loginPageUserNameData.get(i).getUsername().equals(logIn_UserNameInput.getText())){
                    userInList = true;
                    selector = i;
                }
            }

            //just in case need this for loop back
//            for (CafeAccount loginPageUserNameDatum : loginPageUserNameData) {
//                if (logIn_UserNameInput.getText().equals(loginPageUserNameDatum.getUsername()) && LogIn_passwordInput.getText().equals(loginPageUserNameDatum.getPassword())) {
//                    userInList = true;;
//                }
//            }

            if (userInList) {
                new SceneSwitchController(event, "homePage.fxml");
            } else {
                alert.setTitle("ERROR MSG");
                alert.setHeaderText("Error Alert");
                alert.setContentText("CREDENTIALS INVALID");
                alert.showAndWait();
            }
        }




    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        CafeAccount dummyUser = new CafeAccount(60.00, "Marcelo", "Cruz");
//        listContainer.accounts.add(dummyUser);
//        logIn_UserNameInput.setText("Marcelo");
//        LogIn_passwordInput.setText("Cruz");


        loginPageUserNameData.addAll(listContainer.accounts);

    }

    public void SignUp(ActionEvent event) throws IOException {
        new SceneSwitchController(event, "CafeSignUpPage.fxml");
    }
}