package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("mushrooms")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        String whatSauce = bigmac.getSauce();

        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("standard", whatSauce);
    }
}
