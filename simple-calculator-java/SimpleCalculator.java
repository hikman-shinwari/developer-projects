import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==Welcome to the Simple Calculator==");
        System.out.println("Let's do some quick math together.");

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        try {
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("✅ Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("✅ Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("✅ Result: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Oops! Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    System.out.println("✅ Result: " + result);
                    break;
                default:
                    System.out.println("❌ Invalid operation. Please use +, -, * or /.");
            }
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        System.out.println("Thanks for using the calculator. Bye! 👋");
        scanner.close();
    }
}
