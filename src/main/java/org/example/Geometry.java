package org.example;

public interface Geometry {

    double calculateArea();
    double calculatePerimeter();
    void validate();
    void resize(double factor);
    String getInfo();
    double calculateIncircleRadius();
}
