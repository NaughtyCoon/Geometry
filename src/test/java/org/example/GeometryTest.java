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
        Geometry circle = draw.create(-12);
        Geometry rectangle = draw.create(20, -30);
        Geometry triangle = draw.create(5, 9, 3);

        assertEquals(-1.0, circle.calculateArea());
        assertEquals(-1.0, rectangle.calculateArea());
        assertEquals(-1.0, triangle.calculateArea());

    }

    @Test
    void calculateArea_whenFigureIsValid_thenReturnCorrectArea() {

        Draw draw = new Draw();
        Geometry circle = draw.create(12);
        Geometry rectangle = draw.create(20, 30);
        Geometry triangle = draw.create(5, 4, 3);

        assertEquals(452.389, circle.calculateArea(), 0.001);
        assertEquals(600.0, rectangle.calculateArea(), 0.001);
        assertEquals(6.0, triangle.calculateArea(), 0.001);

    }

    @Test
    void calculatePerimeter_whenFigureNotValid_thenReturnMinusOne() {

        Draw draw = new Draw();
        Geometry circle = draw.create(-12);
        Geometry rectangle = draw.create(20, -30);
        Geometry triangle = draw.create(5, 9, 3);

        assertEquals(-1.0, circle.calculatePerimeter());
        assertEquals(-1.0, rectangle.calculatePerimeter());
        assertEquals(-1.0, triangle.calculatePerimeter());

    }

    @Test
    void calculatePerimeter_whenFigureIsValid_thenReturnCorrectPerimeter() {

        Draw draw = new Draw();
        Geometry circle = draw.create(12);
        Geometry rectangle = draw.create(20, 30);
        Geometry triangle = draw.create(5, 4, 3);

        assertEquals(75.398, circle.calculatePerimeter(), 0.001);
        assertEquals(100.0, rectangle.calculatePerimeter(), 0.001);
        assertEquals(12.0, triangle.calculatePerimeter(), 0.001);

    }

    @Test
    void resize_whenFigureIsValidAndFactorIsPositive_thenReturnCorrectScaledParameters() {

        Draw draw = new Draw();
        Circle circle = draw.create(12);
        Rectangle rectangle = draw.create(20, 30);
        Triangle triangle = draw.create(5, 4, 3);

        circle.resize(2.5);
        rectangle.resize(0.5);
        triangle.resize(-2);

        assertEquals(30.0, circle.getRadius(), 0.001);
        assertEquals(10.0, rectangle.getW(), 0.001);
        assertEquals(15.0, rectangle.getH(), 0.001);
        assertEquals(10.0, triangle.getA(), 0.001);
        assertEquals(8.0, triangle.getB(), 0.001);
        assertEquals(6.0, triangle.getC(), 0.001);

    }

    @Test
    void resize_whenFigureIsNotValid_thenReturnUnchangedParameters() {

        Draw draw = new Draw();
        Circle circle = draw.create(-12);
        Rectangle rectangle = draw.create(20, -30);
        Triangle triangle = draw.create(5, 9, 3);

        circle.resize(2.5);
        rectangle.resize(0.5);
        triangle.resize(2);

        assertEquals(-12.0, circle.getRadius(), 0.001);
        assertEquals(20.0, rectangle.getW(), 0.001);
        assertEquals(-30.0, rectangle.getH(), 0.001);
        assertEquals(5.0, triangle.getA(), 0.001);
        assertEquals(9.0, triangle.getB(), 0.001);
        assertEquals(3.0, triangle.getC(), 0.001);

    }

    @Test
    void resize_whenFigureIsValidAndFactorIsNegative_thenReturnCorrectScaledParametersIgnoringFactorSign() {

        Draw draw = new Draw();
        Circle circle = draw.create(12);
        Rectangle rectangle = draw.create(20, 30);
        Triangle triangle = draw.create(5, 4, 3);

        circle.resize(-2.5);
        rectangle.resize(-0.5);
        triangle.resize(-2);

        assertEquals(30.0, circle.getRadius(), 0.001);
        assertEquals(10.0, rectangle.getW(), 0.001);
        assertEquals(15.0, rectangle.getH(), 0.001);
        assertEquals(10.0, triangle.getA(), 0.001);
        assertEquals(8.0, triangle.getB(), 0.001);
        assertEquals(6.0, triangle.getC(), 0.001);

    }
    @Test
    void getInfo_whenRequested_thenReturnDataOfFigure() {

        Draw draw = new Draw();
        Geometry circle = draw.create(-12);
        Geometry rectangle = draw.create(20, -30);
        Geometry triangle = draw.create(5, 9, 3);

        assertEquals("Круг", circle.getInfo().substring(0,4));
        assertEquals("Прям", rectangle.getInfo().substring(0,4));
        assertEquals("Треу", triangle.getInfo().substring(0,4));

    }

}
