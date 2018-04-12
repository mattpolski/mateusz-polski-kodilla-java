package com.kodilla.good.patterns.challenges.Food;

public class OrderClass implements Order {


    private final Purchaser purchaser;
    private final String deliveryAddress;
    private final double orderPrice;
    private final int contractorId;


    @Override
    public String toString() {
        return "OrderClass{" +
                "purchaser=" + purchaser +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderPrice=" + orderPrice +
                ", contractorId=" + contractorId +
                '}';
    }

    public OrderClass(Purchaser purchaser, String deliveryAddress, double orderPrice, int contractorId) {
        this.purchaser = purchaser;
        this.deliveryAddress = deliveryAddress;
        this.orderPrice = orderPrice;
        this.contractorId = contractorId;
    }

    @Override
    public Purchaser getPurchaser() {
        return purchaser;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    @Override
    public int getContractorId() {
        return contractorId;
    }


}