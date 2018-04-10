package com.kodilla.good.patterns.challenges.OrderService;

public interface Order extends Information {

    boolean isAvailable();
    int getProductNumber();
    User getUser();

}
