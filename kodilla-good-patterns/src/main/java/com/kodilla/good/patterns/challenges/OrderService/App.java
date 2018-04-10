package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public final class App {

    public static void main(final String[] args) {

        final User user = new User("john12", "John", "Smith", "New York 123", "john12@gmail.com");
        final Product product = new Game(546, "FarCry", 69.95);
        final Order order = new CreateOrder(user, product.getProductNumber(), LocalDate.of(2018, 4, 10), user.getAddress(), true);

        final ProductOrderService productOrderService = new ProductOrderService(new CheckingAvailabilityService(), new SendingInformation(), new ProductOrderRepository());
        productOrderService.orderDto(order);
    }
}
