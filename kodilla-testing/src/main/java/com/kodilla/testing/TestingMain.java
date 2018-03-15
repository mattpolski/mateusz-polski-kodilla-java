package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


    System.out.println("Calculator's test:");

    Calculator simpleCalculator = new Calculator();

    int sum = simpleCalculator.add(4, 7);

    if(sum == 11) {
        System.out.println("Calculator works correctly");
    } else {
        System.out.println("Something is wrong");
    }
}

}
