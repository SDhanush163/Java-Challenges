package com.OopsBasicChallenges.C34_CarpetCostCalculator;

public class Floor {
    private double length, width;

    public Floor(double length, double width) {
        this.length = length < 0 ? 0: length;
        this.width = width < 0 ? 0: width;
    }

    public double getArea () {
        return width * length;
    }

}
