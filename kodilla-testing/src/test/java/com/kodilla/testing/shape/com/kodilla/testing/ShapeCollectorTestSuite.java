package com.kodilla.testing.shape.com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
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
        Circle theCircle = new Circle();
        shapeCollector.addFigure(theCircle);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle theCircle = new Circle();
        shapeCollector.addFigure(theCircle);
        boolean result = shapeCollector.removeFigure(theCircle);
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle theTriangle = new Triangle();
        shapeCollector.addFigure(theTriangle);
        Shape figure = shapeCollector.getFigure(0);
        Assert.assertEquals(theTriangle, figure);


    }

    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle theTriangle = new Triangle();
        shapeCollector.addFigure(theTriangle);
        ArrayList<Shape> shapes = shapeCollector.showFigures();
        Assert.assertEquals(theTriangle, shapes.get(0));;

    }
}
