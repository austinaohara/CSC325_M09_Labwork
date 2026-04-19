package edu.farmingdale.ramsbrew.beverage;

import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public class Tea extends BaseBeverage{
    protected Tea(Size size, Temperature temperature, MilkType milkType, int shots, SweetenerType sweetenerType) {
        super(size, temperature, milkType, shots, sweetenerType);
    }

    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public double getPrice() {
        return 2.25 + sizeUpcharge() + milkUpcharge();
    }
}
