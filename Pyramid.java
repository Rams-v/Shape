// Class representing a pyramid, extending Shape and implementing Volume
class Pyramid extends Shape implements Volume {
    double base, height;

    // Constructor
    Pyramid(double b, double h) {
        base = b;
        height = h;
    }

    // Calculate the surface area of the pyramid
    @Override
    void calculateShape() {
        showShape("Pyramid");
        System.out.println("Surface Area of Pyramid: " + (base * base + 2 * base * Math.sqrt((base / 2) * (base / 2) + height * height)));
    }

    // Calculate the perimeter of the pyramid
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter is not applicable for Pyramid");
    }

    // Calculate the volume of the pyramid
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Pyramid: " + ((1.0 / 3.0) * base * base * height));
    }
}
