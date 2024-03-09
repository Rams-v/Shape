# Shape Calculator

This is a Java program that allows users to calculate the area, perimeter, and volume of various shapes such as circles, rectangles, squares, spheres, cylinders, and pyramids. It provides a menu-driven interface for users to select the shape and input the necessary parameters for calculation.

## Files Included

1. `Shape.java`: This file contains an abstract class `Shape` with methods to calculate the shape's area and perimeter.
2. `Volume.java`: This file contains an interface `Volume` with a method to calculate the volume of shapes.
3. `Circle.java`: This file contains the class `Circle` representing a circle, extending `Shape`.
4. `Rectangle.java`: This file contains the class `Rectangle` representing a rectangle, extending `Shape`.
5. `Square.java`: This file contains the class `Square` representing a square, extending `Rectangle`.
6. `Sphere.java`: This file contains the class `Sphere` representing a sphere, extending `Shape` and implementing `Volume`.
7. `Cylinder.java`: This file contains the class `Cylinder` representing a cylinder, extending `Shape` and implementing `Volume`.
8. `Pyramid.java`: This file contains the class `Pyramid` representing a pyramid, extending `Shape` and implementing `Volume`.
9. `Main.java`: This file contains the main class where the program execution starts. It provides a menu-driven interface for users to interact with different shapes.

## Usage

1. Compile all Java files using `javac *.java`.
2. Run the program using `java Main`.
3. Follow the on-screen prompts to select the shape and input the required parameters for calculation.
4. The program will display the calculated area, perimeter, and volume based on the user's input.
5. Exit the program by selecting the appropriate option from the menu.

## About

This program is designed to demonstrate object-oriented programming principles in Java and provides a practical example of implementing abstract classes, interfaces, and inheritance.
