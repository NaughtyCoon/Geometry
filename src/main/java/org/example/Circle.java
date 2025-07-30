package org.example;

public class Circle implements Geometry {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        if (!validateThis()) return -1.0;

        return Math.PI * radius * radius;

    }

    @Override
    public double calculatePerimeter() {

        if (!validateThis()) return -1.0;

        return 2 * Math.PI * radius;

    }

    @Override
    public void validate() {
        System.out.println(validateThis() ? "Круг валиден" : "Круг не валиден");
    }

    @Override
    public void resize(double factor) {

        if (validateThis()) {
            factor = Math.abs(factor);
            radius *= factor;
        }

    }

    @Override
    public String getInfo() {
        return "Круг: радиус = " + radius + ", площадь = " + calculateArea();
    }

    @Override
    public double calculateIncircleRadius() {
        return radius;
    }

    private boolean validateThis() {
        return radius > 0;
    }

}
