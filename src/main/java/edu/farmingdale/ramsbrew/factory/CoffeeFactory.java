package edu.farmingdale.ramsbrew.factory;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.builder.BeverageBuilder;
import edu.farmingdale.ramsbrew.builder.CoffeeBuilder;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.Temperature;

public class CoffeeFactory implements AbstractBeverageFactory {
    @Override
    public String getFactoryName() {
        return "Coffee Factory";
    }

    @Override
    public BeverageBuilder createBuilder() {
        return new CoffeeBuilder();
    }

    @Override
    public Beverage createDefaultBeverage(Temperature temperature) {
        return createBuilder()
                .setSize(Size.MEDIUM)
                .setTemperature(temperature)
                .build();
    }
}
