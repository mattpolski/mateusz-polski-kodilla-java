package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

import java.util.Objects;

public class Triangle {

    public String getShapeName() {
        return "Triangle";
    }

    public int getField() {
        return 9;
    }

    Shape shape = (Shape) new Triangle();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(shape, triangle.shape);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shape);
    }
}
