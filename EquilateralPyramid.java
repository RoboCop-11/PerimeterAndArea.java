class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

//Call constructor 
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

//Call methods
    public double calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        return baseArea + lateralArea;
    }

    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * baseSide * baseSide * height;
    }
}
