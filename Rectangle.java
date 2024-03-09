// Class representing a rectangle, extending Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Calculate the area of the rectangle
    @Override
    void calculateShape() {
        showShape("Rectangle");
        System.out.println("Area of Rectangle: " + (length * width));
    }

    // Calculate the perimeter of the rectangle
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}
