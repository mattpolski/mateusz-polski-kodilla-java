package com.kodilla.good.patterns.challenges.OrderService;

public final class AvailableResult {

    private final boolean isAvailable;
    private final User user;
    private final int productNumber;

    public AvailableResult(boolean isAvailable, User user, int productNumber) {
        this.isAvailable = isAvailable;
        this.user = user;
        this.productNumber = productNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public User getUser() {
        return user;
    }

    public int getProductNumber() {
        return productNumber;
    }
}
