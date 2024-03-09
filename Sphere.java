// Class representing a sphere, extending Shape and implementing Volume
class Sphere extends Shape implements Volume {
    double radius;

    // Constructor
    Sphere(double r) {
        radius = r;
    }

    // Calculate the surface area of the sphere
    @Override
    void calculateShape() {
        showShape("Sphere");
        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * radius * radius));
    }

    // Calculate the perimeter of the sphere
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter is not applicable for Sphere");
    }

    // Calculate the volume of the sphere
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Sphere: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }
}
