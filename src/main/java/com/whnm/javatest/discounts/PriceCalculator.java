package com.whnm.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private double total;
    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result = 0.0;

        for (Double price : prices) {
            result += price.doubleValue();
        }
        result = result * (1 -(discount/100));
        return result;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
