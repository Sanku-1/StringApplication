package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        System.out.println("STEP 3");

        String itemName;
        double itemPrice;
        int  itemQuantity;

        itemPrice = 9.50;
        itemName = "beers";
        itemQuantity = 2;

        System.out.println("You bought " + itemQuantity + " " + itemName + " for $" + (itemPrice * itemQuantity));
    }
}
