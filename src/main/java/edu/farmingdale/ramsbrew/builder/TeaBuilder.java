package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.beverage.Tea;

public class TeaBuilder extends AbstractBeverageBuilder {
    @Override
    public Beverage build() {
        requireNoShots();
        return new Tea(size, temperature, milkType, shots, sweetenerType);
    }
}
