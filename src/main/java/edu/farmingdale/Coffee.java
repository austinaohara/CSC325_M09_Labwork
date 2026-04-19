package edu.farmingdale;

public class Coffee implements Beverage {
    private static final double BASE_PRICE = 3.15;

    @Override
    public String getDescription() {
        return "A cup of coffee";
    }

    @Override
    public double getCost() {
        return BASE_PRICE;
    }
}
