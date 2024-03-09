import java.util.Scanner;

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            // Get user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Circle
                    System.out.println("Enter radius of circle:");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.calculateShape();
                    circle.calculatePerimeter();
                    break;
                case 2:
                    // Rectangle
                    System.out.println("Enter length of rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter width of rectangle:");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.calculateShape();
                    rectangle.calculatePerimeter();
                    break;
                case 3:
                    // Square
                    System.out.println("Enter side of square:");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.calculateShape();
                    square.calculatePerimeter();
                    break;
                case 4:
                    // Sphere
                    System.out.println("Enter radius of sphere:");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.calculateShape();
                    sphere.calculateVolume();
                    break;
                case 5:
                    // Cylinder
                    System.out.println("Enter radius of cylinder:");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.println("Enter height of cylinder:");
                    double cylinderHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    cylinder.calculateShape();
                    cylinder.calculateVolume();
                    break;
                case 6:
                    // Pyramid
                    System.out.println("Enter base length of pyramid:");
                    double pyramidBase = scanner.nextDouble();
                    System.out.println("Enter height of pyramid:");
                    double pyramidHeight = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid(pyramidBase, pyramidHeight);
                    pyramid.calculateShape();
                    pyramid.calculateVolume();
                    break;
                case 7:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
