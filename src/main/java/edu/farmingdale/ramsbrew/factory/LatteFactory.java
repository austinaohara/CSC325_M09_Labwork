package edu.farmingdale.ramsbrew.factory;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.builder.BeverageBuilder;
import edu.farmingdale.ramsbrew.builder.LatteBuilder;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.Temperature;

public class LatteFactory implements AbstractBeverageFactory {
    @Override
    public String getFactoryName() {
        return "Latte Factory";
    }

    @Override
    public BeverageBuilder createBuilder() {
        return new LatteBuilder();
    }

    @Override
    public Beverage createDefaultBeverage(Temperature temperature) {
        return createBuilder()
                .setSize(Size.MEDIUM)
                .setTemperature(temperature)
                .build();
    }
}
