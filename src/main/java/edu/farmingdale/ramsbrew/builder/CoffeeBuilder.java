package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.beverage.Coffee;

public class CoffeeBuilder extends AbstractBeverageBuilder {
    @Override
    public Beverage build() {
        requireNoShots();
        return new Coffee(size, temperature, milkType, shots, sweetenerType);
    }
}
