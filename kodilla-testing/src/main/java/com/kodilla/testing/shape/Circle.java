package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

import java.util.Objects;

public class Circle {

    public String getShapeName() {
        return "circle";
    }

    public int getField() {
        return 14;
    }

    Shape shape = (Shape) new Circle();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(shape, circle.shape);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shape);
    }
}
