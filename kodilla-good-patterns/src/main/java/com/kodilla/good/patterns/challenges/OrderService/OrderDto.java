package com.kodilla.good.patterns.challenges.OrderService;

public class OrderDto implements Information {

    private final Order order;
    private final int productNumber;
    private final boolean isAvailable;

    public OrderDto(Order order, int productNumber, boolean isAvailable) {
        this.order = order;
        this.productNumber = productNumber;
        this.isAvailable = isAvailable;
    }

    public Order getOrder() {
        return order;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getInformation() {
        if (isAvailable) {
            return String.format("Your order is ready", order.getInformation());
        }
        return String.format("Your order can not be processed.", order.getInformation());
    }

    @Override
    public User getUser() {
        return order.getUser();
    }


}
