package com.kodilla.good.patterns.challenges.Food;

public class App {

    public static void main(final String[] args) {

        final Purchaser purchaser = new Purchaser("john12", "John", "Smith", "New York 123");
        final ProductClass product = new ProductClass("potatoes", 1.5);
        final Order extraFoodShop = new OrderClass(purchaser, purchaser.getAddress(), product.getPrice(), 1);


        ContractorAdd contractorAdd = new ContractorAddClass();
        contractorAdd.addContractor(1, new ExtraFoodShop(new ProductOrderService()));
        contractorAdd.addContractor(2, new GlutenFreeShop(new ProductOrderService()));
        contractorAdd.addContractor(3, new HealthyShop(new ProductOrderService()));

        ContractorOrderService contractorOrderService = new ContractorOrderService(contractorAdd);
        contractorOrderService.transferOrderToContractor(extraFoodShop);

    }
}