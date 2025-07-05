package com.OopsAdvancedChallenges.OOPSMasterChallenge;

/*--------------------------------------------------------------------------------------------------
Bill's Burger Challenge
Bill runs a fast-food hamburger restaurant and sells hamburger meals. His meal orders are composed of
three items, the hamburger, the drink, and the side item. Your challenge is to write an application
to let Bill select the type of burgers and some of the additional items or extras that can be added
to the burgers, as well as the actual pricing.

You need a meal order.
    This should be composed of exactly one burger, one drink, and one side item. The most common meal
    order should be created without any arguments, like a regular burger, a small coke, and fries,
    for example. You should be able to create other meal orders by specifying different burgers,
    drinks, and side items.
You need a drink and side item.
    The drink should have at least a type, size, and price, and the price of the drink should change
    for each size. The side item needs at least a type and price.
You need burgers.
    Every hamburger should have a burger type, a base price, and up to a maximum of three extra
    toppings.The constructor should include only the burger type and price. Extra Toppings on a burger
    need to be added somehow and priced according to their type.
The deluxe burger bonus.
    Create a deluxe burger meal with a deluxe burger that has a set price, so that any additional toppings
    do not change the price. The deluxe burger should have room for an additional two toppings.

Your main method should have code to do the following:
 - Create a default meal that uses the no arguments constructor.
 - Create a meal with a burger and the drink and side item of your choice, with up to 3 extra toppings.
 - Create a meal with a deluxe burger where all items, drink, side item, and up to 5 extra toppings
        are included in the burger price.

For each meal order, you'll want to perform these functions:
1. Add some additional toppings to the burger.
2. Change the size of the drink.
3. Print the itemized list. This should include the price of the burger, any extra toppings, the drink
        price based on size, and the side item price. Print the total due amount for the meal.

Example input:
MealOrder regularMeal = new MealOrder();
regularMeal.addToppings("Bacon", "Cheese", "Mayo");
regularMeal.setDrinkSize("Large");
regularMeal.printItemisedList();
System.out.println("\n\n");
MealOrder secondMeal = new MealOrder("Turkey","Redbull","Wings");
secondMeal.addToppings("Lettuce", "Cheese", "Mayo");
secondMeal.setDrinkSize("Small");
secondMeal.printItemisedList();
System.out.println("\n\n");
MealOrder deluxeMeal = new MealOrder("Deluxe", "Coke", "Fries");
deluxeMeal.addToppings("Avocado", "Bacon", "Egg", "Cheese", "Mayo");
deluxeMeal.setDrinkSize("Small");
deluxeMeal.printItemisedList();

Example output:
         BASE BURGER :   4.00
               BACON :   1.50
              CHEESE :   1.00
                MAYO :   0.00
------------------------------
      REGULAR BURGER :   6.50
          LARGE COKE :   2.00
        MEDIUM FRIES :   1.50
------------------------------
         TOTAL PRICE :  10.00


         BASE BURGER :   7.00
             LETTUCE :   0.75
              CHEESE :   1.00
                MAYO :   0.00
------------------------------
       TURKEY BURGER :   8.75
       SMALL REDBULL :   1.25
        MEDIUM WINGS :   2.25
------------------------------
         TOTAL PRICE :  12.25


         BASE BURGER :   9.55
             AVOCADO :   0.00
               BACON :   0.00
                 EGG :   0.00
              CHEESE :   0.00
                MAYO :   0.00
------------------------------
       DELUXE BURGER :   9.55
          SMALL COKE :   0.00
        MEDIUM FRIES :   0.00
------------------------------
         TOTAL PRICE :   9.55

--------------------------------------------------------------------------------------------------*/

public class Main {
    public static void main(String[] args) {
        MealOrder regularMeal = new MealOrder();
        regularMeal.addToppings("Bacon", "Cheese", "Mayo");
        regularMeal.setDrinkSize("Large");
        regularMeal.printItemisedList();

        System.out.println("\n\n\n");

        MealOrder secondMeal = new MealOrder("Turkey","Redbull","Wings");
        secondMeal.addToppings("Lettuce", "Cheese", "Mayo");
        secondMeal.setDrinkSize("Small");
        secondMeal.printItemisedList();

        System.out.println("\n\n\n");

        MealOrder deluxeMeal = new MealOrder("Deluxe", "Coke", "Fries");
        deluxeMeal.addToppings("Avocado", "Bacon", "Egg", "Cheese", "Mayo");
        deluxeMeal.setDrinkSize("Small");
        deluxeMeal.printItemisedList();

    }
}
