package org.example;

public class Draw {

    Circle create (double radius) {
        return new Circle(radius);
    }

    Rectangle create (double width, double height) {
        return new Rectangle(width, height);
    }

    Triangle create (double sideA, double sideB, double sideC) {
        return new Triangle(sideA, sideB, sideC);
    }



}
