package com.coforge.AreaPerimeter;
import java.util.*;
public class Main {

    // Helper method to display shape details
    private static void displayShapeDetails(Shape shape) {
        shape.area();
        shape.perimeter();
        System.out.println();
    }

    public static void main(String[] args) {

        // Parameterized Constructors
        Shape square = new Square(4);
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        displayShapeDetails(square);
        displayShapeDetails(circle);
        displayShapeDetails(rectangle);

        // Default Constructors
        Shape defaultSquare = new Square();
        Shape defaultCircle = new Circle();
        Shape defaultRectangle = new Rectangle();

        displayShapeDetails(defaultSquare);
        displayShapeDetails(defaultCircle);
        displayShapeDetails(defaultRectangle);
    }
}