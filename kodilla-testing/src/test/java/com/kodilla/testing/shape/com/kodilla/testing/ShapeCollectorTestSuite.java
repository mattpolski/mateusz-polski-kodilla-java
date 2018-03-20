package com.kodilla.testing.shape.com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        ArrayList result = shapeCollector.addFigure();

        //Then
        Assert.assertEquals(1, result.size());

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList result = shapeCollector.removeFigure(Triangle());
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testGetFigure() {

    }

    @Test
    public void testShowFigures() {

    }
}
