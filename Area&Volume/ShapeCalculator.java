/* Name - Vivek Hotchandani
PRN-22070126133
Batch - AIML-B3
*/
import java.util.Scanner;

public class ShapeCalculator {
    public void calculateShape(int choice) {
        Scanner scanner = new Scanner(System.in);
        double area, perimeter, volume;
        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter radius of the circle:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.println("Enter length of the rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter width of the rectangle:");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.println("Enter side of the square:");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
            case 4:
                System.out.println("Enter radius of the sphere:");
                radius = scanner.nextDouble();
                shape = new Sphere(radius);
                break;
            case 5:
                System.out.println("Enter radius of the cylinder:");
                radius = scanner.nextDouble();
                System.out.println("Enter height of the cylinder:");
                double height = scanner.nextDouble();
                shape = new Cylinder(radius, height);
                break;
            case 6:
                System.out.println("Enter length of the pyramid's base:");
                double baseLength = scanner.nextDouble();
                System.out.println("Enter width of the pyramid's base:");
                double baseWidth = scanner.nextDouble();
                System.out.println("Enter height of the pyramid:");
                height = scanner.nextDouble();
                shape = new Pyramid(baseLength, baseWidth, height);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (shape != null) {
            shape.showShape(shape.getClass().getSimpleName());
            area = shape.calculateShape();
            perimeter = shape.calculatePerimeter();
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            if (shape instanceof Volume) {
                volume = ((Volume) shape).calculateVolume();
                System.out.println("Volume: " + volume);
            }
        }
    }
}
