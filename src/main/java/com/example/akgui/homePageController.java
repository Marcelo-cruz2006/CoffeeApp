package com.example.akgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import static com.example.akgui.CafeLoginController.selector;

/*
homePageController.java
@author: Marcelo Cruz
The class contains all the functions/methods for when the item is clicked. Will add to the users item cart, how much they need to pay, and update their balance.
 */

public class homePageController implements Initializable {

    @FXML
    public ImageView hazelNutItem;
    @FXML
    public ImageView blackCoffee;
    public Label amountOfItemsInCart;
    public Label usersBalanceDisplay;
    int amountCart = 0;

    Alert alert = new Alert(Alert.AlertType.ERROR);

    public void logOutTestRun(ActionEvent event) throws IOException {
        new SceneSwitchController(event, "CafeLogin.fxml");
    }


    public void cinnaBunClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=2.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-3);
            listContainer.accounts.get(selector).setAmountInCart();

            listContainer.accounts.get(selector).addedItems.add("cinnamon Bun");
            listContainer.accounts.get(selector).addedItemsPrices.add("3.00");

            listContainer.accounts.get(selector).setAmountDue(3.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));

        }


    }

    public void bcClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=2.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-3);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("black Coffee");
            listContainer.accounts.get(selector).addedItemsPrices.add("3.00");

            listContainer.accounts.get(selector).setAmountDue(3.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void hncClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=1.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-2);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("Hazel Nut");
            listContainer.accounts.get(selector).addedItemsPrices.add("2.00");

            listContainer.accounts.get(selector).setAmountDue(2.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void chmClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=2.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-3);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("Chocolate Muffin");
            listContainer.accounts.get(selector).addedItemsPrices.add("3.00");

            listContainer.accounts.get(selector).setAmountDue(3.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void ccClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=3.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-4);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("cinnamon coffee");
            listContainer.accounts.get(selector).addedItemsPrices.add("4.00");

            listContainer.accounts.get(selector).setAmountDue(4.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void chsClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=1.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-2);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("choco Smoothie");
            listContainer.accounts.get(selector).addedItemsPrices.add("2.00");

            listContainer.accounts.get(selector).setAmountDue(2.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void crossiantClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=2.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-3);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("Croissant");
            listContainer.accounts.get(selector).addedItemsPrices.add("3.00");

            listContainer.accounts.get(selector).setAmountDue(3.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    public void cappClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=3.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-4);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("cappuccino");
            listContainer.accounts.get(selector).addedItemsPrices.add("4.00");

            listContainer.accounts.get(selector).setAmountDue(4.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }


    public void coldCoffeeClicked(MouseEvent mouseEvent) {
        //check if user has enough balance to pay
        System.out.println("entering if statement");
        if (listContainer.accounts.get(selector).getBalance()<=1.99 || listContainer.accounts.get(selector).getAmountInCart()==10) {
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR BROKE! OR CAN'T ORDER MORE THAN 10 ITEMS");
            alert.showAndWait();
        } else {
            listContainer.accounts.get(selector).setBalance(Double.parseDouble(usersBalanceDisplay.getText())-2);
            listContainer.accounts.get(selector).setAmountInCart();
            listContainer.accounts.get(selector).addedItems.add("Cold Coffee");
            listContainer.accounts.get(selector).addedItemsPrices.add("2.00");

            listContainer.accounts.get(selector).setAmountDue(2.00);

            amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
            usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        amountOfItemsInCart.setText(Integer.toString(listContainer.accounts.get(selector).getAmountInCart()));
        usersBalanceDisplay.setText(Double.toString(listContainer.accounts.get(selector).getBalance()));
    }

    public void ViewOrder(ActionEvent event) throws IOException {
        new SceneSwitchController(event, "ViewOrder.fxml");
    }
}
