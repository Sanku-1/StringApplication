package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        String favoriteColor;
        int yearStarted;
        char middleInitial;
        boolean hasPets;
        String niceMessage;

        favoriteColor = "pink";
        yearStarted = 2025;
        middleInitial = 'E';
        hasPets = false;
        niceMessage = "Don't give up!";

        System.out.println("STEP 1");
        System.out.println("1. My favorite color is " + favoriteColor);
        System.out.println("2. The year I started this class is " + yearStarted);
        System.out.println("3. My middle initial is " + middleInitial);
        System.out.println("4. Me owning pets is " + hasPets);
        System.out.println("5. A nice message is: " + niceMessage);

        byte daysInWeek = 7;
        String priceCoffee = "$4.99";
        char favoriteLetter = 'S';
        boolean isRaining = false;

        System.out.println("STEP 2");
        System.out.println("There are " + daysInWeek + " days in a week");
        System.out.println("The price of coffee is " + priceCoffee);
        System.out.println("My favorite letter is " + favoriteLetter);
        System.out.println("The assertion that it is raining is " + isRaining);
    }
}
