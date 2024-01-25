# Calculator
The Calculator is a Program written in Java which comprises of simple  operations and operations on the array
## Overview
This Java program, named Calculator, is designed to perform various mathematical operations on either a pair of numbers or an array of numbers. The program is divided into three classes: `Calculator`, `Input`, and `Main`. It allows users to choose between performing operations on a pair of numbers or an array and provides a set of operations for each scenario.

## Class: Calculator
### Methods

1. addition(double firstnumber, double secondnumber)
   - Purpose: Performs addition on two given numbers.
   - Parameters:
     - `firstnumber`: The first number for addition.
     - `secondnumber`: The second number for addition.
   - Returns: The result of the addition operation.

2. subtraction(double firstnumber, double secondnumber)
   - Purpose: Performs subtraction on two given numbers.
   - Parameters:
     - `firstnumber`: The first number for subtraction.
     - `secondnumber`: The second number for subtraction.
   - Returns: The result of the subtraction operation.

3. multiplication(double firstnumber, double secondnumber)
   - Purpose: Performs multiplication on two given numbers.
   - Parameters:
     - `firstnumber`: The first number for multiplication.
     - `secondnumber`: The second number for multiplication.
   - Returns: The result of the multiplication operation.

4. division(double firstnumber, double secondnumber)
   - Purpose: Performs division on two given numbers.
   - Parameters:
     - `firstnumber`: The numerator for division.
     - `secondnumber`: The denominator for division.
   - Returns: The result of the division operation.

5. sumArray(double[] array)
   - Purpose: Calculates the sum of elements in an array.
   - Parameters:
     - `array`: The array of numbers.
   - Returns: The sum of the array elements.

6. Var(double[] array)
   - Purpose: Calculates the variance of elements in an array.
   - Parameters:
     - `array`: The array of numbers.
   - Returns: The variance of the array elements.

7. SD(double[] array)
   - Purpose: Calculates the standard deviation of elements in an array.
   - Parameters:
     - `array`: The array of numbers.
   - Returns: The standard deviation of the array elements.

8. squareRoot(double num)
   - Purpose: Custom square root function using Newton's method.
   - Parameters:
     - `num`: The number for which square root is calculated.
   - Returns: The square root of the given number.

# Class: Input

### Methods

1. inputnumbers()
   - Purpose: Takes user input for two numbers and returns them as an array.
   - Returns: An array containing two user-inputted numbers.

2. ArrayInput()
   - Purpose: Takes user input for the size and elements of an array and returns the array.
   - Returns: An array containing user-inputted elements.

## Class: Main

### Description

The `Main` class contains the main method where the program execution starts. It prompts the user to choose between performing operations on a pair of numbers or an array, and based on the choice, further prompts the user for specific operations.

### Methods

1. main(String[] args)
   - Purpose: The main method where the program execution starts. It handles user input, calls methods from the `Calculator` and `Input` classes, and performs the chosen mathematical operations.
## Conclusion

This Java program provides a simple and interactive way to perform basic mathematical operations on numbers and arrays. It includes error handling for invalid inputs and offers a set of operations for both individual numbers and arrays.














# Fibonacci_Series

Overview
This Java program, named Fibonacci, generates and prints the Fibonacci sequence up to a specified number of terms. It prompts the user to input the number of terms and then uses a recursive method to calculate and display the corresponding Fibonacci sequence.

Class: Fibonacci
Methods
main(String[] args)

Purpose: The main method where the program execution starts. It takes user input for the number of terms in the Fibonacci sequence and prints the sequence using the fibonacci method.
Parameters: args (unused)
Returns: Void
fibonacci(int n)

Purpose: Recursive method to calculate the Fibonacci number for a given index n.
Parameters:
n: The index for which the Fibonacci number is calculated.
Returns: The Fibonacci number at index n.
