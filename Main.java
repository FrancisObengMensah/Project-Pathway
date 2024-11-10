/*Name: Francis Obeng-Mensah
 * Class: IS147 (Spring 2024)
 * Professor: Anmol Dash
 * Class Final Project
 * Program Description:This Java program is a console-based calculator
 *  that performs basic arithmetic operations (addition, subtraction, multiplication, division). 
 * It uses the Scanner class for user input, control structures like switch and while loops, 
 * and methods for each operation within a Calculator class. 
 * The program maintains a history of calculations using an array and demonstrates object-oriented principles, 
 * formatted output, and proper coding practices
 *  */

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Calculator object
        Calculator calculator = new Calculator();
        // Array to store calculation history
        String history[] = new String[100];
        int historyIndex = 0;

        // this automates the loop for repeated calculations until the user decides to exit
        while (true) {
            // Get first number from the user
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            // Get second number from the user
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Get the operation from the user
            System.out.println("Choose operation: +, -, *, /");
            char operation = scanner.next().charAt(0);

            double result = 0;
            boolean validOperation = true;
            // Perform the selected operation
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    validOperation = false;
            }

            // If the operation was valid, print and store the result
            if (validOperation) {
                String resultString = String.format("Result of %.2f %c %.2f = %.2f", num1, operation, num2, result);
                history[historyIndex++] = resultString;
                System.out.println(resultString);
            }

            // Ask the user if they want to perform another calculation
            System.out.println("Do you want to perform another calculation? (yes/no)");
            String continueCalc = scanner.next();

            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Print the calculation history
        System.out.println("Calculation History:");
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(history[i]);
        }

        // Close the scanner
        scanner.close();
    }
}

// Calculator.java
class Calculator {
    // Constant for demonstration purposes
    private static final double PI = 3.141592653589793;

    // The Constructor
    public Calculator() {
        System.out.println("Calculator is ready to use.");
    }

    // The Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // The Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // The Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // The Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return a / b;
        
    }
}