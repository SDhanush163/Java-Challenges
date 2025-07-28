package com.OopsAdvancedChallenges.C41_OOPSMasterChallenge;

public class Item {
    private String name;
    private String type;
    private String size = "MEDIUM";
    private double price;

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL", "REGULAR" -> price - 0.5;
            case "LARGE" -> price + 1;
            default -> price;
        };
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s : %6.2f%n", name.toUpperCase(), price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK"))
            return size + " " + name;
        return name;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }
}
