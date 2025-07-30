package org.example;

public class Triangle implements Geometry {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {

        if (!validateThis()) return -1.0;

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    @Override
    public double calculatePerimeter() {

        if (!validateThis()) return -1.0;

        return a + b + c;

    }

    @Override
    public void validate() {
        System.out.println(validateThis() ? "Треугольник валиден" : "Треугольник невалиден"
        );
    }

    @Override
    public void resize(double factor) {

        factor = Math.abs(factor);
        a *= factor;
        b *= factor;
        c *= factor;

    }

    @Override
    public String getInfo() {
        return "Треугольник: сторона a = " + a + ", сторона b = " + b + ", сторона c = " + c + ", площадь = " + calculateArea();
    }

    @Override
    public double calculateIncircleRadius() {
        return 2.0 * calculateArea() / calculatePerimeter();
    }

    private boolean validateThis() {
        return (a > 0 && b > 0 && c > 0) &&
               (a + b > c) && (a + c > b) && (b + c > a);
    }

}
