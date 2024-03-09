// Abstract class representing a generic shape
abstract class Shape {
    // Abstract method to calculate the shape's area
    abstract void calculateShape();
    // Abstract method to calculate the shape's perimeter
    abstract void calculatePerimeter();

    // Non-abstract method to display the shape's name
    void showShape(String shape) {
        System.out.println("Calculating properties of " + shape);
    }
}
