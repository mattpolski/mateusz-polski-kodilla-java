package com.kodilla.good.patterns.challenges.OrderService;

public class ProductOrderService {

    private final AvailableService availableService;
    private final InformationService informationService;
    private final OrderRepository orderRepository;

    public ProductOrderService(AvailableService availableService, InformationService informationService, OrderRepository orderRepository) {
        this.availableService = availableService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    OrderDto orderDto(final Order order) {
        final OrderDto orderDto = orderRepository.createOrder(order);
        if (orderDto.isAvailable()) {
            final CheckAvailable checkAvailable = availableService.checkAvailable(new AvailableResult(order.isAvailable(), order.getUser(), order.getProductNumber()));
            informationService.info(new Info(checkAvailable.getInformation(), order.getUser()));

            return orderDto;
        }
        informationService.info(orderDto);
        return orderDto;
    }
}
