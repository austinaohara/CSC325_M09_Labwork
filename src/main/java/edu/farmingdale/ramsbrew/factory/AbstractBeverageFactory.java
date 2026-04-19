package edu.farmingdale.ramsbrew.factory;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.builder.BeverageBuilder;
import edu.farmingdale.ramsbrew.model.Temperature;

public interface AbstractBeverageFactory {
    String getFactoryName();

    BeverageBuilder createBuilder();

    Beverage createDefaultBeverage(Temperature temperature);
}
