package maven.demo.Assignment4;

import java.util.Scanner;

public class Calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(num1, num2);
        int subtractResult = calculator.subtract(num1, num2);
        int multiplyResult = calculator.multiply(num1, num2);
        int divideResult;
        try {
            divideResult = calculator.divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Sum: " + sumResult);
        System.out.println("Subtraction: " + subtractResult);
        System.out.println("Multiplication: " + multiplyResult);
        System.out.println("Division: " + divideResult);
    }
}
