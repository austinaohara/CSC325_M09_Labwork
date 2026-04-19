package edu.farmingdale.ramsbrew.order;

import edu.farmingdale.ramsbrew.beverage.Beverage;
import edu.farmingdale.ramsbrew.model.ServiceType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final int orderNumber;
    private final ServiceType serviceType;
    private final List<Beverage> beverages = new ArrayList<>();

    public Order(int orderNumber, ServiceType serviceType) {
        this.orderNumber = orderNumber;
        this.serviceType = serviceType;
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public List<Beverage> getBeverages() {
        return Collections.unmodifiableList(beverages);
    }

    public double getTotalPrice() {
        return beverages.stream()
                .mapToDouble(Beverage::getPrice)
                .sum();
    }

    public String getSummary() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order #").append(orderNumber)
                .append(" (").append(serviceType).append(')')
                .append(System.lineSeparator());

        for (Beverage beverage : beverages) {
            builder.append("- ")
                    .append(beverage.getDescription())
                    .append(" -> $")
                    .append(String.format("%.2f", beverage.getPrice()))
                    .append(System.lineSeparator());
        }

        builder.append("Total: $").append(String.format("%.2f", getTotalPrice()));
        return builder.toString();
    }
}
