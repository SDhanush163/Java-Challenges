package com.OopsBasicChallenges.C35_ComplexCalculator;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add (ComplexNumber number) {
        add(number.getReal(), number.getImaginary());
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract (ComplexNumber number) {
        subtract(number.getReal(), number.getImaginary());
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
