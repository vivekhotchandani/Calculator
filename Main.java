/* Name - Vivek Hotchandani
   PRN-22070126133
   Batch-AIML B3
  */

import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        Input input = new Input();

        Scanner scn = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Perform operations on a single pair of numbers");
        System.out.println("2. Perform operations on an array");

        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                // Get the first and second numbers
                double[] numbers = input.inputnumbers();
                double firstNumber = numbers[0];
                double secondNumber = numbers[1];

                // Display the menu for single pair of numbers
                System.out.println("Enter the Operation");
                System.out.println("+ for addition");
                System.out.println("- for subtraction");
                System.out.println("* for Multiplication");
                System.out.println("/ for division");

                // Get the operation for single pair of numbers
                char operation = scn.next().charAt(0);

                // Perform the operation
                switch (operation) {
                    case '+':
                        System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is " + calculator.addition(firstNumber, secondNumber));
                        break;
                    case '-':
                        System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " is " + calculator.subtraction(firstNumber, secondNumber));
                        break;
                    case '*':
                        System.out.println("The Multiplication of " + firstNumber + " and " + secondNumber + " is " + calculator.multiplication(firstNumber, secondNumber));
                        break;
                    case '/':
                        System.out.println("The Division of " + firstNumber + " and " + secondNumber + " is " + calculator.division(firstNumber, secondNumber));
                        break;
                    default:
                        System.out.println("Invalid operation. Please try again.");
                }
                break;

            case 2:
                // Get the array
                double[] array = input.ArrayInput();

                // Display the menu for the array
                System.out.println("Enter the Operation");
                System.out.println("+ for Sum of array");
                System.out.println("% for variance of array");
                System.out.println("$ for Standard deviation of array");

                // Get the operation for the array
                String arrayOperation = scn.next().toLowerCase(); // Convert to lowercase for case-insensitive comparison

                // Perform the operation on the array
                switch (arrayOperation) {
                    case "+":
                        System.out.println("The sum of the array is " + calculator.sumArray(array));
                        break;
                    case "%" :
                        System.out.println("The variance of the array is " + calculator.Var(array));
                        break;
                    case "$":
                        System.out.println("The standard deviation of the array is " + calculator.SD(array));
                        break;
                    default:
                        System.out.println("Invalid operation. Please try again.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
