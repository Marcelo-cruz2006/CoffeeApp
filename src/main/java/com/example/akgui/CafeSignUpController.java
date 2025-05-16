package com.example.akgui;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/*
CafeSignUpController.java
@author: Marcelo Cruz
This class is the sign-up for a user to create an account
 */

import java.io.IOException;

public class CafeSignUpController {
    public TextField SignUp_usernameInput;
    public TextField SgnUp_passwordInput;
    public TextField SignUp_BalanceInput;


    Alert alert = new Alert(Alert.AlertType.ERROR);
    Alert success = new Alert(Alert.AlertType.CONFIRMATION);

    boolean letterDetected = false;

    public void LogIn(ActionEvent event) throws IOException {

        new SceneSwitchController(event, "CafeLogin.fxml");
    }

    public void CreateAcc(ActionEvent event) throws IOException {
        //check if credentials inputted are valid
        containsLetters(SignUp_BalanceInput.getText());
        if (SignUp_usernameInput.getText().isEmpty() || SignUp_usernameInput.getText().contains(" ")){
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("USERNAME AREA BLANK OR INVALID NO SPACE!!!");
            alert.showAndWait();
            SignUp_usernameInput.setText("");


        } else if (SgnUp_passwordInput.getText().isEmpty() || SgnUp_passwordInput.getText().contains(" ")) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("PASS AREA BLANK OR INVALID NO SPACE!!!");
            alert.showAndWait();
            SgnUp_passwordInput.setText("");
        } else if (SignUp_BalanceInput.getText().isEmpty() || SignUp_BalanceInput.getText().matches(".*[a-z].*")) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("BALANCE INVALID!");
            alert.showAndWait();
            SignUp_BalanceInput.setText("");
        } else if (Double.parseDouble(SignUp_BalanceInput.getText())<=0) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("BALANCE INVALID!");
            alert.showAndWait();
            SignUp_BalanceInput.setText("");
        } else {
            CafeAccount newAcc = new CafeAccount(Double.parseDouble(SignUp_BalanceInput.getText()), SignUp_usernameInput.getText(), SgnUp_passwordInput.getText());
            listContainer.accounts.add(newAcc);
            success.setTitle("Success");
            success.setHeaderText("Acc Valid");
            success.setContentText("ACC CREATED SUCCESSFULLY! GO TO LOGIN PAGE");
            success.showAndWait();
            new SceneSwitchController(event, "CafeLogin.fxml");
        }
    }

    public void containsLetters(String str){
        if (str == null || str.isEmpty()){
            letterDetected = true;
        }
        assert str != null;
        for (char c: str.toCharArray()){
            if (Character.isLetter(c)){
                letterDetected = true;
            }
        }
        letterDetected = false;
    }
    //grab the userInput text and password text to add it to the account class username (Creating new acc)

}
