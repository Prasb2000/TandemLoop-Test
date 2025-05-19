import java.util.Scanner;

class Calculator {
    private double a, b;
    private String typeOfOperation;

    public Calculator(double a, double b, String typeOfOperation) {
        this.a = a;
        this.b = b;
        this.typeOfOperation = typeOfOperation.toLowerCase();
    }

    public double calculate() {
        switch (typeOfOperation) {
            case "add":
            case "+":
                return a + b;
            case "subtract":
            case "-":
                return a - b;
            case "multiply":
            case "*":
                return a * b;
            case "divide":
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation: " + typeOfOperation);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide or + - * /): ");
        String op = scanner.next();

        try {
            Calculator calc = new Calculator(a, b, op);
            double result = calc.calculate();
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
