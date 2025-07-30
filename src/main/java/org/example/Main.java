package org.example;

public class Main {
    public static void main(String[] args) {

        Draw draw = new Draw();
        Circle circle = draw.create(12);
        Geometry rectangle = draw.create(20, 30);
        Triangle triangle = draw.create(5, 4, 3);

        System.out.println(circle.getClass());
        System.out.println(rectangle.getClass());
        System.out.println(triangle.getClass());

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());

        System.out.println(circle.calculatePerimeter());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(triangle.calculatePerimeter());

        circle.validate();
        rectangle.validate();
        triangle.validate();

        circle.resize(2.5);
        rectangle.resize(0.5);
        triangle.resize(-2);

        System.out.println(circle.getInfo());
        System.out.println(rectangle.getInfo());
        System.out.println(triangle.getInfo());

        System.out.println(circle.calculateIncircleRadius());
        System.out.println(rectangle.calculateIncircleRadius());
        System.out.println(triangle.calculateIncircleRadius());

    }
}