// Class representing a circle, extending Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Calculate the area of the circle
    @Override
    void calculateShape() {
        showShape("Circle");
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    // Calculate the perimeter of the circle
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }
}
