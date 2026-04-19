package edu.farmingdale.ramsbrew.factory;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.builder.BeverageBuilder;
import edu.farmingdale.ramsbrew.builder.CappuccinoBuilder;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.Temperature;

public class CappuccinoFactory implements AbstractBeverageFactory {
    @Override
    public String getFactoryName() {
        return "Cappuccino Factory";
    }

    @Override
    public BeverageBuilder createBuilder() {
        return new CappuccinoBuilder();
    }

    @Override
    public Beverage createDefaultBeverage(Temperature temperature) {
        return createBuilder()
                .setSize(Size.MEDIUM)
                .setTemperature(temperature)
                .build();
    }
}
