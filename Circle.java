class Circle extends Shape {
    private double radius;

//Call constructor 
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

//Call methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
