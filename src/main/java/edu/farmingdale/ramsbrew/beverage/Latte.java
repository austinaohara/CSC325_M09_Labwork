package edu.farmingdale.ramsbrew.beverage;

import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public class Latte extends BaseBeverage {
    public Latte(Size size, Temperature temperature, MilkType milkType, int shots, SweetenerType sweetenerType) {
        super(size, temperature, milkType, shots, sweetenerType);
    }

    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public double getPrice() {
        return 4.25 + sizeUpcharge() + milkUpcharge() + shotUpcharge();
    }
}
