package edu.farmingdale.ramsbrew.driver;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.factory.*;
import edu.farmingdale.ramsbrew.model.*;
import edu.farmingdale.ramsbrew.order.Order;

public class OrderDriver {
    static void main() {
        AbstractBeverageFactory coffeeFactory = new CoffeeFactory();
        AbstractBeverageFactory latteFactory = new LatteFactory();
        AbstractBeverageFactory cappuccinoFactory = new CappuccinoFactory();
        AbstractBeverageFactory teaFactory = new TeaFactory();

        Beverage icedCoffee = coffeeFactory.createBuilder()
                .setSize(Size.LARGE)
                .setTemperature(Temperature.ICED)
                .setMilkType(MilkType.OAT)
                .setSweetenerType(SweetenerType.SUGAR)
                .build();

        Beverage hotLatte = latteFactory.createBuilder()
                .setSize(Size.MEDIUM)
                .setTemperature(Temperature.HOT)
                .setMilkType(MilkType.ALMOND)
                .setShots(2)
                .setSweetenerType(SweetenerType.HONEY)
                .build();

        Beverage cappuccino = cappuccinoFactory.createDefaultBeverage(Temperature.HOT);

        Beverage icedTea = teaFactory.createBuilder()
                .setSize(Size.SMALL)
                .setTemperature(Temperature.ICED)
                .setSweetenerType(SweetenerType.STEVIA)
                .build();

        Order order = new Order(1001, ServiceType.TAKEOUT);
        order.addBeverage(icedCoffee);
        order.addBeverage(hotLatte);
        order.addBeverage(cappuccino);
        order.addBeverage(icedTea);

        System.out.println("Rams Brew Order System Demo");
        System.out.println("---------------------------");
        System.out.println(order.getSummary());
    }
}
