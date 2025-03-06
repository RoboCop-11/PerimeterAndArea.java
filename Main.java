// * Name: Manan Khanna
//* PRN : 23070126156
// * Batch: AIML B3


//Main.java

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nChoose a shape to calculate Area and Volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scan.nextInt();
            
            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter radius of Circle: ");
                    double radius = scan.nextDouble();
                    Shape circle = new Circle(radius);
                    displayShapeDetails(circle);
                    break;

                case 2: // Rectangle
                    System.out.print("Enter length of Rectangle: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter breadth of Rectangle: ");
                    double breadth = scan.nextDouble();
                    Shape rectangle = new Rectangle(length, breadth);
                    displayShapeDetails(rectangle);
                    break;

                case 3: // Square
                    System.out.print("Enter side of Square: ");
                    double side = scan.nextDouble();
                    Shape square = new Square(side);
                    displayShapeDetails(square);
                    break;

                case 4: // Sphere
                    System.out.print("Enter radius of Sphere: ");
                    double sphereRadius = scan.nextDouble();
                    Shape sphere = new Sphere(sphereRadius);
                    displayShapeDetails(sphere);
                    break;

                case 5: // Cylinder
                    System.out.print("Enter radius of Cylinder: ");
                    double cylRadius = scan.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    double cylHeight = scan.nextDouble();
                    Shape cylinder = new Cylinder(cylRadius, cylHeight);
                    displayShapeDetails(cylinder);
                    break;

                case 6: // Equilateral Pyramid
                    System.out.print("Enter base side of Equilateral Pyramid: ");
                    double baseSide = scan.nextDouble();
                    System.out.print("Enter height of Pyramid: ");
                    double pyramidHeight = scan.nextDouble();
                    Shape pyramid = new EquilateralPyramid(baseSide, pyramidHeight);
                    displayShapeDetails(pyramid);
                    break;

                case 7:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scan.close();
    }

    // Function to display shape details
    public static void displayShapeDetails(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        if (shape instanceof Volume) {
            System.out.println("Volume: " + ((Volume) shape).calculateVolume());
        }
    }
}
