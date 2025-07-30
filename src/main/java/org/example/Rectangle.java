package org.example;

public class Rectangle implements Geometry {

    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {

        if (!validateThis()) return -1.0;

        return w * h;

    }

    @Override
    public double calculatePerimeter() {

        if (!validateThis()) return -1.0;

        return 2 * (h + w);

    }

    @Override
    public void validate() {
        System.out.println(validateThis() ? "Прямоугольник валиден" : "Прямоугольник не валиден");
    }

    @Override
    public void resize(double factor) {

        if (validateThis()) {
            factor = Math.abs(factor);
            w *= factor;
            h *= factor;
        }

    }

    @Override
    public String getInfo() {
        return "Прямоугольник: ширина = " + w + ", высота = " + h + ", площадь = " + calculateArea();
    }

    @Override
    public double calculateIncircleRadius() {
        return Math.min(w, h) / 2.0;
    }

    private boolean validateThis() {
        return (w > 0) && (h > 0);
    }

}
