package com.kodilla.good.patterns.challenges.OrderService;

public class ProductOrderRepository implements OrderRepository {

    private int nextProductNumber = 0;

    @Override
    public OrderDto createOrder(Order order) {
        return new OrderDto(order, ++nextProductNumber, true);
    }
}
