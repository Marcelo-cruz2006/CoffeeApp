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

/*
CafeLoginController.java
@author: Marcelo Cruz
This class is the sign-in page where a user signs in with his or her account. Otherwise they can press the 'sign up' button if they don't have an account created.
 */

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
            boolean userPass = false;


            for (int i = 0; i < loginPageUserNameData.size(); i++){
                System.out.println("input text: "+ logIn_UserNameInput.getText());
                System.out.println("username stored in arrayList text: "+ loginPageUserNameData.get(i).getUsername());
                if (loginPageUserNameData.get(i).getUsername().equals(logIn_UserNameInput.getText())){
                    userInList = true;
                    selector = i;
                } else {
                    userInList=false;
                }
            }

            for (int i = 0; i < loginPageUserNameData.size(); i++){
                if (loginPageUserNameData.get(i).getPassword().equals(LogIn_passwordInput.getText())){
                    userPass = true;
                    selector = i;
                } else {
                    userPass = false;
                }
            }
            if (userInList && userPass) {
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