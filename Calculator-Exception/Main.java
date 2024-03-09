/* Name - Vivek Hotchandani
PRN-22070126133
Batch - AIML-B3
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            Menu.printMenu();
            String choice = Menu.getChoice();

            if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;
            }

            try {
                double num1, num2;
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                switch (choice) {
                    case "1":
                        System.out.println("Result: " + Calculator.add(num1, num2));
                        break;
                    case "2":
                        System.out.println("Result: " + Calculator.subtract(num1, num2));
                        break;
                    case "3":
                        System.out.println("Result: " + Calculator.multiply(num1, num2));
                        break;
                    case "4":
                        System.out.println("Result: " + Calculator.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose from 1 to 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter valid numbers.");
                // Clear the scanner buffer
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Unexpected error occurred.");
            }
        }
        scanner.close();
    }
}
