package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double sumResult = calculator.add(7.5, 3.2);
        double subResult = calculator.sub(9.9, 2.2);
        double mulResult = calculator.mul(2.2, 2.0);
        double divResult = calculator.div(9.9, 3.0);

        Assert.assertEquals(10.7, sumResult, 0);
        Assert.assertEquals(7.7, subResult, 0);
        Assert.assertEquals(4.4, mulResult, 0);
        Assert.assertEquals(3.3, divResult, 0.01);
    }
}