package com.example.akgui;

import java.util.ArrayList;

public class CafeAccount {
    private double balance;
    private String username;
    private String password;
    private int userAmountOfOrderedItems;
    private double amountDue;

    ArrayList<String> addedItems = new ArrayList<>();
    ArrayList<String> addedItemsPrices = new ArrayList<>();


    //default constructor
    public CafeAccount(){
        this.balance = 0.00;
        this.username = " ";
        this.password = " ";
    }

    //overwritten
    public CafeAccount(double balance, String username, String password){
        this.balance = balance;
        this.username = username;
        this.password = password;
    }


    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(Double newBal){
        this.balance = newBal;
    }

    public void returnMoney(Double returnedAmount){
        this.balance = balance + returnedAmount;
    }

    public void setCartToZero(){
        this.userAmountOfOrderedItems = 0;
    }

    public void setAmountInCart(){
        this.userAmountOfOrderedItems= userAmountOfOrderedItems+1;
    }

    public void subtractAmountInCart(){
        this.userAmountOfOrderedItems= userAmountOfOrderedItems-1;
    }

    public int getAmountInCart(){
        return userAmountOfOrderedItems;
    }

    public void setAmountDue(Double price){
        this.amountDue += price;
    }

    public void paidAmount(Double price){
        this.amountDue = 0.00;
    }
    public double getAmountDue(){
        return amountDue;
    }

    public void reductingDue(double reducing){
        this.amountDue -= reducing;
    }



}
