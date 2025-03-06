class Rectangle extends Shape {
    private double length, breadth;

//Call constructor 
    public Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

//Call methods
    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
