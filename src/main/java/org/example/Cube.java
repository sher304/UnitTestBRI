package org.example;

public class Cube implements IShape {

    private double side;
    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double CalculateVolume() {
        return Math.pow(side, 3);
    }
}
