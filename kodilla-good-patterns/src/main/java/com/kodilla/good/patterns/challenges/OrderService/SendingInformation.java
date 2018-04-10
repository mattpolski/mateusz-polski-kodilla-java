package com.kodilla.good.patterns.challenges.OrderService;

public class SendingInformation implements InformationService {

    @Override
    public void info(Information information) {
        System.out.println("Sending an e-mail to: " + information.getUser().getEmail());
        System.out.println("Message: " + information.getInformation());
    }
}
