package Problems;

import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate() {
        switch (operation.toLowerCase()) {
            case "1":
                System.out.println("Result: " + (a + b));
                break;
            case "2":
                System.out.println("Result: " + (a - b));
                break;
            case "3":
                System.out.println("Result: " + (a * b));
                break;
            case "4":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); // consume the newline
        System.out.print("Enter operation (1.add, 2.subtract, 3.multiply, 4.divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}

