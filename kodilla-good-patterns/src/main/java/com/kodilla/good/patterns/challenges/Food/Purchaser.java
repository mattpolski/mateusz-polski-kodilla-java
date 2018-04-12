package com.kodilla.good.patterns.challenges.Food;

public final class Purchaser {

    private final String name;
    private final String firstName;
    private final String lastName;
    private final String address;

    public Purchaser(String name, String firstName, String lastName, String address) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Purchaser{" +
                "name='" + name + '\'' +
                '}';
    }
}
