class Sphere extends Shape implements Volume {
    private double radius;

//Call constructor 
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

//Call methods
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 0; // Perimeter not applicable for a sphere
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
