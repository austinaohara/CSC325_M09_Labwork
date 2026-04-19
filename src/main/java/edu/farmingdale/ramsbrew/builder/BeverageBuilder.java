package edu.farmingdale.ramsbrew.builder;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public interface BeverageBuilder {
    BeverageBuilder setSize(Size size);

    BeverageBuilder setTemperature(Temperature temperature);

    BeverageBuilder setMilkType(MilkType milkType);

    BeverageBuilder setShots(int shots);

    BeverageBuilder setSweetenerType(SweetenerType sweetenerType);

    Beverage build();
}
