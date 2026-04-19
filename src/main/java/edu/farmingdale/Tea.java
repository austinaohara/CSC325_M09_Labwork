package edu.farmingdale;

public class Tea implements Beverage {
    private static final double BASE_PRICE = 2.75;

    @Override
    public String getDescription() {
        return "A cup of tea";
    }

    @Override
    public double getCost() {
        return BASE_PRICE;
    }
}
