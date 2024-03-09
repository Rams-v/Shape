// Class representing a cylinder, extending Shape and implementing Volume
class Cylinder extends Shape implements Volume {
    double radius, height;

    // Constructor
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    // Calculate the surface area of the cylinder
    @Override
    void calculateShape() {
        showShape("Cylinder");
        System.out.println("Surface Area of Cylinder: " + ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius)));
    }

    // Calculate the perimeter of the cylinder
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter is not applicable for Cylinder");
    }

    // Calculate the volume of the cylinder
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Cylinder: " + (Math.PI * radius * radius * height));
    }
}
