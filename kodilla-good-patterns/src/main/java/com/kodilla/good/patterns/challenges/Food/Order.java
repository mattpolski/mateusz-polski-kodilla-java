package com.kodilla.good.patterns.challenges.Food;

import java.util.Map;

public interface Order {

    double getOrderPrice();
    Purchaser getPurchaser();
    String getDeliveryAddress();
    int getContractorId();

}