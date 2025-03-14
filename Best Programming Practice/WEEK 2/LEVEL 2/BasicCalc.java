import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number (number1): ");
        double number1 = scanner.nextDouble();

        // Prompt the user for the second number
        System.out.print("Enter the second number (number2): ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0; // Initialize to 0, will be calculated later

        // Check for division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Print the results
        System.out.printf("The addition, subtraction, multiplication and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, addition, subtraction, multiplication, (number2 != 0 ? division : 0));

        // Close the scanner
        scanner.close();
    }
}