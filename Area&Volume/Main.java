/* Name - Vivek Hotchandani
PRN-22070126133
Batch - AIML-B3
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Welcome to Shape Calculator!");

        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }

            calculator.calculateShape(choice);
        }
        scanner.close();
    }
}
