package edu.farmingdale.ramsbrew.beverage;

import edu.farmingdale.ramsbrew.model.MilkType;
import edu.farmingdale.ramsbrew.model.Size;
import edu.farmingdale.ramsbrew.model.SweetenerType;
import edu.farmingdale.ramsbrew.model.Temperature;

public abstract class BaseBeverage implements Beverage {
    private final Size size;
    private final Temperature temperature;
    private final MilkType milkType;
    private final int shots;
    private final SweetenerType sweetenerType;

    protected BaseBeverage(
            Size size,
            Temperature temperature,
            MilkType milkType,
            int shots,
            SweetenerType sweetenerType
    ) {
        this.size = size;
        this.temperature = temperature;
        this.milkType = milkType;
        this.shots = shots;
        this.sweetenerType = sweetenerType;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public MilkType getMilkType() {
        return milkType;
    }

    @Override
    public int getShots() {
        return shots;
    }

    @Override
    public SweetenerType getSweetenerType() {
        return sweetenerType;
    }

    @Override
    public String getDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append(getSize()).append(' ')
                .append(getTemperature()).append(' ')
                .append(getName());

        if (milkType != MilkType.NONE) {
            builder.append(", milk: ").append(milkType);
        }
        if (shots > 0) {
            builder.append(", shots: ").append(shots);
        }
        if (sweetenerType != SweetenerType.NONE) {
            builder.append(", sweetener: ").append(sweetenerType);
        }
        return builder.toString();
    }

    protected double sizeUpcharge() {
        return switch (size) {
            case SMALL -> 0.00;
            case MEDIUM -> 0.50;
            case LARGE -> 1.00;
        };
    }

    protected double milkUpcharge() {
        return switch (milkType) {
            case ALMOND, OAT, SOY -> 0.75;
            case NONE, WHOLE, SKIM -> 0.00;
        };
    }

    protected double shotUpcharge() {
        return shots * 0.80;
    }
}

