package edu.farmingdale;

public class Cappuccino implements Beverage {
    private static final double BASE_PRICE = 4.80;

    @Override
    public String getDescription() {
        return "A cappuccino";
    }

    @Override
    public double getCost() {
        return BASE_PRICE;
    }
}
