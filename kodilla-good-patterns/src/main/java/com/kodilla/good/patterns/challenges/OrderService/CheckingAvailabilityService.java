package com.kodilla.good.patterns.challenges.OrderService;

public class CheckingAvailabilityService  implements AvailableService {


    @Override
    public CheckAvailable checkAvailable(AvailableResult availableResult) {
        return new CheckAvailable(availableResult.isAvailable(), availableResult.getProductNumber());
    }
}
