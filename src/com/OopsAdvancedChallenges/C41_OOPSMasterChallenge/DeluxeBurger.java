package com.OopsAdvancedChallenges.C41_OOPSMasterChallenge;

public class DeluxeBurger extends Burger {
    private Item extra4;
    private Item extra5;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    @Override
    protected void printItemisedList() {
        super.printItemisedList();
        if (extra4 != null) extra4.printItem();
        if (extra5 != null) extra5.printItem();
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        this.extra4 = new Item(extra4, "TOPPING", getExtraPrice(extra4));
        this.extra5 = new Item(extra5, "TOPPING", getExtraPrice(extra5));
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
