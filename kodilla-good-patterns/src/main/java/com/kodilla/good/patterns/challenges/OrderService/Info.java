package com.kodilla.good.patterns.challenges.OrderService;

public class Info implements Information {

    private final String information;
    private final User user;

    public Info(String information, User user) {
        this.information = information;
        this.user = user;
    }

    @Override
    public String getInformation() {
        return information;
    }

    @Override
    public User getUser() {
        return user;
    }
}
