package com.kodilla.good.patterns.challenges.Food;

public final class ContractorOrderService {

    private final ContractorAdd contractorAdd;

    public ContractorOrderService(ContractorAdd contractorAdd) {
        this.contractorAdd = contractorAdd;
    }

    OrderDto transferOrderToContractor(final Order order) {
        final boolean isReady = contractorAdd.getContractor(order.getContractorId()).process(order);
        return new OrderDto(order, isReady);
    }
}
