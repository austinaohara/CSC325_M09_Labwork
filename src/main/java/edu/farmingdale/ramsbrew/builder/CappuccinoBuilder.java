package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.beverage.Cappuccino;
import edu.farmingdale.ramsbrew.model.MilkType;

public class CappuccinoBuilder extends AbstractBeverageBuilder {
    public CappuccinoBuilder() {
        this.milkType = MilkType.WHOLE;
        this.shots = 2;
    }

    @Override
    public Beverage build() {
        requireShotRangeForEspressoDrinks();
        return new Cappuccino(size, temperature, milkType, shots, sweetenerType);
    }
}
