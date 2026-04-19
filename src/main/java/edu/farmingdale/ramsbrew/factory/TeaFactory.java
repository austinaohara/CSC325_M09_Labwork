package edu.farmingdale.ramsbrew.factory;


import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.builder.BeverageBuilder;
import edu.farmingdale.ramsbrew.builder.TeaBuilder;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.Temperature;

public class TeaFactory implements AbstractBeverageFactory {
    @Override
    public String getFactoryName() {
        return "Tea Factory";
    }

    @Override
    public BeverageBuilder createBuilder() {
        return new TeaBuilder();
    }

    @Override
    public Beverage createDefaultBeverage(Temperature temperature) {
        return createBuilder()
                .setSize(Size.MEDIUM)
                .setTemperature(temperature)
                .build();
    }
}
