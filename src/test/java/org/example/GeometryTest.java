package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeometryTest {

    @Test
    void calculateArea_whenFigureNotValid_thenReturnMinusOne() {

        Draw draw = new Draw();
        Circle circle = draw.create(-12);
        Geometry rectangle = draw.create(20, -30);
        Triangle triangle = draw.create(5, 9, 3);

        assertEquals(-1.0, circle.calculateArea());
        assertEquals(-1.0, rectangle.calculateArea());
        assertEquals(-1.0, triangle.calculateArea());

    }

    @Test
    void calculateArea_whenFigureIsValid_thenReturnCorrectArea() {

        Draw draw = new Draw();
        Circle circle = draw.create(12);
        Geometry rectangle = draw.create(20, 30);
        Triangle triangle = draw.create(5, 4, 3);

        assertEquals(452.389, circle.calculateArea(), 0.001);
        assertEquals(600.0, rectangle.calculateArea(), 0.001);
        assertEquals(6.0, triangle.calculateArea(), 0.001);

    }

    @Test
    void calculatePerimeter_whenFigureNotValid_thenReturnMinusOne() {

        Draw draw = new Draw();
        Circle circle = draw.create(-12);
        Geometry rectangle = draw.create(20, -30);
        Triangle triangle = draw.create(5, 9, 3);

        assertEquals(-1.0, circle.calculatePerimeter());
        assertEquals(-1.0, rectangle.calculatePerimeter());
        assertEquals(-1.0, triangle.calculatePerimeter());

    }

    @Test
    void calculatePerimeter_whenFigureIsValid_thenReturnCorrectPerimeter() {

        Draw draw = new Draw();
        Circle circle = draw.create(12);
        Geometry rectangle = draw.create(20, 30);
        Triangle triangle = draw.create(5, 4, 3);

        assertEquals(75.398, circle.calculatePerimeter(), 0.001);
        assertEquals(100.0, rectangle.calculatePerimeter(), 0.001);
        assertEquals(12.0, triangle.calculatePerimeter(), 0.001);

    }

}
