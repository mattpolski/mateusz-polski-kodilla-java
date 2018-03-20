package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

import java.util.Objects;

public class Square {

    public String getShapeName() {
        return "Square";
    }

    public int getField() {
        return 24;
    }

    Shape shape = (Shape) new Square();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(shape, square.shape);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shape);
    }
}
