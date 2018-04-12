package com.kodilla.good.patterns.challenges.Food;

public final class HealthyShop implements Contractor {

    final OrderService orderService;

    public HealthyShop(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean process(Order order) {
        OrderDto readyOrder = orderService.processOrder(order);
        System.out.println("Your order is ready to shipping!");
        return readyOrder.isReady();
    }


}
