package edu.farmingdale;

public class Latte implements Beverage {
    private static final double BASE_PRICE = 5.50;

    @Override
    public String getDescription() {
        return "A latte";
    }

    @Override
    public double getCost() {
        return BASE_PRICE;
    }
}
