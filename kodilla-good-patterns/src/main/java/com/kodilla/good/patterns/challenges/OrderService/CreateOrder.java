package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public final class CreateOrder implements Order {

    private final User user;
    private final int productNumber;
    private final LocalDate dateOfOrder;
    private final String deliveryAddress;
    private final boolean isAvailable;

    public CreateOrder(User user, int productNumber, LocalDate dateOfOrder, String deliveryAddress, boolean isAvailable) {
        this.user = user;
        this.productNumber = productNumber;
        this.dateOfOrder = dateOfOrder;
        this.deliveryAddress = deliveryAddress;
        this.isAvailable = isAvailable;
    }

    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public User getUser() {
        return user;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return "CreateOrder{" +
                "productNumber=" + productNumber +
                ", user=" + user +
                ", dateOfOrder=" + dateOfOrder +
                ", deliveryAdress='" + deliveryAddress + '\'' +
                '}';
    }

    @Override
    public String getInformation() {
        return toString();
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
