//Shape.java

abstract class Shape {
    protected String shapeName;

    // Constructor for every shape
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods to calculate Area and Parameter to be called in Every Shape
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
