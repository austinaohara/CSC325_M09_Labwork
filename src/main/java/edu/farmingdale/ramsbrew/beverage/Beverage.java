package edu.farmingdale.ramsbrew.beverage;

import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public interface Beverage {
    String getName();

    Size getSize();

    Temperature getTemperature();

    MilkType getMilkType();

    int getShots();

    SweetenerType getSweetenerType();

    double getPrice();

    String getDescription();
}