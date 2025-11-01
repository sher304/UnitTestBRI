package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IShape sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.CalculateArea());
        System.out.println("Volume: " + sphere.CalculateVolume());
        System.out.println();

// Create a Cylinder with radius 3 and height 7
        IShape cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder:");
        System.out.println("Area: " + cylinder.CalculateArea());
        System.out.println("Volume: " + cylinder.CalculateVolume());
        System.out.println();


// Create a Rectangle with length 4 and width 8
        IShape rectangle = new Rectangle(4, 8);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.CalculateArea());
        System.out.println("Volume: " + rectangle.CalculateVolume());
        System.out.println();

// Create a Cube with side 4
        IShape cube = new Cube(4);
        System.out.println("Cube:");
        System.out.println("Area: " + cube.CalculateArea());
        System.out.println("Volume: " + cube.CalculateVolume());
    }
}
