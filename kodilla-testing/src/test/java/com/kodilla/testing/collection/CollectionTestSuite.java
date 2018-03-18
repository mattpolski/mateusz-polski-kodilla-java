package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList emptyList = new ArrayList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            oddNumbersExterminator.exterminate(emptyList);
        ArrayList result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing while list is empty");
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList normalList = new ArrayList();

        normalList.add(2);
        normalList.add(3);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            oddNumbersExterminator.exterminate(normalList);
        ArrayList result = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        Assert.assertEquals(3, result.size());

    }

}