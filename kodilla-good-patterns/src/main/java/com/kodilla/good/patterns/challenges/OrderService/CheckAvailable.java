package com.kodilla.good.patterns.challenges.OrderService;

public final class CheckAvailable {

    private final boolean isAvailable;
    private final int productNumber;


    CheckAvailable(final boolean isAvailable, final int productNumber) {
        this.isAvailable = isAvailable;
        this.productNumber = productNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getProductNumber() {
        return productNumber;
    }

    String getInformation() {
        if (isAvailable) {
            return String.format("Product number: " + productNumber + " is available and you can order it.");
        }
        return String.format("Product number: " + productNumber + " is not available. Try find something different.");
    }
}
