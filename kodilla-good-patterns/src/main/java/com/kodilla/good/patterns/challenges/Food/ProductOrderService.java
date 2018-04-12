package com.kodilla.good.patterns.challenges.Food;

public class ProductOrderService implements OrderService {

    @Override
    public OrderDto processOrder(Order order) {
        System.out.println("Preparing order for: " + order.getPurchaser());
        return new OrderDto(order,true);
    }
}
