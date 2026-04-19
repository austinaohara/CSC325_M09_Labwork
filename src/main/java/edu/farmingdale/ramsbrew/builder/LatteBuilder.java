package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.beverage.Latte;
import edu.farmingdale.ramsbrew.model.MilkType;

public class LatteBuilder extends AbstractBeverageBuilder {
    public LatteBuilder() {
        this.milkType = MilkType.WHOLE;
        this.shots = 1;
    }

    @Override
    public Beverage build() {
        requireShotRangeForEspressoDrinks();
        return new Latte(size, temperature, milkType, shots, sweetenerType);
    }
}
