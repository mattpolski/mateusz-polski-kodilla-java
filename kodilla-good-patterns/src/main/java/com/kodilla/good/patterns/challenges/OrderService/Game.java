package com.kodilla.good.patterns.challenges.OrderService;

public class Game implements Product {
    private final int productNumber;
    private final String title;
    private final double price;


    public Game(int productNumber, String title, double price) {
        this.productNumber = productNumber;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "productNumber=" + productNumber +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
