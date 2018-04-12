package com.kodilla.good.patterns.challenges.Food;

public final class OrderDto {

    private final Order order;
    private final boolean isReady;

    OrderDto(final Order order, final boolean isReady) {
        this.order = order;
        this.isReady = isReady;
    }

    Order getOrder() {
        return order;
    }

    boolean isReady() {
        return isReady;
    }
}
