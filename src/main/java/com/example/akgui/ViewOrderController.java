package com.example.akgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

import static com.example.akgui.CafeLoginController.selector;

/*
ViewOrderController.java
@author: Marcelo Cruz
The class serves as a way to confirm the users purchases and declared finally their balance and then clear the item carts of the users account being active.
 */

public class ViewOrderController implements Initializable {
    @FXML
    public TextArea reciept;

    public Label usersOrder;


    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> price = new ArrayList<>();

    //labels list
    ArrayList<Label> Listitems = new ArrayList<>();
    ArrayList<Label> Listprice = new ArrayList<>();
    
    

    public Label item1;
    public Label item2;
    public Label item3;
    public Label item4;
    public Label item5;
    public Label item6;
    public Label item7;
    public Label item8;
    public Label item9;
    public Label item10;

    public Label totalAmount;

    public Button pay;

    public Label price1;
    public Label price2;
    public Label price3;
    public Label price4;
    public Label price5;
    public Label price6;
    public Label price7;
    public Label price8;
    public Label price9;
    public Label price10;

    public Label thankYouText;

    Alert alert = new Alert(Alert.AlertType.ERROR);

    public void goBack(ActionEvent event) throws IOException {
        new SceneSwitchController(event, "homePage.fxml");
    }

    public void removeItem1(MouseEvent mouseEvent) {
        //manually move items down list in gui

        // trying to implement try catch blocks

        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price1.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price1.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        //add code below to rest of items methods
        try{
            listContainer.accounts.get(selector).addedItems.removeFirst();
            listContainer.accounts.get(selector).addedItemsPrices.removeFirst();
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price1.getText()));
        } catch (NoSuchElementException e){
            System.err.println("error: removing non existent item");
        }

        //add code above to rest of items methods

        //listContainer.accounts.get(selector).addedItems.removeFirst();
        //listContainer.accounts.get(selector).addedItemsPrices.removeFirst();






        //do if statement first

        if (item2.getText().equals("label") || item2.getText().equals("0.00")) {
            item1.setText("label");
            price1.setText("0.00");

        } else {
            //new code (debug test)
            item1.setText(item2.getText());
            price1.setText(price2.getText());

            item2.setText(item3.getText());
            price2.setText(price3.getText());

            item3.setText(item4.getText());
            price3.setText(price4.getText());

            item4.setText(item5.getText());
            price4.setText(price5.getText());

            item5.setText(item6.getText());
            price5.setText(price6.getText());

            item6.setText(item7.getText());
            price6.setText(price7.getText());

            item7.setText(item8.getText());
            price7.setText(price8.getText());

            item8.setText(item9.getText());
            price8.setText(price9.getText());

            item9.setText(item10.getText());
            price9.setText(price10.getText());

            item10.setText("label");
            price10.setText("0.00");
        }

        //old code
//        item1.setText("removed");
//        price1.setText("$0.00");
    }

    public void removeItem2(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price2.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price2.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(1);
            listContainer.accounts.get(selector).addedItemsPrices.remove(1);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price2.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }



        //new code (debug test)
        item2.setText(item3.getText());
        price2.setText(price3.getText());

        item3.setText(item4.getText());
        price3.setText(price4.getText());

        item4.setText(item5.getText());
        price4.setText(price5.getText());

        item5.setText(item6.getText());
        price5.setText(price6.getText());

        item6.setText(item7.getText());
        price6.setText(price7.getText());

        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");

    }

    public void removeItem3(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price3.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price3.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(2);
            listContainer.accounts.get(selector).addedItemsPrices.remove(2);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price3.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item3.setText(item4.getText());
        price3.setText(price4.getText());

        item4.setText(item5.getText());
        price4.setText(price5.getText());

        item5.setText(item6.getText());
        price5.setText(price6.getText());

        item6.setText(item7.getText());
        price6.setText(price7.getText());

        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void removeItem4(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price4.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price4.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(3);
            listContainer.accounts.get(selector).addedItemsPrices.remove(3);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price4.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item4.setText(item5.getText());
        price4.setText(price5.getText());

        item5.setText(item6.getText());
        price5.setText(price6.getText());

        item6.setText(item7.getText());
        price6.setText(price7.getText());

        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void removeItem5(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price5.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price5.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(4);
            listContainer.accounts.get(selector).addedItemsPrices.remove(4);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price5.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item5.setText(item6.getText());
        price5.setText(price6.getText());

        item6.setText(item7.getText());
        price6.setText(price7.getText());

        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }


    public void removeItem6(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price1.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price6.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(5);
            listContainer.accounts.get(selector).addedItemsPrices.remove(5);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price6.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item6.setText(item7.getText());
        price6.setText(price7.getText());

        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void removeItem10(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price10.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price10.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(9);
            listContainer.accounts.get(selector).addedItemsPrices.remove(9);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price10.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        item10.setText("label");
        price10.setText("0.00");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //set username to text
        usersOrder.setText(listContainer.accounts.get(selector).getUsername()+ "'s order");

        items.addAll(listContainer.accounts.get(selector).addedItems);
        price.addAll(listContainer.accounts.get(selector).addedItemsPrices);
        int amountIterations = listContainer.accounts.get(selector).getAmountInCart();


        //Arry list of labels was here (moving out of method)

        
        Listitems.add(item1);
        Listitems.add(item2);
        Listitems.add(item3);
        Listitems.add(item4);
        Listitems.add(item5);
        Listitems.add(item6);
        Listitems.add(item7);
        Listitems.add(item8);
        Listitems.add(item9);
        Listitems.add(item10);

        Listprice.add(price1);
        Listprice.add(price2);
        Listprice.add(price3);
        Listprice.add(price4);
        Listprice.add(price5);
        Listprice.add(price6);
        Listprice.add(price7);
        Listprice.add(price8);
        Listprice.add(price9);
        Listprice.add(price10);

        for (int n = 0; n < amountIterations; n++){
            Listitems.get(n).setText(items.get(n));
        }

        for (int i = 0; i < amountIterations; i++){
            Listprice.get(i).setText(price.get(i));
        }

        //displau total amount due
        totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));


    }

    public void removeItem9(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price9.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price9.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(8);
            listContainer.accounts.get(selector).addedItemsPrices.remove(8);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price9.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void removeItem8(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price8.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price8.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(7);
            listContainer.accounts.get(selector).addedItemsPrices.remove(7);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price8.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void removeItem7(MouseEvent mouseEvent) {
        double a = listContainer.accounts.get(selector).getAmountDue();
        double newAmount = a - Double.parseDouble(price7.getText());
        System.out.println(newAmount);
        listContainer.accounts.get(selector).reductingDue(Double.parseDouble(price7.getText()));
        totalAmount.setText(Double.toString(newAmount));

        //totalAmount.setText(Double.toString(listContainer.accounts.get(selector).getAmountDue()));

        try{
            listContainer.accounts.get(selector).addedItems.remove(6);
            listContainer.accounts.get(selector).addedItemsPrices.remove(6);
            listContainer.accounts.get(selector).subtractAmountInCart();
            listContainer.accounts.get(selector).returnMoney(Double.parseDouble(price7.getText()));
        } catch (Exception e) {
            System.err.println("error: removing non existent item");
        }

        //new code (debug test)
        item7.setText(item8.getText());
        price7.setText(price8.getText());

        item8.setText(item9.getText());
        price8.setText(price9.getText());

        item9.setText(item10.getText());
        price9.setText(price10.getText());

        item10.setText("label");
        price10.setText("0.00");
    }

    public void pay(ActionEvent event) {
        if (Double.parseDouble(totalAmount.getText())<=0){
            alert.setTitle("ERROR MSG");
            alert.setHeaderText("Error Alert");
            alert.setContentText("YOUR PAYING FOR NOTHING! BUY SOMETHING");
            alert.showAndWait();
        } else {
            //listContainer.accounts.get(selector).setCartToZero();

            listContainer.accounts.get(selector).setCartToZero();
            listContainer.accounts.get(selector).paidAmount(0.00);
            totalAmount.setText("0.00");
            thankYouText.setVisible(true);

            for (int i = 0; i < listContainer.accounts.get(selector).addedItems.size();i++){
                if (!listContainer.accounts.get(selector).addedItems.get(i).isEmpty()){
                    System.out.println(listContainer.accounts.get(selector).addedItems.get(i));
                    System.out.println("Item at index ["+i+"] : "+items.get(i));
                    //might delete up

                    Listprice.get(i).setText("0.00");
                    Listitems.get(i).setText("label");


                }
            }
            listContainer.accounts.get(selector).addedItems.clear();
            listContainer.accounts.get(selector).addedItemsPrices.clear();
        }

    }
}
