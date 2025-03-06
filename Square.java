class Square extends Shape {
    private double side;

//Call constructor 
    public Square(double side) {
        super("Square");
        this.side = side;
    }

//Call methods
    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
