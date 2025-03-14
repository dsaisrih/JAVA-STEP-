import java.util.Scanner;

public class DoubleOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + (b * c); // a + (b * c)
        double result2 = (a * b) + c; // (a * b) + c
        double result3 = c + (a / b); // c + (a / b)
        double result4 = (a % b) + c; // (a % b) + c (Note: % operator is not applicable for doubles)

        // Output results
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f\n",
                result1, result2, result3, result4);

        scanner.close();
    }
}