package com.OopsAdvancedChallenges.OOPSMasterChallenge;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("Regular", "Coke", "Fries");
    }

    public MealOrder(String burger, String drink, String side) {
        if (burger.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burger, 9.55);
        }
        else {
            this.burger = new Burger(burger, switch (burger.toUpperCase()) {
                case "ELK", "SHRIMP" -> 8.50;
                case "TURKEY", "LAMB", "BACON" -> 7.00;
                case "CHICKEN", "CHEESE" -> 4.75;
                case "BLACK BEAN", "MUSHROOM", " VEG CHEESE" -> 4.25;
                case "VEG", "VEGGIE", "SLIDER" -> 3.50;
                default -> 4.0;
            });
        }
        this.drink = new Item(drink,"Drink", switch (drink.toUpperCase()) {
            case "PRIME" -> 2.10;
            case "REDBULL", "MONSTER" -> 1.75;
            default -> 1.00;
        });
        this.side = new Item(side, "Side", switch (side.toUpperCase()) {
            case "CHICKEN TENDER", "WINGS" -> 2.25;
            case "ONION RING", "WEDGES" -> 1.70;
            default -> 1.50;
        });
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger)
            return burger.getAdjustedPrice();
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemisedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("Total Price",getTotalPrice());
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db)
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        else
            burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}
