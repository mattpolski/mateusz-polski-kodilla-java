package com.kodilla.good.patterns.challenges.Food;

public final class ProductClass implements Product {

    private final String name;
    private final double price;

    public ProductClass(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
