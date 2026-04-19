package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public abstract class AbstractBeverageBuilder implements BeverageBuilder {
    protected Size size = Size.MEDIUM;
    protected Temperature temperature = Temperature.HOT;
    protected MilkType milkType = MilkType.NONE;
    protected int shots = 0;
    protected SweetenerType sweetenerType = SweetenerType.NONE;

    @Override
    public BeverageBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public BeverageBuilder setTemperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public BeverageBuilder setMilkType(MilkType milkType) {
        this.milkType = milkType;
        return this;
    }

    @Override
    public BeverageBuilder setShots(int shots) {
        this.shots = shots;
        return this;
    }

    @Override
    public BeverageBuilder setSweetenerType(SweetenerType sweetenerType) {
        this.sweetenerType = sweetenerType;
        return this;
    }

    protected void requireShotRangeForEspressoDrinks() {
        if (shots < 1 || shots > 3) {
            throw new IllegalArgumentException("Espresso drinks require 1 to 3 shots.");
        }
    }

    protected void requireNoShots() {
        if (shots != 0) {
            throw new IllegalArgumentException("This beverage does not support espresso shots.");
        }
    }
}
