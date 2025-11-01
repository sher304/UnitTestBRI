package org.example;

public class Rectangle implements IShape {


    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double CalculateArea() {
        return length * width;
    }

    @Override
    public double CalculateVolume() {
        return 0;
    }
}
