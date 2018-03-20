package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;

public class ShapeCollector {

    public ArrayList<Shape> shapes = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public int getFigure(int n) {
        shapes.get(n);
        return n;
    }

    public void showFigures() {
        for (int n = 0; n < shapes.size(); n++) {
            System.out.println("List contains: " + shapes.get(n));
        }
    }
}
