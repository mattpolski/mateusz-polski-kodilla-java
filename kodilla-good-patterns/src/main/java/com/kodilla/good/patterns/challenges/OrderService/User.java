package com.kodilla.good.patterns.challenges.OrderService;

final class User {
    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String email;


    public User(String userName, String firstName, String lastName, String address, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public String getUserName() {
        return userName;
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

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
