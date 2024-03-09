# Shape Calculator

## Overview
This Java program allows users to calculate the area, perimeter, and volume of various geometric shapes. It includes classes for shapes such as Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid. The program is menu-driven, allowing users to select a shape, input the required dimensions, and obtain the calculated results.

## Files
1. `Main.java`: Contains the main method to run the program and interact with the user.
2. `Shape.java`: Defines the abstract class Shape, serving as the base class for all shapes. It includes methods for showing the shape, calculating the area, and calculating the perimeter.
3. `Volume.java`: Defines the interface Volume, which includes the method for calculating the volume of shapes that have volume.
4. `Circle.java`, `Rectangle.java`, `Square.java`, `Sphere.java`, `Cylinder.java`, `Pyramid.java`: Classes for individual shapes, implementing the necessary methods for calculation.
5. `ShapeCalculator.java`: Contains the ShapeCalculator class, which handles the calculation process based on the user's input.

## How it Works
1. The program starts by presenting a menu of available shapes to the user.
2. When a shape is selected, the program prompts the user to input the required dimensions.
3. Based on the user's input, the program creates an instance of the corresponding shape class (e.g., Circle, Rectangle) and calculates its area and perimeter.
4. If the selected shape has volume (e.g., Sphere, Cylinder, Pyramid), the program also calculates its volume.
5. The calculated results (area, perimeter, and volume) are then displayed to the user.

## Usage
1. Compile all Java files using a Java compiler (e.g., `javac *.java`).
2. Run the Main class (e.g., `java Main`).
3. Follow the prompts to choose a shape and input the required dimensions.
4. View the calculated results for the selected shape.

